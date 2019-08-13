Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: Title of your new scenario
    Given user navigate the browser
    When user click the add customer using keys
    And add traiff details using keys

  Scenario: Title of your new scenario
    Given user navigate the browser
    When user click the add customer using 1dlist
    And add traiff details using 1dlist

  Scenario: Title of your new scenario
    Given user navigate the browser
    When user click the add customer using 1dmap
    And add traiff details using 1dmap

  Scenario: Title of your new scenario
    Given user navigate the browser
    When user click the add customer using 2dlist
    And add traiff details using 2dlist

  Scenario: Title of your new scenario
    Given user navigate the browser
    When user click the add customer using 2dmap
    And add traiff details using 2dmap

  Scenario Outline: Title of your new scenario outline
    Given user navigate the browser
    When user click add customer"<fname>","<lname>","<email>","<address>","<phno>"
    Then I validate the outcomes for all
    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
