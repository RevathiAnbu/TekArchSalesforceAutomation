package com.automation.pages.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class AccountsPage extends BasePage {
	
	@FindBy(xpath="//input[@type='email' and @name='username']") WebElement userNameElement;
	@FindBy(xpath="//input[@type='password']") WebElement passwordElement;
	@FindBy(xpath="//input[contains(@type,'submit')]") WebElement loginbuttonElement;
	
	@FindBy(xpath ="//a[@class='accountMru menuButtonMenuLink']") WebElement accountdropdownElement;
	@FindBy(xpath="//a[normalize-space()='Accounts']") WebElement accountstabElement;
	@FindBy(xpath="//div[@id='createNewButton']") WebElement createnewdropdownElement;
	@FindBy(xpath="//input[@value='Save All']") WebElement saveAllElement;
	
	
	@FindBy(xpath = "//input[@id='acc2']") WebElement accountnameElement;
	@FindBy(xpath="//select[@id='acc6']") WebElement accounttypedropdownElement;
	@FindBy(xpath="//select[@id='00NHs00000S88sz']") WebElement customerprioritydropdownElement;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']") WebElement savebuttonElement;
	
	@FindBy(xpath="//a[normalize-space()='Create New View']") WebElement createnewviewElement;
	@FindBy(xpath="//input[@id='fname']") WebElement viewnameElement;
	@FindBy(xpath="//input[@id='devname']") WebElement viewuniquenameElement;
	@FindBy(xpath="//input[@title='Save'])[2]") WebElement viewsaveElement;
	
	@FindBy(xpath="//a[normalize-space()='Edit']") WebElement editviewElement;
	@FindBy(xpath="//select[@id='fcol1']") WebElement dropdownfieldElement;
	@FindBy(xpath="//select[@id='fop1']") WebElement dropdownoperatorElement;
	@FindBy(xpath="//input[@id='fval1']") WebElement dropdownvalueElement;
	@FindBy(xpath="//input[@title='Save'])[1]") WebElement editsavevalueElement;
	
	
	
	// Login to webpage
	public AccountsPage(WebDriver driver) {
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
	
	//Create new account
	
	public void clickaccountstab() {
		clickElement(accountstabElement,"account tab");
	}
	
	public void clickcreatenewdropdown() {
		clickElement(createnewdropdownElement,"create new dropdown");
	}
	
	public void selectaccountdropdown() {
		clickElement(accountdropdownElement,"select account");
		
	}
	/*public void selectdropdownnewaccount(String data) {
		System.out.println("Entered select page");
		selectdropdownText(createnewdropdownElement,data,"Accounts Page create new");
		System.out.println("Entered selectend page");
		//return driver;
	}*/
	
	public void enteraccountname(String data) {
		//clickElement(accountnameElement,"select account");
		System.out.println("Entered accounts page");
		enterText(accountnameElement, data, "Account name");
	}
	
	public void selectdropdownaccttype(String data) {
		selectdropdownText(accounttypedropdownElement,data,"dropdown data");
		//return driver;
	}
	
	public void selectdropdownacctpriority(String data) {
		selectdropdownText(customerprioritydropdownElement,data,"dropdown data");
		//return driver;
	}
	

	public void clicksavebuttonElement() {
		clickElement(savebuttonElement,"save new account");
		
	}
	
	//create new view
	
	public void clickcreatenewview() {
		clickElement(createnewviewElement,"create new account");
		
	}
	
	public void enterviewname(String data) {
		enterText( viewnameElement, data, "create view name");
	}
	public void enteruniqueviewname(String data) {
		enterText( viewuniquenameElement, data, "create unique view");
	}
	
	public void clickviewsavebutton() {
		clickElement(viewsaveElement,"save new account");
		
	}
	
	//edit view
	
	public void clickeditview() {
		clickElement(editviewElement,"create new account");
		
	}
	
	public void editviewname(String data) {
		enterText( viewnameElement, data, "create view name");
	}
	public void editviewuniquename(String data) {
		enterText( viewuniquenameElement, data, "create unique view");
	}
	
	
	public void selectdropdownfield(String data) {
		selectdropdownText(dropdownfieldElement,data,"dropdown data");
		//return driver;
	}
	
	public void selectdropdownperator(String data) {
		selectdropdownText(dropdownoperatorElement,data,"dropdown data");
		//return driver;
	}
	
	public void selectdropdownvalue(String data) {
		
		enterText(dropdownvalueElement,data,"dropdown data");
		
	}
	
	public void clickeditviewsave() {
		clickElement(editsavevalueElement,"save new account");
		
	}
	
}
		
	
		
	
	
	
	
	
	
	
	

