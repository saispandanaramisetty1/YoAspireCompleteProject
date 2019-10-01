package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.HomePage;
import com.pages.InterviewedPage;
import com.pages.SheduleInterviewPage;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExcelSheet;

public class ScheduleInterview extends BaseTest{
	@Test(priority=22)
	public void scheduleInterview() throws InterruptedException {
		Thread.sleep(3000);
		etest = reports.startTest("Schedule interview");
		SheduleInterviewPage sip = PageFactory.initElements(BaseTest.driver, SheduleInterviewPage.class);
		String number = ExcelSheet.readDataFromExcel("Sheet1", 4, 0,"./ExcelSheet/Book1.xlsx");
		sip.scheduleint(number);
		etest.log(LogStatus.INFO, "In this testcase we schedule the interview to the particular person");
		etest.log(LogStatus.PASS, "Test is passed");
	}
	
	@Test(priority=23)
	public void viewFeeedbackOfComDrive() throws InterruptedException {
		etest = reports.startTest("Recruiter can view the feedbackform of Completed interview");
		InterviewedPage ip = PageFactory.initElements(BaseTest.driver, InterviewedPage.class);
		ip.viewFeedback();
		etest.log(LogStatus.INFO, "Recruiter can view the feedbackform of Completed interview");
		etest.log(LogStatus.PASS, "Test is passed");
	}
	@Test(priority=24)
	public void logout() throws InterruptedException {
		etest = reports.startTest("sign out");
		HomePage hm = PageFactory.initElements(driver, HomePage.class);
		hm.logout();
		etest.log(LogStatus.INFO, "Sign out");
		etest.log(LogStatus.PASS, "Test is passed");
		
	}
}
