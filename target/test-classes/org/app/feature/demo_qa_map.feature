Feature: Open DemoQA page and fill details
  

  @tag1
  Scenario: Title of your scenario
   Given Open the webpage "https://demoqa.com/automation-practice-form"
    When Enter the below details
    | firstname | lastname | phoneumber | mailID 		    | address | Subject |
    | Naven   	|	Raj			 | 1234512345 | xyz@gmail.com | Chennai | Maths   |
    And Click the gender
    And click the hobbie
    And enter the month "July" and year "2000"
    And select the state
    And select the city
    And upload a picture "C:\Users\Navenraj\Pictures\Screenshots\Screenshot 2024-03-24 072713.png"
 		And click submit button
    Then Validation done
    