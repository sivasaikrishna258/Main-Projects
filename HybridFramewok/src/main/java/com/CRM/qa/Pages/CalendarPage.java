package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.BaseClass.TestBase;
import com.CRM.qa.Utilities.UtilClass;

public class CalendarPage extends TestBase {
	
	@FindBy(xpath="//*[contains(text(),'Calendar1')]")
	WebElement eventslink;
	
	public CalendarPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnEventsLink() {
		UtilClass.clickOn(driver, eventslink, 30);
		
	}
}
