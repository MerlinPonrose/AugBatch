package com.bdd.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.bdd.stepdefinition.TestExecutor;

public class Registration extends TestExecutor{
	
	

	public String first_Name = "//input[@ng-model='FirstName']";
	public String last_Name = "//input[@ng-model='LastName']";
	public String Address = "//textarea[@ng-model='Adress']";
	public String email_Address = "//input[@type='email']";
	public String maleRadioButton = "//input[@value='Male']";
	public String checkbox_cricket = "//input[@value='Cricket']";
	public String phone_Number = "//input[@type='tel']";
			
			
	public void enterFirstName(String firstName)
	{
		com.enterValue(By.xpath(first_Name), firstName);
	}
	
	
	public void enterLastName(String lastName)
	{
		com.enterValue(By.xpath(last_Name), lastName);
	}

	
	public void enterAddress(String address)
	{
		com.enterValue(By.xpath(Address), address);
	}
	
	
	public void clickRadioButton(String radiobutton) throws IOException
	{
		com.clickElement(By.xpath("//input[@value='"+radiobutton+"']"));
	}
	
	public void validate_RadioButton(String radiobutton)
	{
		com.validateRadioButton(By.xpath("//input[@value='"+radiobutton+"']"));
	}
	
	public void phoneNumber(String phone) throws IOException
	{
		
		com.enterValue(By.xpath(phone_Number),phone);
	}
	

}
