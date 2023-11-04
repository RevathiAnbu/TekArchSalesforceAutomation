package com.automation.pages.settings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.pages.base.BasePage;

public class SettingsPage extends BasePage {
	
	@FindBy(id="userNavLabel") WebElement usermenuElement;
	@FindBy(xpath="//a[@title='My Settings']") WebElement mysettingElement;

	@FindBy(xpath="//span[@id='PersonalInfo_font']") WebElement personallinkElement;
	@FindBy(xpath="//a[@id='LoginHistory_font']") WebElement loginhistoryElement;
	@FindBy(xpath="	//a[contains(text(),'Download login history for last six months, includ')]") 
	WebElement downloadloginhistoryElement;
	@FindBy(xpath="//span[@id='DisplayAndLayout_font']") WebElement displaylayoutElement;
	@FindBy(xpath="//a[@id='CustomizeTabs_font']") WebElement customizetabElement;
	
	@FindBy(xpath="//span[@id='EmailSetup_font']") WebElement emaillinkElement;
	@FindBy(xpath="//span[@id='CalendarAndReminders_font']") WebElement calendarElement;
	
	@FindBy(xpath="//select[@id='p4']") WebElement customappdropdownElement;
	@FindBy(xpath="//select[@id='duel_select_0']") WebElement multiselectdropdownElement;
	@FindBy(xpath="//img[@title='Add']") WebElement multiselectAddElement;
	@FindBy(xpath="//img[@title='Remove']") WebElement multiselectRemoveElement;
	@FindBy(xpath="//input[@title='Save']") WebElement clicksaveElement;
	
	
	@FindBy(xpath="//span[@id='EmailSetup_font']") WebElement emailElement;
	@FindBy(xpath="//span[@id='EmailSettings_font']") WebElement myemailsettingsElement;
	@FindBy(xpath="//input[@id='sender_name']") WebElement enteremailnameElement;
	@FindBy(xpath="//input[@id='sender_email']") WebElement enteremailaddressElement;
	@FindBy(xpath="//input[@title='Save']") WebElement emailsavebuttonElement;
	//input[@title='Save']
	//input[@id='sender_name']
	
	@FindBy(xpath="//span[@id='CalendarAndReminders_font']") WebElement calendarsandremaindersElement;
	@FindBy(xpath="//span[@id='Reminders_font']") WebElement activityremaindersElement;
	@FindBy(xpath="//input[@id='testbtn']") WebElement opentestremainderElement;
	
	
	

	public SettingsPage(WebDriver driver) {
		
		super(driver);
	}
	
	public void clickUserMenuDropDown() {
		clickElement(usermenuElement,"username button");
		
	}
	
	public void clickmySettings() {
		clickElement(mysettingElement,"click personal");
		
	}
	
	public void clickpersonal() {
		clickElement(personallinkElement,"click personal");
		//return driver;
	}
	
	public void loginhistory() {
		clickElement(loginhistoryElement,"click login history");
		
	}
	
	public void clickdownloadloginhistory() {
		clickElement(downloadloginhistoryElement,"click login history");
		
	}
	
	public void clickdisplaylayout() {
		clickElement(displaylayoutElement,"display layout");
		
	}
	
	public void clickcustomizetab() {
		clickElement(customizetabElement,"customize tab");
		
	}
	
	public void selectdropdowncustomapp(String data) {
		selectdropdownText(customappdropdownElement,data,"dropdown data");
		//return driver;
	}
	
	public void multiselectdropdownvalues(String data) {
		selectdropdownText(multiselectdropdownElement,data,"multi select dropdown");
		
	}
	
	public void clickmultiselectadd() {
		clickElement(multiselectAddElement,"multiselect add");
		
	}
	
	public void clicksave() {
		clickElement(clicksaveElement,"save button");
		
	}
	/*public WebDriver clickmultiselectremove() {
		clickElement(multiselectRemoveElement,"multiselect value");
		return driver;
	}*/
	
	public void clickemail(){
		clickElement(emailElement,"email");
		
	}
	
	public void clickemailsettings(){
		clickElement(myemailsettingsElement,"email");
		
	}
	
	public void enteremailname(String data) {
		//userNameElement.sendKeys(data);enter
		enterText(enteremailnameElement, data, "Email name");
		
	}
	
	public void enteremailaddress(String data) {
		//userNameElement.sendKeys(data);enter
		enterText(enteremailaddressElement, data, "Email Address");
	}
	
	public void clicksaveemailbutton() {
		clickElement(emailsavebuttonElement,"save button");
	}
	
	public void clickcalendarsandremainders(){
		clickElement(calendarsandremaindersElement,"Calendar Remainder");
		
	}
	
	public void clickactivityremainders(){
		clickElement(activityremaindersElement,"Activity Remainder");
		
	}
	
	public void clickopentestremainderElement(){
		clickElement(opentestremainderElement,"Open test Remainder");
		
	}
	

	
	
}
