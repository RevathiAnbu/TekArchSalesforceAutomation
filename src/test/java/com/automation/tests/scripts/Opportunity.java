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
   opportunitypage.enteraccountName("Normal");
   opportunitypage.enterprobability("20");
   opportunitypage.selectstagedropdown("Prospecting");
   opportunitypage.entercampaignsource("None");
   opportunitypage.selectleadsourcedropdown("Web");
   opportunitypage.entercalendardate("NOV-24-2022", "MMM-dd-yyyy");
   //opportunitypage.validatedropdown();
   
   /*Enter Opportunity Name,
   Account Name,
   Close Date,
   Stage,
   Probability,
   Lead Source , 
   Primary Campaign Source*/
   
    
}


	
}
	


