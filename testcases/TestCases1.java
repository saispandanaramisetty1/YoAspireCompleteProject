package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.Automation_1;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExcelSheet;



public class TestCases1 extends BaseTest {
	@Test(priority=19)
	public static void atestCase_One() throws Exception {
		logger.info("TestCase_One");
		etest = reports.startTest("sign in as employer and view feedback");

		Automation_1 wb1 = PageFactory.initElements(driver, Automation_1.class);

		String un = ExcelSheet.readDataFromExcel("Sheet1", 3, 0,"./ExcelSheet/YoAspire_TestData.xlsx");
		String pwd = ExcelSheet.readDataFromExcel("Sheet1", 3, 1,"./ExcelSheet/YoAspire_TestData.xlsx");
		wb1.Test1(un, pwd);
		etest.log(LogStatus.INFO, "test1 method");
		etest.log(LogStatus.PASS, "test2 is passed");
}
}
