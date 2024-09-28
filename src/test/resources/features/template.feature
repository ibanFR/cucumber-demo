Feature: A high-level description of the software feature

  The purpose of the Feature is to provide a high-level description of a software feature, and to group related scenarios.
  It contains a set of acceptance criteria, automated scenarios that demonstrate and verify how the feature works.

  > These description lines are ignored by Cucumber at runtime, but are available for reporting.
  > Their purpose is to provide a place for you to document important aspects of the feature, such as a brief explanation and a list of business rules (general acceptance criteria).
  > Free-form descriptions can also be placed underneath Example/Scenario, Background, Scenario Outline and Rule.
  > You can write anything you like, as long as no line starts with a keyword.
  > Descriptions can be in the form of Markdown - formatters.

  **A comprehensive description of what the features does should be included in here**.
  Use the language of the business domain and avoid any technical details on how the system works.

  Scenario: A concrete example that illustrates a business rule
  A brief explanation of the business rules (general acceptance criteria) for the scenario should be included here.

  An Scenario is a concrete example that illustrates a business rule. It consists of a list of steps.

  You can have as many steps as you like, but we recommend 3-5 steps per example.
  Each step starts with Given, When, Then, And, or But.

  Having too many steps will cause the example to lose its expressive power as a specification and documentation.

    Given a precondition
    When an action is performed
    Then expected system behavior