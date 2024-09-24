package com.ibanfr.cucumber.jakartaCdi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class StateIsNotSharedSteps {

    //variable holding state
    boolean condition;

    @Given("step definitions are added as unmanaged beans")
    public void stateIsNotSharedBetweenStepDefinitions() {
        condition = false;
    }

    @When("I change the state of an object")
    public void iChangeTheStateOfAnObject() {
        condition = true;
    }

    @Then("state has not been updated in the next step")
    public void stateHasNotBeenUpdatedInTheNextStep() {
        assertFalse(condition);
    }
}
