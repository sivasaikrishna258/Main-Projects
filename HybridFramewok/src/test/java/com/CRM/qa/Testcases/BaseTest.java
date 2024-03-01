package com.CRM.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.CRM.qa.BaseClass.TestBase;

public class BaseTest extends TestBase{

	public BaseTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
