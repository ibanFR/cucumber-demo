package com.ibanfr.steps;

import com.ibanfr.Belly;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.inject.Inject;

public class MyStepdefs {

    @Inject
    private Belly belly;

    @Given("Test conditionn")
    public void testConditionn() {
        belly.setCukes(1);
    }

    @When("an action is performed")
    public void anActionIsPerformed() {
    }

    @Then("expected output")
    public void expectedOutput() {
    }
}
