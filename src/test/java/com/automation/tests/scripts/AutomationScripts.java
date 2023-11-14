package com.automation.tests.scripts;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import com.automation.pages.home.HomePage;
import com.automation.pages.login.LoginPage;
import com.automation.pages.profile.ProfilePage;
import com.automation.pages.settings.SettingsPage;
import com.automation.pages.usermenu.UserMenuPage;
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;


public class AutomationScripts extends BaseTest {


	@Test
	public static void login_to_salesforce() throws InterruptedException {
		//log4j: log
		//extent report
		//myLog.info("******login_to_firebase automation script started***********");
		//String expected="Student Registration Form";
		System.out.println("Testing1");
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);


		System.out.println(username + password);
		//String customapptxt =pro.getPropertyValue("customapptxt",p);

		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
		driver=loginPage.clickLoginButton();

		Thread.sleep(2000);

		//System.out.println(customapptxt);

		//UserMenuPage usermenuPage=new UserMenuPage(driver);
		/*String actual=homePage.getTextFromStudentRegistrationFormText();
			Assert.assertEquals(actual, expected);*/

	}
	@Test
	public void usermenu_myprofile() throws Exception {

		login_to_salesforce();
		UserMenuPage usermenuPage=new UserMenuPage(driver);
		usermenuPage.clickUserMenuDropDown();
		driver = usermenuPage.clickMyProfileButton();


		ProfilePage profilepage = new ProfilePage(driver);
			//edit last name in profile
			profilepage.clickEditProfile();
			driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));
		   	Thread.sleep(1000); 
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		  	Thread.sleep(1000);
		  	profilepage.enterLastName();
		  	profilepage.saveAllButton();
		  	Thread.sleep(2000);

		  	//Post link txt
		  	driver.switchTo().parentFrame();
		  	profilepage.clickPostLink();
			Thread.sleep(2000);
			profilepage.enterpostBody();
			Thread.sleep(1000);
			profilepage.clicksharebutton();


			//file link
			Thread.sleep(1000);
			profilepage.clickfileLink();
			Thread.sleep(1000);
			profilepage.clickfileupload();
			Thread.sleep(1000);
			profilepage.clickchoosefile();
			profilepage.clicksharebutton();


		//picture upload
		profilepage.clickaddphoto();
		profilepage.clicksharebutton();


	}


	@Test

	public void usermenu_mysettings() throws InterruptedException {

		login_to_salesforce();

		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String customapptxt=pro.getPropertyValue("customapptxt",p);
		String availabletabtxt=pro.getPropertyValue("availabletabstxt",p);
		String emailname=pro.getPropertyValue("emailname",p);
		String emailaddress =pro.getPropertyValue("emailaddress",p);


		//System.out.println(username);
		//System.out.println(emailname);
		//System.out.println(emailaddress);


		SettingsPage settingspage= new SettingsPage(driver);

		//My settings
		settingspage.clickUserMenuDropDown();
		settingspage.clickmySettings();

		//Personal
		settingspage.clickpersonal();
		settingspage.loginhistory();
		settingspage.clickdownloadloginhistory();

		//Display Layout
		settingspage.clickdisplaylayout();
		settingspage.clickcustomizetab();

		settingspage.selectdropdowncustomapp(customapptxt);
		settingspage.multiselectdropdownvalues(availabletabtxt);
		Thread.sleep(1000);
		settingspage.clickmultiselectadd();
		Thread.sleep(1000);
		settingspage.clicksave();
		Thread.sleep(500);
		//settingspage.clickmultiselectremove();

		//Email
		settingspage.clickemail();
		settingspage.clickemailsettings();
		Thread.sleep(1000);
		settingspage.enteremailname(emailname);
		Thread.sleep(500);
		settingspage.enteremailaddress(emailaddress);
		settingspage.clicksaveemailbutton();   

		//Calendars and Remainders

		settingspage.clickcalendarsandremainders();
		settingspage.clickactivityremainders();
		settingspage.clickopentestremainderElement();

	}
}



