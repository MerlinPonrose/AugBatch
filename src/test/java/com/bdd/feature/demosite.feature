@Demosite
Feature: Demosite Registration

Background:
Given Launch chrome and open the demosite url "http://demo.automationtesting.in/Register.html"
Then validate page title is "register"

@Regression
Scenario: validate fields in register page
When user click the firstName and enter value "Vcentry"
And user click the lastName and enter value "technologies"
And user click the addree and enter value "Guindy"
And user click "FeMale" radio button
Then user validate "FeMale" radio button is selected
And validate page title is "register"
When user close the browser


@Smoke @Regression
Scenario: Validdate phone number field
When user click phonenumber and enter value "123445"
Then validate page title is "register"
When user close the browser

@Title
Scenario: verify page title
Then validate page title is "register"
When user close the browser

