package com.automation.tests.scripts;

import java.util.Properties;

import org.testng.annotations.Test;

import com.automation.pages.account.AccountsPage;
import com.automation.pages.login.LoginPage;
import com.automation.tests.base.BaseTest;
import com.automation.tests.utilities.PropertiesUtility;

public class Accounts extends BaseTest {
	
	@Test
	
	public static void login_to_salesforce() throws InterruptedException  {
		
		PropertiesUtility pro=new PropertiesUtility();
		Properties p=pro.createPropertyObject();
		pro.loadFile("applicationDataProperties",p);
		String username=pro.getPropertyValue("login.valid.userid",p);
		String password=pro.getPropertyValue("login.valid.password",p);
		   
		
	    AccountsPage accountspage=new AccountsPage(driver);
	    accountspage.enterUserName(username);
	    accountspage.enterPassword(password);
		driver=accountspage.clickLoginButton();
		
	}
	
	@Test
	
	public static void accounts_createnewaccount() throws InterruptedException {
		
		login_to_salesforce();
	    AccountsPage accountspage=new AccountsPage(driver);
	    accountspage.clickaccountstab();
	    accountspage.clickcreatenewdropdown();
	    accountspage.selectaccountdropdown();
	    Thread.sleep(1000);
		//accountspage.selectdropdownnewaccount("Account");
		Thread.sleep(2000);
		accountspage.enteraccountname("checkings");
		Thread.sleep(2000);
		accountspage.selectdropdownaccttype("Technology Partner");
		accountspage.selectdropdownacctpriority("High");
	    accountspage.clicksavebuttonElement();
	}
	
	@Test
	
public static void accounts_createnewview() throws InterruptedException {
		
		login_to_salesforce();
	    AccountsPage accountspage=new AccountsPage(driver);
	    accountspage.clickaccountstab();
	    accountspage.clickcreatenewdropdown();
	    //accountspage.selectaccountdropdown();
	    Thread.sleep(1000);
	    accountspage.clickcreatenewview();
	    accountspage.enterviewname("View2");
	    Thread.sleep(1000);
	    accountspage.enteruniqueviewname("Bob2");
	    Thread.sleep(1000);
	    accountspage.clickviewsavebutton();
	    
	}
	@Test
	
public static void accounts_editview() throws InterruptedException {
		
		login_to_salesforce();
	    AccountsPage accountspage=new AccountsPage(driver);
	    accountspage.clickaccountstab();
	    //accountspage.clickcreatenewdropdown();
	    Thread.sleep(1000);
	    accountspage.clickeditview();
	    accountspage.editviewname("editView2");
	    Thread.sleep(1000);
	    accountspage.editviewuniquename("editBob2");
	    Thread.sleep(1000);
	    accountspage.selectdropdownfield("Account Name");
	    accountspage.selectdropdownperator("contains");
	    accountspage.selectdropdownvalue("a");
	    Thread.sleep(1000);
	    accountspage.clickeditviewsave();
	    
	}
	
	
	
	
	
}
