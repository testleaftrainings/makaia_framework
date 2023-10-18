package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;



public class FindLeadPage extends ProjectSpecificMethods{

	
	public FindLeadPage enterLeadName(String findfirstname){
		clearAndType(locateElement(Locators.XPATH,"(//input[@name='firstName'])[3]"), findfirstname);
		reportStep(findfirstname +" first name is entered successfully", "pass");

		return this;

	}
	
	public FindLeadPage enterLeadID(String id){
		clearAndType(locateElement(Locators.NAME,"id"), id);
		reportStep(id +" first name is entered successfully", "pass");

		return this;

	}
	
	public FindLeadPage clickFindleadsButton(){
		click(locateElement(Locators.XPATH,"//button[text()='Find Leads']"));
		reportStep("FindLeads Button is clicked", "pass");

		return this;
	}
	
	public DeleteLeadPage clickOnFindleadsButton(){
		click(locateElement(Locators.XPATH,"//button[text()='Find Leads']"));
		reportStep("FindLeads Button is clicked", "pass");

		return new DeleteLeadPage();
	}
	
	
	public String getFirstResultingLead(){	
		return 	getElementText(locateElement(Locators.XPATH,"(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	}
	
	public ViewLeadPage clickFirstResultingLead(){
		click(locateElement(Locators.XPATH,"(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		reportStep("FirstResultingLead Id is clicke", "pass");
		return new ViewLeadPage();
	}
	
	
}
