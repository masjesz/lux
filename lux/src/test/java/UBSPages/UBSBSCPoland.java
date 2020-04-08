package UBSPages;

import io.restassured.http.Cookie;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import ubs.com.careers.UBSClient;
import ubs.com.careers.model.SearchContentAbstractsRequest;
import ubs.com.common.Client;
import ubs.com.common.session.Session;

@RequiredArgsConstructor
public class UBSBSCPoland extends Client {

    private final UBSClient client;

    public Response select() {
        Session session = new Session();
        Response response = client.getGetUBSAoWPageEndpoint().getLastResponse();

        session.resetSpecBuilder();
        SearchContentAbstractsRequest request = SearchContentAbstractsRequest.create();

        session.getRequestSpecBuilder().setBody(request);

        Cookie geo_cookie = response.getDetailedCookie("geo-country");

        session.getRequestSpecBuilder().addCookie(geo_cookie);

        return client.postUBSBSCPoland(session);
    }

}
