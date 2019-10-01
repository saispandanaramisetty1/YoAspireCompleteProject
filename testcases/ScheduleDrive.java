package com.testcases;

import org.openqa.selenium.support.PageFactory;


import com.basetest.BaseTest;
import com.pages.DrivesPage;

import com.relevantcodes.extentreports.LogStatus;

public class ScheduleDrive extends BaseTest {

	public void scheduleDrive() throws InterruptedException {
		etest = reports.startTest("Scheduling the drive");
		DrivesPage dp = PageFactory.initElements(BaseTest.driver, DrivesPage.class);
		dp.schedule();
		etest.log(LogStatus.INFO, "In this we are scheduling the interview");
		etest.log(LogStatus.PASS, "Test is passed");
	}
}

