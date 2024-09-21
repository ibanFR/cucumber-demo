package com.ibanfr.steps;

import com.ibanfr.Belly;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import jakarta.inject.Inject;
public class MyStepdefs {

    @Inject
    private Belly belly;

    @Given("Test condition")
    public void testCondition() {
        belly.setCukes(1);
    }

    @When("an action is performed")
    public void anActionIsPerformed() {
    }

    @Then("expected output")
    public void expectedOutput() {
    }
}
