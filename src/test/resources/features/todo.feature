Feature: Todo feature
  Scenario: Should be able to add todo
    Given User is in the todo page
    When User adds a new todo
    Then todo should be added correctly