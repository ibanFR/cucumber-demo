package com.ibanfr.cucumber.jakartaCdi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ApplicationScoped
public class StateIsSharedSteps {

    Logger logger = LoggerFactory.getLogger(StateIsSharedSteps.class);

    boolean booleanField = false;

    @Given("step definitions are application scoped")
    public void stepDefinitionsAreAnnotatedWithApplicationScoped() {
        logger.info("class is ApplicationScoped");
    }

    @When("I perform an action that changes the state")
    public void iPerformAnActionThatChangesTheState() {
        booleanField = true;
    }

    @Then("state is shared between step definitions")
    public void stateIsSharedBetweenStepDefinitions() {
        assertTrue(booleanField);
    }
}
