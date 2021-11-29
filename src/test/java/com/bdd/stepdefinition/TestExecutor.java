package com.bdd.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.bdd.pages.Registration;
import com.bdd.utils.Common;

import cucumber.api.java.Before;



public class TestExecutor {
	
	public static WebDriver driver;
	
	public static com.bdd.utils.Common com = new Common();
	
	
	public static Registration reg = new Registration();


}
