package com.CRM.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class ContactsPageTest extends TestBase{

	LoginPage loginpage;;
	HomePage homepage;
	ContactsPage contactspage;


	public ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();
		loginpage=new LoginPage();
		homepage = loginpage.login(property.getProperty("username"), property.getProperty("password"));
		contactspage= homepage.clickOnContactsLink();	
	}

	@Test
	public void createNewUserOnContactsPageTest() {
		contactspage.clickOnCreateButton();
	}




	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
