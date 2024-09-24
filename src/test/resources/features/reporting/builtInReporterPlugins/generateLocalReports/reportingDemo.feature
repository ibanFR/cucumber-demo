Feature: Generate report

  This feature showcase how markdown can be used in feature files to create living documentation for the project.

  > These description lines are ignored by Cucumber at runtime, but are available for reporting.
  > Their purpose is to provide a place for you to document important aspects of the feature, such as a brief explanation and a list of business rules (general acceptance criteria).
  > Free-form descriptions can also be placed underneath Example/Scenario, Background, Scenario Outline and Rule.
  > You can write anything you like, as long as no line starts with a keyword.
  > Descriptions can be in the form of Markdown - formatters.

  **A comprehensive description of what the features does should be included in here**.
  Use the language of the business domain and avoid any technical details on how the system works.

  @wip
  Scenario: Use a reporter plugin for Cucumber
  A brief explanation of the business rules (general acceptance criteria) for the scenario should be included here.

  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer ut augue et lacus gravida consectetur id in ante.
  In rutrum leo ut neque finibus bibendum ut non ex. Nulla commodo elit eget ipsum lacinia pellentesque. Suspendisse
  tempor, eros vitae aliquet finibus, nisi augue cursus leo, ut ultrices neque dui id elit. Aliquam erat volutpat.
  Aliquam congue dictum augue, ac gravida tellus imperdiet sit amet. Pellentesque molestie facilisis mi sit amet tempor.
  Praesent dictum nibh nibh, ac efficitur arcu laoreet a.

    Given I'm using a reporter plugin for Cucumber
    When all the scenarios are executed
    Then a report should be generated
    And markdown should be used to format the report