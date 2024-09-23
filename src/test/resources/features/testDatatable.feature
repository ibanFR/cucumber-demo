Feature: Showcase to convert a cucumber Datatable attribute

  Scenario: Basic Datatable
    Given some input data:
      | column1              | column2               |
      | description column 1 | description column 2 |
    When I perform some action
    Then I expect a result:
      | expected result in text format |