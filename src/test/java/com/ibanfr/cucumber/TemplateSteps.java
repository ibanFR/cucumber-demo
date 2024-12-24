package com.ibanfr.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jakarta.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ApplicationScoped
public class TemplateSteps {

    Logger logger = LoggerFactory.getLogger(TemplateSteps.class);

    boolean condition;

    @Given("a precondition")
    public void aPrecondition() {
        condition = false;
    }

    @When("an action is performed")
    public void anActionIsPerformed() {
        condition = true;
        logger.info("Action performed!");
    }

    @Then("expected system behavior")
    public void descriptionOfExpectedSystemBehavior() {
        assertTrue(condition);
    }
}
