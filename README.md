# Cucumber-JVM Weld Example

Maven project to test Cucumber-JVM BDD library. 
Includes Weld  dependency injection (DI) module to organize the code better and to share state between step definitions.

## How to run
Execute `mvn clean install` to build the project and run the tests.

## Documentation
https://cucumber.io/docs/installation/java/

## Reporting
The project uses the Cucumber reporting plugin to generate reports in the `target/cucumber-reports` directory.

See [cucumber-reporting-plugin](https://gitlab.com/jamietanna/cucumber-reporting-plugin) for more information.

Ideally, the reports should display the features grouped by the capability they are testing.
