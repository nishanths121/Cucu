Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given user launch the browser
    When user click the add customer using sendkeys
    Then I validate the outcomes

  Scenario: Title of your scenario
    Given user launch the browser
    When user click the add customer using onedlist
   |Nishanth|Samraj|nishanthsamraj@gmail.com|Coimbatore|9751200131|
    Then I validate the outcomes

  Scenario: Title of your scenario
    Given user launch the browser
    When user click the add customer using onedmap
      |fname|Nishanth|
      |lname|Samraj|
      |email|Nishanthsamrajj@gmail.com|
      |address|Coimbatore|
      |phno|9751200131|
    Then I validate the outcomes

  Scenario: Title of your scenario
    Given user launch the browser
    When user click the add customer using twodlist
   	|fname|lname|email|address|phno|
		|Vaishu|Varun|vaishu@gmail.com|Coimbatore|9874563210|
		|Avin|Avick|avaick@gmail.com|Coimbatore|9630258741|
	  Then I validate the outcomes

  Scenario: Title of your scenario
    Given user launch the browser
    When user click the add customer using twodmap
		|fname|lname|email|address|phno|
		|Vaishu|Varun|vaishu@gmail.com|Coimbatore|9874563210|
		|Avin|Avick|avaick@gmail.com|Coimbatore|9630258741|
		Then I validate the outcomes

  Scenario Outline: 
    Given user launch the browser
    When user clcik the add customer"<fname>","<lname>","<email>","<address>","<phno>"
    Then I validate the outcomes

    Examples: 
      | fname    | lname  | email                    | address    | phno       |
      | Nishanth | Samraj | nishanthsamraj@gamil.com | Coimbatore | 9751200131 |
      | vaishu   | varun  | vaishu@gmail.com         | Coimbatore | 9874563210 |
