package com.ibanfr.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jakarta.enterprise.context.ApplicationScoped;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ApplicationScoped
public class TemplateSteps {

    boolean condition;

    @Given("a precondition")
    public void aPrecondition() {
        condition = false;
    }

    @When("an action is performed")
    public void anActionIsPerformed() {
        condition = true;
        System.out.println("Action performed!");
    }

    @Then("expected system behavior")
    public void descriptionOfExpectedSystemBehavior() {
        assertTrue(condition);
    }
}
