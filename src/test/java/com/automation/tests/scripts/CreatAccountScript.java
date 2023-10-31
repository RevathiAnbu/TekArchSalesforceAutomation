package com.automation.tests.scripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.pages.account.AccountsPage;
import com.automation.pages.login.LoginPage;
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class CreatAccountScript extends BaseTest {
	
	@Test
	
	public static void login_to_salesforce() {
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
	    String password=pro.getPropertyValue("login.valid.password",p);
		
		
	    AccountsPage accountpage=new AccountsPage(driver);
	    accountpage.enterUserName(username);
	    accountpage.enterPassword(password);
		driver=accountpage.clickLoginButton();
		
	}
	
	public static void create_newaccount() {
		
	}
	
	
	
	
}
