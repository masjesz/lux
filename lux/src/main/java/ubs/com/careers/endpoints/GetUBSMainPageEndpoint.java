package ubs.com.careers.endpoints;

import io.restassured.response.Response;
import ubs.com.common.Endpoint;
import ubs.com.common.Protocol;
import ubs.com.common.session.Session;


public class GetUBSMainPageEndpoint extends Endpoint {

    private static final String PATH = "/";
    private static final Protocol PROTOCOL = Protocol.https;

    public GetUBSMainPageEndpoint() {
        super(PATH, PROTOCOL);
    }

    public Response getUBSMain(Session session) {
        return get(session.getRequestSpecBuilder().build());
    }
}
