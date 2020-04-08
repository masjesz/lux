package ubs.com.common.session;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import lombok.Data;

@Data
public class Session {

    private static final String COUNTRY = "pl";
    private static final String GEO_COUNTRY = "Pl";
    private RequestSpecBuilder requestSpecBuilder;

    public Session() {
        this.requestSpecBuilder = new RequestSpecBuilder();
    }

    public void addContentHeaders() {
        this.requestSpecBuilder.addHeader("accept-language", "pl-PL,pl;q=0.9,en-US;q=0.8,en;q=0.7");
//        this.requestSpecBuilder.addHeader("content-length", "668");
        this.requestSpecBuilder.addHeader("content-type", "application/json");
        this.requestSpecBuilder.addHeader("cookie", "country=pl; language=pl; geo-country=PL; BIGipServer~pa-1469-ubs0bss0001csa21ad1286~pl-ubs0-www-tmp.inter.cmuintra.ch-https=rd1469o00000000000000000000ffff0a6cf626o443; ubs_cookie_settings_2.0=0-3-2-1; sat_track=true");
        this.requestSpecBuilder.addHeader("host", "www.ubs.com");
//TODO: create SessionHeaders class for above (run of time ;-) )
    }

    public void resetSpecBuilder() {
        this.requestSpecBuilder = new RequestSpecBuilder()
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter());
    }

}
