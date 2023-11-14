package com.automation.tests.scripts;

import com.automation.tests.base.BaseTest;

import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.pages.opportunity.Opportunitypage;
import com.automation.pages.login.LoginPage;
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class Opportunity extends BaseTest {

	@Test

	public static void login_to_salesforce() throws InterruptedException  {

		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);

		Opportunitypage opportunitypage=new Opportunitypage(driver);
		opportunitypage.enterUserName(username);
		opportunitypage.enterPassword(password);
		driver= opportunitypage.clickLoginButton();

	}
	@Test

	public static void opportunity_validatedropdown() throws InterruptedException {

		login_to_salesforce();
		Opportunitypage opportunitypage=new Opportunitypage(driver);
		opportunitypage.clickopportunitiestab();
		opportunitypage.validatedropdown();


	}

	@Test
	public static void opportunity_createnew() throws InterruptedException {

		login_to_salesforce();
		Opportunitypage opportunitypage=new Opportunitypage(driver);
		opportunitypage.clickopportunitiestab();
		opportunitypage.clicknewtab();
		opportunitypage.enteroppName("Super");
		//opportunitypage.enteraccountName("Normal");
		opportunitypage.enterprobability("20");
		opportunitypage.selectstagedropdown("Prospecting");
		//opportunitypage.entercampaignsource("None");
		opportunitypage.selectleadsourcedropdown("Web");
		opportunitypage.entercalendardate("11/21/2024");
		opportunitypage.clicksavebutton();
		opportunitypage.clickpipeline();
		//opportunitypage.validatedropdown();
	}

	@Test
	public static void opportunity_pipelinereport() throws InterruptedException {

		login_to_salesforce();
		Opportunitypage opportunitypage=new Opportunitypage(driver);
		opportunitypage.clickopportunitiestab();
		opportunitypage.clickpipeline();

	}
	
	@Test
	public static void opportunity_stuckoppreport() throws InterruptedException {

		login_to_salesforce();
		Opportunitypage opportunitypage=new Opportunitypage(driver);
		opportunitypage.clickopportunitiestab();
		opportunitypage.clickstuckopplink();

	}
	
	@Test
	public void clickIntervalDropDown() throws InterruptedException {
		login_to_salesforce();
		Opportunitypage opportunitypage=new Opportunitypage(driver);
		opportunitypage.clickopportunitiestab();
		opportunitypage.clickIntervalDropDown("Current and Next FQ");
		opportunitypage.clickIncludeDropDown("All opportunities");
		opportunitypage.clickRunReport();
	}
	
	
}



