package ubs.com.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

import static io.restassured.RestAssured.with;


public abstract class Endpoint {

    Logger logger = LoggerFactory.getLogger(Endpoint.class);

    protected Response lastResponse;
    protected String path;
    protected Protocol protocol;
    private URL url;

    @Getter
    protected ObjectMapper om;

    protected Endpoint(String path, Protocol protocol) {
        this.path = path;
        this.protocol = protocol;
        this.om = new ObjectMapper();
        om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); //This I find in internet (to avoid InvalidDefinitionException:)
    }

    public URL getURL() {
        if (url == null) {
            try {
                url = new URL(protocol.toString(), "www.ubs.com", path); //https:www.ubs.com
            } catch (MalformedURLException exception) {
                throw new RuntimeException(exception);
            }
        }
        return url;
    }

    public Response getLastResponse() {
        return lastResponse;
    }


    protected Response get(RequestSpecification spec) {
        lastResponse = with()
                .spec(spec)
                .get(getURL());
        return lastResponse;
    }

    protected Response post(RequestSpecification spec) {
        lastResponse = with()
                .spec(spec)
                .contentType(ContentType.JSON)
                .post(getURL());
        logger.debug(
                String.format("POST status: %s, response: %s", lastResponse.statusCode(), lastResponse.asString()));
        return lastResponse;
    }
}
