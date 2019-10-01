package com.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.AddDrive;
import com.pages.MyDrives;
import com.pages.SignUp;
import com.relevantcodes.extentreports.LogStatus;
import com.util.CommonMethods;
import com.util.ExcelSheet;

public class RecruiterRole extends BaseTest {

	@Test(priority = 9)
	public void testcase1() throws Exception {
		
		logger.info("login has started");
		etest = reports.startTest("going to login as a recruiter in  yoaspire application");
		SignUp su = PageFactory.initElements(driver, SignUp.class);
		String un = ExcelSheet.readDataFromExcel("Sheet1", 1, 0,"./ExcelSheet/Yoaspire.xlsx");
		String pwd = ExcelSheet.readDataFromExcel("Sheet1", 1, 1,"./ExcelSheet/Yoaspire.xlsx");
		su.data(un, pwd);
		logger.info("succesfully logged in");
		etest.log(LogStatus.INFO, "logon to yoaspire appplication");
		etest.log(LogStatus.PASS, "logged in succesfully");

	}

//	@Test(groups = {"smoke"},priority = 2)
//	public void testcaselog() throws Exception {
//		logger.info("login has started");
//		String un = ExcelSheet.readDataFromExcel("Sheet1", 3, 0);
//		String pwd = ExcelSheet.readDataFromExcel("Sheet1", 3, 1);
//		SignUp su = PageFactory.initElements(driver, SignUp.class);
//		su.data(un, pwd);
//		driver.navigate().refresh();
//		logger.info("clicked on signin without entering credentials");
//		etest.log(LogStatus.INFO, "logging  into yoaspire appplication");
//		etest.log(LogStatus.FAIL, "clicked signin without entering credentials and refreshed page");
//	}

//	@Test(groups = {"smoke"},priority = 1)
//	public void testcase2() {
//		logger.info("login  for recruiter has started");
//		String un = ExcelSheet.readDataFromExcel("Sheet1", 2, 0);
//		String pwd = ExcelSheet.readDataFromExcel("Sheet1", 2, 1);
//		SignUp su = PageFactory.initElements(driver, SignUp.class);
//		try {
//			su.data(un, pwd);
//			driver.navigate().refresh();
//			logger.info("enteres wrong credentials and refreshed the page");
//			etest.log(LogStatus.INFO, "logon to yoaspire appplication");
//			etest.log(LogStatus.FAIL, "ENTERED INVALID CREDENTIALS AND REFRESHED PAGE");
//
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
	@Test(priority = 10)
	public void testcase3() throws Exception {
		logger.info("clicking on mydrives has started");
		MyDrives md = PageFactory.initElements(driver, MyDrives.class);
		md.drives();
		etest.log(LogStatus.INFO, "clicked on mydrives module ");
		etest.log(LogStatus.PASS, "mydrives page displayed");
	}
	@Test(priority = 11)
	public void testcase4() throws Exception {
		logger.info("clicking on add icon has started");
		MyDrives mg = PageFactory.initElements(driver, MyDrives.class);
		mg.adding();
		Thread.sleep(2000);
		etest.log(LogStatus.INFO, "click on add icon");
		etest.log(LogStatus.PASS, "add drives page displayed");
	}
	@Test(priority = 12)
	public void testcase5() throws Exception, IOException {
        int i=1;
		logger.info("adding drive has started");
		String hg = ExcelSheet.readDataFromExcel("Sheet1", i, 2,"./ExcelSheet/Yoaspire.xlsx");
		System.out.println(hg);
		String subhg = ExcelSheet.readDataFromExcel("Sheet1", i, 3,"./ExcelSheet/Yoaspire.xlsx");
		String des = ExcelSheet.readDataFromExcel("Sheet1", i, 4,"./ExcelSheet/Yoaspire.xlsx");
		String ci = ExcelSheet.readDataFromExcel("Sheet1", i, 5,"./ExcelSheet/Yoaspire.xlsx");
		String ve = ExcelSheet.readDataFromExcel("Sheet1", i, 6,"./ExcelSheet/Yoaspire.xlsx");
		String daty = ExcelSheet.readDataFromExcel("Sheet1", i, 11,"./ExcelSheet/Yoaspire.xlsx");
		String mont = ExcelSheet.readDataFromExcel("Sheet1", i, 12,"./ExcelSheet/Yoaspire.xlsx");
		String yr = ExcelSheet.readDataFromExcel("Sheet1", i, 13,"./ExcelSheet/Yoaspire.xlsx");
		String day = ExcelSheet.readDataFromExcel("Sheet1", 6, 0,"./ExcelSheet/Yoaspire.xlsx");
		String mony = ExcelSheet.readDataFromExcel("Sheet1", 6, 1,"./ExcelSheet/Yoaspire.xlsx");
		String yea = ExcelSheet.readDataFromExcel("Sheet1", 6, 2,"./ExcelSheet/Yoaspire.xlsx");
		String ur = ExcelSheet.readDataFromExcel("Sheet1", i, 7,"./ExcelSheet/Yoaspire.xlsx");
		String el = ExcelSheet.readDataFromExcel("Sheet1", i, 8,"./ExcelSheet/Yoaspire.xlsx");
		String more = ExcelSheet.readDataFromExcel("Sheet1",i, 9,"./ExcelSheet/Yoaspire.xlsx");
		String pn = ExcelSheet.readDataFromExcel("Sheet1", i, 10,"./ExcelSheet/Yoaspire.xlsx");
		//String sub = Excel.readfile("Sheet1", 1, 11);
		AddDrive ad = PageFactory.initElements(driver, AddDrive.class);
		ad.drive(hg, daty, mont, yr, day, mony, yea, subhg, des, ci, ve, ur, el, more, pn);
		CommonMethods.screenshotpage();
		etest.log(LogStatus.INFO, "adding a drive");
		etest.log(LogStatus.FAIL, "all mandatory fields should be displayed ");

	}
}
