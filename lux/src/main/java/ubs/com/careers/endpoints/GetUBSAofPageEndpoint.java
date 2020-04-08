package ubs.com.careers.endpoints;

import io.restassured.response.Response;
import ubs.com.common.Endpoint;
import ubs.com.common.Protocol;
import ubs.com.common.session.Session;

public class GetUBSAofPageEndpoint extends Endpoint {

    private static final String PATH = "/global/en/about_ubs/careers/our-areas-of-work.html";
    private static final Protocol PROTOCOL = Protocol.https;

    public GetUBSAofPageEndpoint() {
        super(PATH, PROTOCOL);
    }


    public Response getAoW(Session session) {
        {
            return get(session.getRequestSpecBuilder().build());
        }
    }
}
