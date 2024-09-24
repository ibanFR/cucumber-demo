Feature: Dependency Injection with CDI

  Use CDI Standalone Edition (CDI SE) API to provide dependency injection in to steps definitions.

  For each scenario, a new CDI container is started.
  If not present in the container, step definitions are added as unmanaged beans and dependencies are injected.


  Scenario: State is not shared between step definitions
    Given step definitions are added as unmanaged beans
    When I change the state of an object
    Then state has not been updated in the next step

  Scenario: Step definitions must be ApplicationScoped to share state
  To share state, step definitions and other support code must at least be application scoped.
    Given step definitions are application scoped
    When I perform an action that changes the state
    Then state is shared between step definitions

  Scenario: Support code must be application scoped to share state
  To share state, support code must at least be application scoped.
    Given I have 6 cukes in my belly
    And I eat 2 more cukes
    Then there are 8 cukes in my belly
