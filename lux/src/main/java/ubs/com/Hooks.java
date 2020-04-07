package ubs.com;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import io.qameta.allure.model.StepResult;
import io.restassured.RestAssured;

import java.util.UUID;


public class Hooks {

    @Before
    public void configureRestAssured() {
        RestAssured.useRelaxedHTTPSValidation();
    }

    @After
    public void tearDown(Scenario scenario) {
        StepResult result = new StepResult();
        result.setName(scenario.getName());
        Allure.getLifecycle().startStep(UUID.randomUUID().toString(), result);
        if (scenario.isFailed()) {
            result.setStatus(Status.FAILED);
        } else {
            result.setStatus(Status.PASSED);
        }
        Allure.getLifecycle().stopStep();
    }
}
