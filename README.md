# Cucumber-JVM Weld Example

Maven project to test Cucumber-JVM BDD library. 
Includes Weld  dependency injection (DI) module to organize the code better and to share state between step definitions.

## How to run
Execute `mvn clean install` to build the project and run the tests.

## Documentation
https://cucumber.io/docs/installation/java/

## Reporting
https://cucumber.io/docs/cucumber/reporting

The project includes a set of reporting plugins to generate reports in different formats.

There is one branch for every third-party reporting plugin.

### Cucumber Reports Service
Cucumber Reports Service can be configured on junit-platform.properties file.

To enable the service, set the following properties:

```properties
cucumber.publish.enabled=true
```

### Built-in reporter plugins
Generates local reports using one of the following built-in reporter plugins (also known as “formatters”):

- message
- progress
- pretty
- html
- json
- rerun
- junit
- testng

#### Third-party plugins
The project includes samples for a set of reporting plugins to generate reports in different formats 
(there is one branch for every third-party reporting plugin).

Ideally, the reports should display the features grouped by the capability they are testing.

## TODO
- [ ] Publish report to Github pages
- [ ] Add new capabilities to the project
