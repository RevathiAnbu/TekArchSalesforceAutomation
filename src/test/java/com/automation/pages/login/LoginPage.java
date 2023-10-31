package com.automation.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.base.BasePage;
//import com.automation.testData.BaseClass;

public class LoginPage extends BasePage{
	@FindBy(xpath="//input[@type='email' and @name='username']") WebElement userNameElement;
	@FindBy(xpath="//input[@type='password']") WebElement passwordElement;
	@FindBy(xpath="//input[contains(@type,'submit')]") WebElement loginbuttonElement;
	
	/*@FindBy(id="password_field") WebElement passwordElement;
	@FindBy(tagName="button") WebElement submitButtonElement;*/
	
	//WebElement userNameElement = driver.findElement(By.xpath("//input[@type='email' and @name='username']"));
	//WebElement passwordElement =  driver.findElement(By.xpath("//input[@type='password']")); 
	//WebElement submitbuttonElement=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public void enterUserName(String data) {
		//userNameElement.sendKeys(data);
		enterText(userNameElement, data, "Username textbox");
	}
	public void enterPassword(String data) {
		enterText(passwordElement, data, "password field");
	}
	
	public WebDriver clickLoginButton() {
		clickElement(loginbuttonElement,"login button");
		return driver;
		
	}
	
	
	/*WebElement usernameEle = driver.findElement(By.xpath("//input[@type='email' and @name='username']"));
	//waitForVisibility(usernameEle, 5, 2, "username textbox");
	enterText(usernameEle,username,"login textbox");
	WebElement passwordEle =  driver.findElement(By.xpath("//input[@type='password']")); 
	enterText(passwordEle,password,"password textbox");
	WebElement submitbuttonEle=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
	clickElement(submitbuttonEle,"login button");*/
	

	public String getTitleOfThePAge() {
		//waitUntilPageLoads();
		return getPageTitle();
	}
		
}