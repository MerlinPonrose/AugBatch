package com.bdd.stepdefinition;

import java.io.IOException;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test extends TestExecutor{


@Then("validate page title is {string}")
public void validate_page_title_is(String title) {
  
	
String currentTitle = 	driver.getTitle();

if(currentTitle.equalsIgnoreCase(title))
{
	System.out.println("Titke equal");
}
else
{
	System.out.println("not equal");
}


}

@When("user click phonenumber and enter value {string}")
public void user_click_phonenumber_and_enter_value(String phone) throws IOException {
   reg.phoneNumber(phone);
}

@When("user close the browser")
public void user_close_the_browser()
{
	driver.quit();
}

	
}
