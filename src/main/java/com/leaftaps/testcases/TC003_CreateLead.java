package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC003_CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateLead";
		testDescription ="Verify that the lead is created";
		authors="Hari";
		category ="Smoke";
		excelFileName="CreateLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname,String pass,String compantName,String firstName,String lastName) {
	LoginPage lp=new LoginPage();
	lp.enterUsername(uname).enterPassword(pass).clickLogin().clickCrmsfaLink().clickLeadsLink().clickCreateLeadLink()
	.enterCompanyName(compantName).enterFirstName(firstName).enterLastName(lastName).clickCreateLeadButton().verifyFirstName(firstName);
	}

}
