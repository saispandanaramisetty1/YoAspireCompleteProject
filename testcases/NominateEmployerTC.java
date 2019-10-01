package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.DrivesPage;
import com.pages.LoginPage;
import com.pages.NominateEmployerPage;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExcelSheet;

public class NominateEmployerTC extends BaseTest {
	@Test(priority=19)
	public void nominateEmploy() throws InterruptedException {
		etest = reports.startTest("Nominate Employer");
		driver.navigate().refresh();
		
		LoginPage login1 = PageFactory.initElements(driver, LoginPage.class);
		login1.validateLoginPage(7);
		Thread.sleep(3000);
		NominateEmployerPage np = PageFactory.initElements(driver, NominateEmployerPage.class);
		String name = ExcelSheet.readDataFromExcel("Sheet1", 4, 1,"./ExcelSheet/Book1.xlsx");
		np.nominateEmployer(name);
		etest.log(LogStatus.INFO, "In this testcase, we are nominating employers");
		etest.log(LogStatus.PASS, "Test is passed");
	}
	@Test(priority=20)
	public void remove() throws InterruptedException {
		etest = reports.startTest("Remove Nominated Employer");
		NominateEmployerPage np = PageFactory.initElements(driver, NominateEmployerPage.class);
		np.removeEmployer();Thread.sleep(2000);
		etest.log(LogStatus.INFO, "In this testcase, we are removind nominated employers");
		etest.log(LogStatus.PASS, "Test is passed");
	}
	@Test(priority=21)
	public void scheduleDrive() throws InterruptedException {
		etest = reports.startTest("Scheduling the drive");
		DrivesPage dp = PageFactory.initElements(BaseTest.driver, DrivesPage.class);
		dp.schedule();
		etest.log(LogStatus.INFO, "In this we are scheduling the interview");
		etest.log(LogStatus.PASS, "Test is passed");
	}

}
