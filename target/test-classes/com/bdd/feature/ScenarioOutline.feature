@ScenarioOutile
Feature: scenario outline

@Smoke @Regression
Scenario Outline: validate register page with multiple data
Given Launch chrome and open the demosite url "http://demo.automationtesting.in/Register.html"
When user click the firstName and enter value "<FirstName>"
And user click the lastName and enter value "<LastName>"
And user click the addree and enter value "<Address>"
And user click "<Gender>" radio button
Then user validate "<Gender>" radio button is selected
And validate page title is "register"
When user close the browser

Examples:
| FirstName|LastName|Address| Gender|
|Vcentry|technologies|Guindy|FeMale|


