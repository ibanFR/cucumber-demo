package com.ibanfr.cucumber.jakartaCdi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jakarta.enterprise.context.ApplicationScoped;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ApplicationScoped
public class StateIsSharedSteps {

    boolean booleanField = false;

    @Given("step definitions are application scoped")
    public void stepDefinitionsAreAnnotatedWithApplicationScoped() {
        System.out.println("class is ApplicationScoped");
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
