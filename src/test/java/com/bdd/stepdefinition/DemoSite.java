package com.bdd.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoSite extends TestExecutor{
	
	
	@Given("Launch chrome and open the demosite url {string}")
	public void launch_chrome_and_open_the_demosite_url(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karen Amy\\eclipse-workspace\\Framework_DataDriven\\exe\\chromedriver.exe");		driver = new ChromeDriver();
		driver= new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the browser
	
		
		
		driver.get(url); //open URL
	  
	}

	@When("user click the firstName and enter value {string}")
	public void user_click_the_firstName_and_enter_value(String firstName) {
		
		reg.enterFirstName(firstName);
		
	  
	}

	@When("user click the lastName and enter value {string}")
	public void user_click_the_lastName_and_enter_value(String lastName) {
		
		
		reg.enterLastName(lastName);
	  
	}

	@When("user click the addree and enter value {string}")
	public void user_click_the_addree_and_enter_value(String address) {
		
		reg.enterAddress(address);
	  
	}

	@When("user click {string} radio button")
	public void user_click_radio_button(String radiobutton) throws IOException {
		reg.clickRadioButton(radiobutton);
	  
	}

	@Then("user validate {string} radio button is selected")
	public void user_validate_radio_button_is_selected(String radiobutton) {
	  
		reg.validate_RadioButton(radiobutton);
	}

@Given("open the browser")
public void open_browser()

{
	
}

}
