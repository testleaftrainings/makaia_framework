package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.leaftaps.pages.LoginPage;

public class TC002_VerifyLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues() {
		testcaseName = "VerifyLogOut";
		testDescription ="Verify LogOut functionality with positive data";
		authors="Hari";
		category ="Smoke";
		excelFileName="Login";
	}
	
	@Test(dataProvider = "fetchData")
	public void runLogin(String uname,String pass) {
	LoginPage lp=new LoginPage();
	lp.enterUsername(uname).enterPassword(pass).clickLogin().clickLogOut();
	}

}
