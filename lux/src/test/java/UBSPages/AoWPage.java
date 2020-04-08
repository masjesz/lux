package UBSPages;

import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import ubs.com.careers.UBSClient;
import ubs.com.common.session.Session;

@RequiredArgsConstructor
public class AoWPage {
    private final UBSClient client;

    public Response request() {
        Session session = new Session();

        Response getAoWPageResponse = client.getAoWPage(session);

        Assertions.assertThat(getAoWPageResponse.getStatusCode()).isEqualTo(200);
        return getAoWPageResponse;
    }
}
