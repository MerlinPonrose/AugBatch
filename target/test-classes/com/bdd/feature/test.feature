Feature: Test


@Title
Scenario: verify page title
Given Launch chrome and open the demosite url "http://demo.automationtesting.in/Register.html"
Then validate page title is "register"
When user close the browser


@phone
Scenario: Validdate phone number field
Given Launch chrome and open the demosite url "http://demo.automationtesting.in/Register.html"
When user click phonenumber and enter value "123445"
Then validate page title is "register"
When user close the browser