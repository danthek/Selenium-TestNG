
@tag
Feature: Purchas the order from Ecommerce website
  I want to use this template for my feature file

  Background:
  Given I landed on Ecommerce Page

  @tag2	
  Scenario Outline: Possitive test of submiting order
    Given I want to write a step with <name>
    When I check for the <value> tips of this course
    And  "GET A BETTER JOB" with help of my skills
    Then With those <value> tips I will <status> in  my career

    Examples: 
      | name     | value | status  |
      | Abraham  |     5 | success |
      | Berenice |     7 | Fail    |
