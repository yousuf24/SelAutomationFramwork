@Google
Feature: Title of Google
  I want to use this template for my feature file

  @Google @smoke
  Scenario: Title check
    Given I launch the "chrome" browser
    When I search for "https://google.com"
    Then I should be able to Assert title as "Google"
    

  @Google @regression
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
