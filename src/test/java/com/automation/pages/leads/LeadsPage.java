package com.automation.pages.leads;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import static org.testng.AssertJUnit.assertEquals;
import java.util.ArrayList;
import java.util.List;

import com.automation.pages.base.BasePage;

import dev.failsafe.internal.util.Assert;

public class LeadsPage extends BasePage {
	
	//select[@id='fcf']
	
	@FindBy(xpath="//input[@type='email' and @name='username']") WebElement userNameElement;
	@FindBy(xpath="//input[@type='password']") WebElement passwordElement;
	@FindBy(xpath="//input[contains(@type,'submit')]") WebElement loginbuttonElement;
	@FindBy(id="userNavLabel") WebElement usermenuElement;
	@FindBy(xpath="//a[@title='Logout']") WebElement logoutElement;
	
	
	
	@FindBy(xpath="//select[@id='fcf']") WebElement leadsviewElement;
	@FindBy(xpath="//li[@id='Lead_Tab']") WebElement leadslinkElement;
	@FindBy(xpath="//input[@title='New']") WebElement newleadsElement;
	
	@FindBy(xpath="//input[@id='name_lastlea2']") WebElement lastnameElement;
	@FindBy(xpath="//input[@id='lea3']") WebElement companyElement;
	//@FindBy(xpath="//input[@id='name_lastlea2']") WebElement lastnameElement;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']") WebElement saveElement;
	
	



	
	public LeadsPage(WebDriver driver) {
		super(driver);
	}

	public void enterUserName(String data) {
		//userNameElement.sendKeys(data);enter
		enterText(userNameElement, data, "Username textbox");
	}
	public void enterPassword(String data) {
		enterText(passwordElement, data, "password field");
	}
	
	public WebDriver clickLoginButton() {
		clickElement(loginbuttonElement,"login button");
		return driver;
		
	}
	
	public WebDriver clickLeads() {
		clickElement(leadslinkElement,"login button");
		return driver;
		
	}
	
	public WebDriver clicknewLeads() {
		clickElement(newleadsElement,"login button");
		return driver;
		
	}
	
	public void enterLastName(String data) {
		//userNameElement.sendKeys(data);enter
		enterText(lastnameElement, data, "lastname");
	}
	
	public void entercompany(String data) {
		//userNameElement.sendKeys(data);enter
		enterText(companyElement, data, "company name");
	}
	
	public WebDriver clicksave() {
		clickElement(saveElement,"save button");
		return driver;
		
	}
	
	
	
	public void validatedropdown() {
		List<String> givenlist = new ArrayList<>();
		List<WebElement>  webelementlist = new ArrayList<>();
		givenlist.add("All Open Leads");
		givenlist.add("My Unread Leads");
		givenlist.add("Recently Viewed Leads");
		givenlist.add("Today's Leads");
		
	 Select sel = new Select(leadsviewElement);
	
	 webelementlist = sel.getOptions();
	 List<String> dropdownlist = new ArrayList<>();
	 
	 for (WebElement element :  webelementlist) {
            // Get the text of the web element and add it to the string list
		 dropdownlist.add(element.getText());
        }
	 
	 System.out.println(dropdownlist);
	 System.out.println(givenlist);
	 if (dropdownlist.containsAll(givenlist))
		 System.out.println("Drop down list validated");
	 else
		 System.out.println("Element(s) missing in drop down");

	
	}
	
	public void selectdropdownvalue(String data) {
		selectdropdownText(leadsviewElement,data,"dropdown data");
		//return driver;
	}
	
	public void selectdropdownValue(String data) {
		selectdropdownText(leadsviewElement,data,"dropdown data");
		clickElement(usermenuElement,"user menu");
		clickElement(logoutElement,"log out");
		//return driver;
	}
	
	public void validatedefaultValue(String data) {
		 Select sel = new Select(leadsviewElement);
		 if (sel.getFirstSelectedOption().getText().equals(data)) 
			 System.out.println("previous selected value is retained");
		 
			 else
			System.out.println("revious selected value is not retained") ;
		 }

	
	
	
}
	
	


