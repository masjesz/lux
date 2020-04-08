package ubs.com;

import UBSPages.AoWPage;
import UBSPages.OpenMainPage;
import UBSPages.UBSBSCPoland;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import ubs.com.careers.UBSClient;


@RequiredArgsConstructor
public class CareersPolandSteps {

    private final OpenMainPage openMainPage;
    private final AoWPage aoWPage;
    private final UBSBSCPoland ubsbscPoland;
    private final UBSClient client;

    @Given("a user opens main Page")
    public void userOpensMainPage() {
        openMainPage.request();
    }

    @And("the user goes to Areas-of-Work")
    public void userGoesToAoWPage() {
        aoWPage.request();
    }

    @When("the user selects UBS Business Solutions Centers Poland")
    public void userSelectsUBSBSCPoland() {
        ubsbscPoland.select();
    }

    @Then("^the user can open UBS Business Solutions Centers Poland Page")
    public void responseShowsCorrectContent() {
        Response lastResponse = client.getPostUBSBSCPolandEndpoint().getLastResponse();
        Assertions.assertThat(lastResponse.getStatusCode()).isEqualTo(200);
    }

}
