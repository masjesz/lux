package ubs.com.model;


import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetUBSMainPageRequest {

    public void getUBS() {

        RequestSpecification getUBS = RestAssured.given();
        Response response = getUBS.request(Method.GET);


//    public static GetUBSMainPageRequest create() {
//        return new GetUBSMainPageRequest(
    }
}
