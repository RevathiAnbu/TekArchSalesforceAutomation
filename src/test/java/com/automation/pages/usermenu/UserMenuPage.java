package com.automation.pages.usermenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class UserMenuPage extends BasePage {
	
	@FindBy(id="userNavLabel") WebElement usermenuElement;
	//@FindBy(xpath="//div[@id='userNav']") WebElement usermenuElement;
	@FindBy(xpath="//a[@title='My Profile']") WebElement myprofileElement;

	
	public UserMenuPage(WebDriver driver) {
		super(driver);
	}
		
	public WebDriver clickUserMenuDropDown() {
		clickElement(usermenuElement,"username button");
		return driver;
	}
	
	public WebDriver clickMyProfileButton() {
		clickElement(myprofileElement,"username button");
		return driver;
	}
	
	
}
