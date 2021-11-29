$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:demosite.feature");
formatter.feature({
  "name": "Demosite Registration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Demosite"
    }
  ]
});
formatter.scenario({
  "name": "validate fields in register page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Demosite"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Launch chrome and open the demosite url \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoSite.launch_chrome_and_open_the_demosite_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the firstName and enter value \"Vcentry\"",
  "keyword": "When "
});
formatter.match({
  "location": "DemoSite.user_click_the_firstName_and_enter_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the lastName and enter value \"technologies\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoSite.user_click_the_lastName_and_enter_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the addree and enter value \"Guindy\"",
  "keyword": "And "
});
formatter.match({
  "location": "DemoSite.user_click_the_addree_and_enter_value(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click \"FeMale\" radio button",
  "keyword": "And "
});
formatter.match({
  "location": "DemoSite.user_click_radio_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate \"FeMale\" radio button is selected",
  "keyword": "Then "
});
formatter.match({
  "location": "DemoSite.user_validate_radio_button_is_selected(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate page title is \"register\"",
  "keyword": "And "
});
formatter.match({
  "location": "Test.validate_page_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user close the browser",
  "keyword": "When "
});
formatter.match({
  "location": "Test.user_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate it is close",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Validdate phone number field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Demosite"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Launch chrome and open the demosite url \"http://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "DemoSite.launch_chrome_and_open_the_demosite_url(String)"
});
