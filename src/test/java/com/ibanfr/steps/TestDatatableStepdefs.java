package com.ibanfr.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDatatableStepdefs {
    @Given("some input data:")
    public void someInputData(DataTable table) {
        System.out.println("input data");
        table.asMaps()
             .forEach(columns -> {
                 System.out.println("column1:"+ columns.get("column1"));
                 System.out.println("column2:"+ columns.get("column2"));
             });
    }

    @When("I perform some action")
    public void iPerformSomeAction() {
    }

    @Then("I expect a result:")
    public void iExpectAResult(DataTable table) {
        System.out.println("expected result="+table.asList().get(0));
    }
}
