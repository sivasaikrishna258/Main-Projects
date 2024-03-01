package com.CRM.qa.Testcases;

import org.testng.annotations.Test;

import com.CRM.qa.Pages.ContactsPage;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class ContactsPageTest extends BaseTest{

	LoginPage loginpage;;
	HomePage homepage;
	ContactsPage contactspage;

	@Test
	public void createNewUserOnContactsPageTest() {
		loginpage=new LoginPage();
		homepage = loginpage.login(property.getProperty("username"), property.getProperty("password"));
		contactspage=homepage.clickOnContactsLink();
		contactspage.clickOnCreateButton();
	}

}
