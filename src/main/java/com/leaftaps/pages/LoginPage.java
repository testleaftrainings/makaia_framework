package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage enterUsername(String uName) {
	
		clearAndType(locateElement("username"),uName);
		reportStep(uName+" username is entered successfully", "pass");
		
		return this;
	}

	public LoginPage enterPassword(String passWord) {

	
		clearAndType(locateElement("password"),passWord);

		reportStep(passWord+" password is entered successfully", "pass");
		
		return this;

	}

	public HomePage clickLogin() {
		click(Locators.CLASS_NAME, "decorativeSubmit");
	
		reportStep("Login button is clicked successfully", "pass");
		return new HomePage();

	}

}
