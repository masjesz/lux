package ubs.com.careers.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SearchContentAbstractsRequest {

    /* Normally I would build payload, but it would need so much more time to do this than 5 hours
        private String contentTypes;
        private String language;
        private String tagSelectionLogic;
        private Integer maxResult;
        private Integer offset;
        private Boolean useLanguageFallback;
        private String includePaths;
        private String excludePaths;
        private String siteContext;
        private String excludeResult;
        private String articleDisplayPage;
        private String nrNewsDisplayPage;
        private String marketNewsDisplayPage;
        private String newsDisplayPage;
    */
    private static final String postPayload = "{\\\"contentTypes\\\":[\\\"ARTICLE\\\"],\\\"language\\\":\\\"en\\\",\\\"tagSelectionLogic\\\":\\\"(magazine:ubs-keyhole/locations/poland)\\\",\\\"maxResult\\\":3,\\\"offset\\\":0,\\\"useLanguageFallback\\\":true,\\\"includePaths\\\":[\\\"/content/sites/global/en/careers/meet-us/our-people\\\",\\\"/content/sites/global/en/careers/meet-us/our-work/2018/hr-team-krakow-part-2\\\",\\\"/content/sites/global/en/careers/meet-us/our-people/2019/group-general-counsel-poland\\\",\\\"/content/sites/global/en/careers/meet-us/our-people/2018/quality-assurance-piotr\\\"],\\\"excludePaths\\\":[],\\\"siteContext\\\":\\\"/content/sites/global/careers/bsc-poland\\\",\\\"excludeResult\\\":\\\"\\\",\\\"articleDisplayPage\\\":\\\"\\\",\\\"nrNewsDisplayPage\\\":\\\"\\\",\\\"marketNewsDisplayPage\\\":\\\"\\\",\\\"newsDisplayPage\\\":\\\"\\\"}";
    private String payload;

    public static SearchContentAbstractsRequest create() {
        return SearchContentAbstractsRequest.builder()
                .payload(postPayload)
                .build();
    }

}


