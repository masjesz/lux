package mainPage;

import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import ubs.com.common.UBSClient;
import ubs.com.common.session.Session;

@RequiredArgsConstructor
public class OpenMainPage {

    private final UBSClient client;

    public Response perform() {
        Session session = new Session();

        Response getUBSMainPageResponse = client.getUBSMainPage(session);

        Assertions.assertThat(getUBSMainPageResponse.getStatusCode()).isEqualTo(200);
        return getUBSMainPageResponse;
    }
}
