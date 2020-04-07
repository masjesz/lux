package ubs.com.common;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.MalformedURLException;
import java.net.URL;

import static io.restassured.RestAssured.with;


public abstract class Endpoint {
    protected String path;
    protected Protocol protocol;
    private Response lastResp;
    private URL url;

    protected Endpoint(String path, Protocol protocol) {
        this.path = path;
        this.protocol = protocol;
    }

    public URL getURL() {
        if (url == null) {
            try {
                url = new URL(protocol.toString(), "ubs.com", path); //https:www.ubs.com
            } catch (MalformedURLException exception) {
                throw new RuntimeException(exception);
            }
        }
        return url;
    }

    protected Response get(RequestSpecification spec) {
        lastResp = with()
                .spec(spec)
                .get(getURL());
        return lastResp;
    }
}
