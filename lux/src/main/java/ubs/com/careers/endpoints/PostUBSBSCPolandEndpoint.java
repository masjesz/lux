package ubs.com.careers.endpoints;

import io.restassured.response.Response;
import ubs.com.common.Endpoint;
import ubs.com.common.Protocol;
import ubs.com.common.session.Session;

public class PostUBSBSCPolandEndpoint extends Endpoint {

    private static final String PATH = "/bin/ubs/caas/v1/searchContentAbstracts";

    public PostUBSBSCPolandEndpoint() {
        super(PATH, Protocol.https);
    }

    public Response postUBSBSCPoland(Session session) {
        return post(session.getRequestSpecBuilder().build());
    }
}
