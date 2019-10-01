package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.pages.AddDrive;
import com.pages.EditPage;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExcelSheet;

public class Edit extends BaseTest
{
	@Test(priority = 13)
	public void editclick() throws Exception 
	{
		logger.info("clicking on specific drive for editing");
		EditPage ep = PageFactory.initElements(driver, EditPage.class);
		Thread.sleep(3000);
		ep.specific();
		ep.details();
		Thread.sleep(3000);
		ep.editdriveinfo();
		etest.log(LogStatus.INFO, "directing to edit drive page");
		etest.log(LogStatus.PASS, "edit drive page is loaded ");
	}
	@Test(priority = 14)
	public void editing() throws Exception {
		logger.info("drive details edited");
		AddDrive ad = PageFactory.initElements(driver, AddDrive.class);
		String hg = ExcelSheet.readDataFromExcel("Sheet1", 4, 2,"./ExcelSheet/Yoaspire.xlsx");
		String ci = ExcelSheet.readDataFromExcel("Sheet1", 4, 5,"./ExcelSheet/Yoaspire.xlsx");
		String ve = ExcelSheet.readDataFromExcel("Sheet1", 4, 6,"./ExcelSheet/Yoaspire.xlsx");
        ad.drivedetail(hg, ci, ve);
        etest.log(LogStatus.INFO, "drive details edited");
		etest.log(LogStatus.PASS, "drive details edited succesfully");
		driver.navigate().refresh();

	}
}

