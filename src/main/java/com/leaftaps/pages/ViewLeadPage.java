package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;




public class ViewLeadPage extends ProjectSpecificMethods {

	public ViewLeadPage verifyFirstName(String fName) {
		verifyExactText(locateElement(Locators.ID,"viewLead_firstName_sp"), fName);
		reportStep(fName+" is matching with first name", "pass");
		return this;
	}
	
	public EditLeadPage clickEditLeadLink(){
		click(locateElement(Locators.LINK_TEXT,"Edit"));
		reportStep(" Clicked on EditLead Button", "pass");

		return new EditLeadPage();
	}
	
	public ViewLeadPage verifyCompanyName(String CompanyName) {
		verifyPartialText(locateElement(Locators.ID,"viewLead_companyName_sp"), CompanyName);
		return this;
	}
	public MyLeadsPage clickDeleteLeadLink(){
		click(locateElement(Locators.LINK_TEXT,"Delete"));
		reportStep(" Clicked on DeleteLead Button", "pass");

		return new MyLeadsPage();
	}
	
	public DuplicateLeadPage clickDuplicateLink(){
		click(locateElement(Locators.LINK_TEXT,"Duplicate Lead"));
		reportStep(" Clicked on DeleteLead Button", "pass");

		return new DuplicateLeadPage();
	}
	
	
	
}
