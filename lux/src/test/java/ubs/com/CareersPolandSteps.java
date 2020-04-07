package ubs.com;

import io.cucumber.java.en.Given;
import lombok.RequiredArgsConstructor;
import mainPage.OpenMainPage;

@RequiredArgsConstructor
public class CareersPolandSteps {

    private final OpenMainPage openMainPage;

    @Given("a user opens main Page")
    public void userOpensMainPage() {
        openMainPage.perform();

    }
}
