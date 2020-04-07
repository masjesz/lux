package ubs.com.common;

import io.restassured.response.Response;
import ubs.com.common.session.Session;
import ubs.com.endpoints.GetUBSMainPageEndpoint;

public class UBSClient {

    GetUBSMainPageEndpoint getUBSMainPageEndpoint = new GetUBSMainPageEndpoint();

    public Response getUBSMainPage(Session session) {
        return getUBSMainPageEndpoint.getUBSMain(session);
    }
}
