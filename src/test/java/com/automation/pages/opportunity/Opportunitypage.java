package com.automation.pages.opportunity;
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

public class Opportunitypage extends BasePage {
	

	@FindBy(xpath="//input[@type='email' and @name='username']") WebElement userNameElement;
	@FindBy(xpath="//input[@type='password']") WebElement passwordElement;
	@FindBy(xpath="//input[contains(@type,'submit')]") WebElement loginbuttonElement;

	//validate dropdown Elements
	@FindBy(xpath="//a[normalize-space()='Opportunities']") WebElement opportunitiestabElement;
	@FindBy(xpath="//select[@id='fcf']") WebElement dropdownElement;
	
	//create new account Elements
	@FindBy(xpath="//input[@title='New']") WebElement newtabElement;
	//@FindBy(xpath="//select[@id='fcf']") WebElement dropdownElement;
	@FindBy(xpath="//input[@id='opp3']") WebElement oppnameElement;
	@FindBy(xpath="//input[@id='opp4']") WebElement accountnameElement;
	@FindBy(xpath="//input[@id='opp9']") WebElement closedateElement;
	@FindBy(xpath="//select[@id='opp11']") WebElement stageElement;
	@FindBy(xpath="//input[@id='opp12']") WebElement probabilityElement;
	@FindBy(xpath="//select[@id='opp6']") WebElement leadsourceElement;
	@FindBy(xpath="//input[@id='opp17']") WebElement campaignsourceElement;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']") WebElement saveElement;
	@FindBy(xpath="//a[normalize-space()='Stuck Opportunities']") WebElement stuckoppElement;
	
	
	@FindBy(xpath="//select[@id='quarter_q']") WebElement intervaldropdownElement;
	@FindBy(xpath="//select[@id='open']") WebElement includedropdownElement;

	@FindBy(xpath="//input[@title='Run Report']") WebElement runReportElement;

	//input[@title='Run Report']
	
	//a[normalize-space()='Stuck Opportunities']
	//td[@id='bottomButtonRow']//input[@title='Save']
	//a[normalize-space()='Opportunity Pipeline']
	
	@FindBy(xpath="//a[normalize-space()='Opportunity Pipeline']") WebElement pipelineElement;
	

	//select[@id='fcf']
	// Login to webpage
		public Opportunitypage(WebDriver driver) {
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
		
		
		public void clickopportunitiestab() {
			clickElement(opportunitiestabElement,"account tab");
		}
		
		//validate dropdown

		public void validatedropdown() {
			List<String> givenlist = new ArrayList<>();
			List<WebElement>  webelementlist = new ArrayList<>();
			givenlist.add("All Opportunities");
			givenlist.add("Closing Next Month");
			givenlist.add("Closing This Month");
			givenlist.add("My Opportunities");
			givenlist.add("New This Week");
			givenlist.add("Recently Viewed Opportunities");
			givenlist.add("Won");
			
		 Select sel = new Select(dropdownElement);
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
		
		//create new opportunity
		public void clicknewtab() {
			clickElement(newtabElement,"new tab");
			
		}
		

		public void enteroppName(String data) {
			//userNameElement.sendKeys(data);enter
			enterText(oppnameElement, data, "Opportunity Name");
		}
		
		public void enteraccountName(String data) {
			//userNameElement.sendKeys(data);enter
			enterText(accountnameElement, data, "Opportunity Name");
		}
		
		public void enterstage(String data) {
			//userNameElement.sendKeys(data);enter
			enterText(stageElement, data, "Opportunity Name");
		}
		
		public void selectstagedropdown(String data) {
			selectdropdownText(stageElement,data,"dropdown data");
			//return driver;
		}
		
		public void enterprobability(String data) {
			//userNameElement.sendKeys(data);enter
			enterText(probabilityElement, data, "Opportunity Name");
		}
		
		public void selectleadsourcedropdown(String data) {
			selectdropdownText(leadsourceElement,data,"dropdown data");
			//return driver;
		}
		
		public void entercampaignsource(String data) {
			//userNameElement.sendKeys(data);enter
			enterText(campaignsourceElement, data, "Opportunity Name");
		}
		
		public void entercalendardate(String data) {
			enterText(closedateElement, data, "close date");
		}
		
		public void clicksavebutton() {
			clickElement(saveElement,"save button");
			
		}
		
		//pipeline report
		
		public void clickpipeline() {
			clickElement(pipelineElement,"pipeline");
		}
		
		public void clickstuckopplink() {
			clickElement(stuckoppElement,"Stuck Opportunities");
		}
		
		public void clickIntervalDropDown(String data) {
			clickElement(intervaldropdownElement,data);
			
		}
		
		public void clickIncludeDropDown(String data) {
			clickElement(includedropdownElement,data);
			
		}
		
		
		public void clickRunReport() {
			clickElement(runReportElement,"Report button");
			
		}
		
		
		
		
}
