package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.FindLeadPage;
import com.leaftaps.pages.LoginPage;

public class TC006_DuplicateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "DeleteLead";
		testDescription ="Verify if the lead is duplicated";
		authors="Hari";
		category ="Smoke";
		excelFileName="DuplicateLead";

		
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname,String pass,String firstName) {
		
		
		new LoginPage().enterUsername(uname).enterPassword(pass).clickLogin().clickCrmsfaLink().clickLeadsLink().clickFindLead()
	.enterLeadName(firstName)
	.clickFindleadsButton()
	.getFirstResultingLead();
	
	new FindLeadPage().clickFirstResultingLead()
	.clickDuplicateLink()
	.clickCreateLeadDublicate()
	.verifyFirstName(firstName);
	
	
	}

}
