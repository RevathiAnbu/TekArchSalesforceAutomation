package com.automation.pages.profile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.pages.base.BasePage;

public class ProfilePage extends BasePage  {
	
	
	@FindBy(xpath="//a[@class='contactInfoLaunch editLink']") WebElement editProfileElement;
	@FindBy(xpath="//input[@id='lastName']") WebElement lastNameElement;
	@FindBy(xpath="//input[@value='Save All']") WebElement saveAllElement;
	@FindBy(xpath="//span[normalize-space()='Post']") WebElement postLinkElement; 
	@FindBy(xpath ="/html[1]/body[1]") WebElement postBodyElement;
	@FindBy(xpath="//input[@id='publishersharebutton']") WebElement sharebuttonElement; 
	@FindBy(xpath="//span[normalize-space()='File']") WebElement fileuploadlinkElement; 
	@FindBy(xpath="//a[@id='chatterUploadFileAction']") WebElement fileuploadButtonElement; 
	@FindBy(xpath="//input[@id='chatterFile']") WebElement choosefileButtonElement; 
	

	
	//iframe of post link text
	@FindBy(xpath="//iframe[@title='Rich Text Editor, publisherRichTextEditor']") WebElement postlinkbodyiframe;
	@FindBy(xpath="//iframe[@id='uploadPhotoContentId']") WebElement popupphotofileiframe;
	
	
	@FindBy(xpath="//a[normalize-space()='Add your photo']") WebElement addphotolinkElement; 
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadInputFile']") WebElement choosephotobuttonElement;
	@FindBy(xpath="//input[@id='j_id0:uploadFileForm:uploadBtn']") WebElement savephotobuttonElement; 
	@FindBy(xpath="//input[@id='j_id0:j_id7:save']") WebElement thumbnailsavebuttonElement; 
	
	//input[@id='j_id0:j_id7:save']
	
	 //input[@id='j_id0:uploadFileForm:save']
	
	//a[normalize-space()='Add your photo']
	//input[@id='chatterFile']
	//input[@id='publishersharebutton']
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}
		
	public void clickEditProfile() {
		clickElement(editProfileElement,"edit profile");
		//return driver;
	}
	
	public void enterLastName() {
		enterText(lastNameElement,"anbu","Last name");
		//return driver;
	}
	
	public void  saveAllButton() {
		clickElement(saveAllElement,"saveAll button");
		//return driver;
	}
	
	public void clickPostLink() {
		clickElement(postLinkElement,"post link");
		//return driver;
	}
	
	public void enterpostBody() throws Exception {
		driver.switchTo().frame(postlinkbodyiframe);
		enterText(postBodyElement,"checking","enter postbody");
		driver.switchTo().parentFrame();
		
		//return driver;
	}	
		
	public void clicksharebutton() {
		clickElement(sharebuttonElement,"saveAll button");			
		//return driver;
	}
			
	public void clickfileLink() {
		clickElement(fileuploadlinkElement,"file upload");
		//return driver;
	}
	
	public void clickfileupload() {
		clickElement(fileuploadButtonElement,"file upload from computer");
		//return driver;
	}
	
	public void clickchoosefile() throws AWTException {
		//clickElement(choosefileButtonElement,"choose file");
		
		choosefileButtonElement.sendKeys("/Users/revathi/Documents/Revathi/TechArch/Java/salesforceimage.jpeg");
		
	}
	
	public void clickaddphoto() throws AWTException, InterruptedException {
		clickElement(addphotolinkElement,"add photo");
		Thread.sleep(1000);
		driver.switchTo().frame(popupphotofileiframe);
		Thread.sleep(1000);
		//popupphotofileiframe.click();
		choosephotobuttonElement.sendKeys("/Users/revathi/Documents/Revathi/TechArch/Java/salesforceimage.jpeg");
		Thread.sleep(2000);
		clickElement(savephotobuttonElement,"save photo");
		Thread.sleep(2000);
		 clickElement( thumbnailsavebuttonElement,"save thumbnail photo");
	}
	
	}
	
	
	
