package com.bdd.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.bdd.stepdefinition.TestExecutor;

public class Common extends TestExecutor{
	
	
	
	public void clickElement(By locator) throws IOException
	{
	try
	{
		driver.findElement(locator).click();
	}
	
	catch (Exception e) {
	System.out.println("error occured");
	}
		
	}
	
	public void enterValue(By locator,String value)
	{
	try
	{
		clickElement(locator);
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
	}
	catch (Exception e) {
	}
	}
	
	
	public void validateRadioButton(By locator)
	{

		if(driver.findElement(locator).isSelected())
		{
			System.out.println("radio button is selected");
		}
		
		else
		{
			System.out.println("radio button is not selected");
		}
	}
	
	
	public void validateCheckBox(By locator)
	{

		if(driver.findElement(locator).isSelected())
		{
			System.out.println("check box is selected");
		}
		
		else
		{
			System.out.println("check box is not selected");
		}
	}


}
