package com.ibanfr;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/cucumber-reports/index.html")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "not @wip")
public class AllCucumberTests {
}
