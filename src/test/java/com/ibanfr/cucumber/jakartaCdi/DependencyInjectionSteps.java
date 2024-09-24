package com.ibanfr.cucumber.jakartaCdi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import jakarta.inject.Inject;

public class DependencyInjectionSteps {

    @Inject
    private Belly belly;

    @Given("a precondition")
    public void aPrecondition() {
        belly.setCukes(1);
    }

    @When("an action is performed")
    public void anActionIsPerformed() {
    }

    @Then("expected output")
    public void expectedOutput() {
    }
}
