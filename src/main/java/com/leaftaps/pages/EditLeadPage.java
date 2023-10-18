package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class EditLeadPage extends ProjectSpecificMethods{

	public EditLeadPage updateCompanyName(String updcomnyName){
		clearAndType(locateElement(Locators.ID,"updateLeadForm_companyName"), updcomnyName);
		reportStep(updcomnyName +"Updated company name is entered successfully ", "pass");

		return this;

	}
	
	public ViewLeadPage clickUpdateSubmit(){
		click(locateElement(Locators.CLASS_NAME,"smallSubmit"));
		return new ViewLeadPage();
	}
}
