package com.bdd.utils;

import com.bdd.stepdefinition.TestExecutor;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestExecutor{
	
//global	
	@Before(order=1)
	public void test()
	{
		System.out.println("precondition1");
	}
	
	@Before(order=2)
	public void test3()
	{
		System.out.println("precondition2");
	}
	
	
	@After(order=1)
	public void test2()
	{
		driver.quit();
	}
	
	
	@After(order=2)
	public void test4()
	{
		System.out.println("driver closed");
	}

	
	@Before("@phone")
	public void test5()
	{
		System.out.println("pre codition for test case phone numver");
	}
	
	
	@After("@Title")
	public void test6()
	{
		System.out.println("post condition for page tiltle");
	}
	
}
