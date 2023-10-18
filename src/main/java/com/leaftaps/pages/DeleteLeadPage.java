package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class DeleteLeadPage extends ProjectSpecificMethods {

	
	public DeleteLeadPage verifyErrorMsg(String eleErrorMsgValue){
		verifyPartialText(locateElement(Locators.CLASS_NAME,"x-paging-info"), eleErrorMsgValue);
		return this;
	}
}
