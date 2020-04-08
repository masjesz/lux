package ubs.com.careers;

import io.restassured.response.Response;
import lombok.Getter;
import ubs.com.common.session.Session;
import ubs.com.careers.endpoints.GetUBSAofPageEndpoint;
import ubs.com.careers.endpoints.GetUBSMainPageEndpoint;
import ubs.com.careers.endpoints.PostUBSBSCPolandEndpoint;

@Getter
public class UBSClient {

    GetUBSMainPageEndpoint getUBSMainPageEndpoint = new GetUBSMainPageEndpoint();
    GetUBSAofPageEndpoint getUBSAoWPageEndpoint = new GetUBSAofPageEndpoint();
    PostUBSBSCPolandEndpoint postUBSBSCPolandEndpoint = new PostUBSBSCPolandEndpoint();

    public Response getUBSMainPage(Session session) {
        return getUBSMainPageEndpoint.getUBSMain(session);
    }

    public Response getAoWPage(Session session) {
        return getUBSAoWPageEndpoint.getAoW(session);
    }

    public Response postUBSBSCPoland(Session session) {
        session.addContentHeaders();
        return postUBSBSCPolandEndpoint.postUBSBSCPoland(session);
    }
}
