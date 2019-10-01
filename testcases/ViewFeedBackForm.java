package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.EditInfo;
import com.pages.ViewFeedBackFormPage;
import com.util.CommonMethods;

public class ViewFeedBackForm extends BaseTest{
	@Test(priority = 17)
	public void viewingDetails() throws InterruptedException {
		logger.info("process for view feedback form");
		etest = CommonMethods.startingTest("view feedback form only after feedback form is setted");
		EditInfo info = PageFactory.initElements(driver, EditInfo.class);
		info.navigateToEditData();
		ViewFeedBackFormPage viewData = PageFactory.initElements(driver, ViewFeedBackFormPage.class);
		viewData.viewDetails();
		CommonMethods.end("process for view feedback form", "TestCase is passed successfully");
	}
}
