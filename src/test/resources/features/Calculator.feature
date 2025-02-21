Feature: Adding numbers with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to add numbers using a Calculator

  Scenario: Add two positive numbers
    Given a Calculator
    When i add 1 and 1
    Then the result should be 2

  Scenario: Add a positive and negative number
    Given a Calculator
    When i add 1 and -1
    Then the result should be 0

  Scenario: Add two negative numbers
    Given a Calculator
    When i add -1 and -1
    Then the result should be -2

  Scenario: Multiply two positive numbers
    Given a Calculator
    When i multiply 1 and 1
    Then the result should be 1

  Scenario: Multiply two negative numbers
    Given a Calculator
    When i multiply -1 and -1
    Then the result should be 1

  Scenario: Add a positive and negative number
    Given a Calculator
    When i multiply 1 and -1
    Then the result should be -1
