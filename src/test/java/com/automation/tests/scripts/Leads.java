package com.automation.tests.scripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.pages.leads.LeadsPage;
import com.automation.pages.opportunity.Opportunitypage;
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class Leads extends BaseTest {

	@Test
	public static void login_to_salesforce() throws InterruptedException {

		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);

		LeadsPage leadspage =new LeadsPage(driver);
		leadspage.enterUserName(username);
		leadspage.enterPassword(password);
		driver= leadspage.clickLoginButton();

	}
	

	@Test
	public static void invalid_login_to_salesforce() throws InterruptedException {

		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.invalid.userid",p);
		String password=pro.getPropertyValue("login.invalid.password",p);

		LeadsPage leadspage =new LeadsPage(driver);
		leadspage.enterUserName(username);
		leadspage.enterPassword(password);
		driver= leadspage.clickLoginButton();

	}
	
	@Test
	public static void login_to_leadspage() throws InterruptedException {
		LeadsPage leadspage =new LeadsPage(driver);
		login_to_salesforce();
		leadspage.clickLeads();
	}
	
	@Test
	
	public static void leadspage_validateviewmenu() throws InterruptedException {
		
		LeadsPage leadspage =new LeadsPage(driver);
		login_to_salesforce();
		leadspage.clickLeads();
		leadspage.validatedropdown();
		
	}
@Test

public static void leadspage_defaultview() throws InterruptedException {
		
	    String selectedvalue = "My Unread Leads";
		LeadsPage leadspage =new LeadsPage(driver);
		login_to_salesforce();
		leadspage.clickLeads();
		leadspage.selectdropdownValue(selectedvalue);
		login_to_salesforce();
		leadspage.clickLeads();
		leadspage.validatedefaultValue(selectedvalue);
		
	}

@Test

public static void leadspage_selecttodaylead() throws InterruptedException {
	
    String selectedvalue = "Todday's Leads";
	LeadsPage leadspage =new LeadsPage(driver);
	login_to_salesforce();
	leadspage.clickLeads();
	leadspage.selectdropdownValue(selectedvalue);
	
}

@Test

public static void leadspage_selectnew() throws InterruptedException {
	
    String lastname = "xyz";
    String company = "OhioOnline";
	LeadsPage leadspage =new LeadsPage(driver);
	login_to_salesforce();
	leadspage.clickLeads();
	leadspage.clicknewLeads();
	leadspage.enterLastName(lastname);
	leadspage.entercompany(company);
	leadspage.clicksave();

	
}



}
