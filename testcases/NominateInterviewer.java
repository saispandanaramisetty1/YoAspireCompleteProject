package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.EditInfo;
import com.pages.LogOutPage;

import com.pages.NominateInterviewsPage;
import com.util.CommonMethods;

public class NominateInterviewer extends BaseTest{
	@Test(priority = 18)
	public void validatingNominatios() throws InterruptedException {
		logger.info("process for nominating interviewer");
		etest = CommonMethods.startingTest("Nominating interviewer for interview process");
		EditInfo info = PageFactory.initElements(driver, EditInfo.class);
		info.navigateToEditData();
		NominateInterviewsPage interviews = PageFactory.initElements(driver, NominateInterviewsPage.class);
		interviews.nominatingInterviews(6);
		CommonMethods.end("process for nominating interviewer", "TestCase is passed successfully");
		Thread.sleep(4000);
		LogOutPage logOut = PageFactory.initElements(driver, LogOutPage.class);
		logOut.validatingLogOut();
		Thread.sleep(3000);
		
	}

}
