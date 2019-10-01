package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.EditInfo;

import com.pages.SetFeedBackFormPage;
import com.util.CommonMethods;

public class SetFeedbackForm extends BaseTest{
	@Test(priority = 15)
	public void settingFeedBackForm() throws InterruptedException {
		logger.info("process for setting feedback form");
		etest = CommonMethods.startingTest("Set FeedBack Form to view to interviewer");
		EditInfo info = PageFactory.initElements(driver, EditInfo.class);
		info.navigateToEditData();
		SetFeedBackFormPage feedBackForm = PageFactory.initElements(driver, SetFeedBackFormPage.class);
		feedBackForm.setFeedBackForm();
		CommonMethods.end("process for setting feedback form", "TestCase is passed successfully");
	}
	@Test(priority = 16)
	public void settingFeedBackForm1() throws InterruptedException {
		logger.info("process for set feedback form with multiple skills");
		etest = CommonMethods.startingTest("setting feedback form for adding multiple skills");
		
		EditInfo info = PageFactory.initElements(driver, EditInfo.class);
		info.navigateToEditData();
		SetFeedBackFormPage feedBackForm = PageFactory.initElements(driver, SetFeedBackFormPage.class);
		feedBackForm.AddingdiffSkill();
		CommonMethods.end("process for set feedback form with multiple skills", "TestCase is passed successfully");
	}
}
