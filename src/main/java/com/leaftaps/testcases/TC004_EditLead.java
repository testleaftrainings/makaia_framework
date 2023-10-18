package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC004_EditLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "EditLead";
		testDescription ="verify whether the existing lead has been edited";
		authors="Hari";
		category ="Smoke";
		excelFileName="EditLead";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname,String pass,String firstName,String updateComName) {
	LoginPage lp=new LoginPage();
	lp.enterUsername(uname).enterPassword(pass).clickLogin().clickCrmsfaLink().clickLeadsLink().clickFindLead()
	.enterLeadName(firstName).clickFindleadsButton().clickFirstResultingLead().clickEditLeadLink()
	.updateCompanyName(updateComName).clickUpdateSubmit().verifyCompanyName(updateComName);
	
	
	}

}
