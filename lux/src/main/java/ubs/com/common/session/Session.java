package ubs.com.common.session;

import io.restassured.builder.RequestSpecBuilder;
import lombok.Data;

@Data
public class Session {

    private static final String COUNTRY = "pl";
    private static final String GEO_COUNTRY = "Pl";
    private RequestSpecBuilder requestSpecBuilder;

    public Session() {
        this.requestSpecBuilder = new RequestSpecBuilder();
    }

    public void addCountryCookies() {
//        Cookies cookies = new Cookies();
//        this.requestSpecBuilder.addCookies(cookies);
    }
}
