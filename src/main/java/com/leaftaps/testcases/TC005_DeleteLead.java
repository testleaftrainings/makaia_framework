package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.FindLeadPage;
import com.leaftaps.pages.LoginPage;

public class TC005_DeleteLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "DeleteLead";
		testDescription ="Verify if the lead has been deleted";
		authors="Hari";
		category ="Smoke";
		excelFileName="DeleteLead";

		
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname,String pass,String firstName,String errorMsg) {
		String firstResultingLead =
		new LoginPage().enterUsername(uname).enterPassword(pass).clickLogin().clickCrmsfaLink().clickLeadsLink().clickFindLead()
	.enterLeadName(firstName)
	.clickFindleadsButton()
	.getFirstResultingLead();
	
	new FindLeadPage().clickFirstResultingLead()
	.clickDeleteLeadLink()
	.clickFindLead().enterLeadID(firstResultingLead).clickOnFindleadsButton().verifyErrorMsg(errorMsg);
	
	
	}

}
