package com.ibanfr.cucumber.datatable;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatatableSteps {

    private static final Logger logger = LoggerFactory.getLogger(DatatableSteps.class);

    @Given("some input data:")
    public void someInputData(DataTable table) {
        logger.info("input data");
        table.asMaps()
             .forEach(columns -> {
                 logger.info("column1={}", columns.get("column1"));
                 logger.info("column2={}", columns.get("column2"));
             });
    }

    @When("I perform some action")
    public void iPerformSomeAction() {
        logger.info("some action performed");
    }

    @Then("I expect a result:")
    public void iExpectAResult(DataTable table) {
        logger.info("expected result={}",table.asList().get(0));
    }
}
