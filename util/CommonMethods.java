package com.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;

import com.basetest.BaseTest;
import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * 
 * @author CommonMethods
 * Class for common methods like click() and sendKeys()
 *
 */
public class CommonMethods extends BaseTest
{
	public static void enter(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	public static void click(WebElement arrowIcon)
	{
		arrowIcon.click();
	}
	public static void clear(WebElement cle)
	{
		cle.clear();
	}
	public static void screenshotpage() throws IOException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotFile,new File("./ScreenShots/" + sdf.format(d) + ".png"));

	}
//	public static void screenShotPage() throws IOException {
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
//		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Files.copy(screenshotFile, new File("./ScreenShots/"+sdf.format(d)+".png"));
//	}
	public static String readingUserName(int i) {
		return ExcelSheet.readDataFromExcel("Sheet1", i, 0,"./ExcelSheet/LoginCred.xlsx");
	}
	public static String readingPassword(int i) {
		return ExcelSheet.readDataFromExcel("Sheet1", i, 1,"./ExcelSheet/LoginCred.xlsx");
	}
	public static ExtentTest startingTest(String testcase) {
		return reports.startTest(testcase);
	}
	public static void end(String s1,String s2) {
		etest.log(LogStatus.INFO,s1);
		etest.log(LogStatus.PASS,s2);

	}
	public static void failTest(String s1,String s2,String s3) {
		etest.log(LogStatus.INFO,s1);
		etest.log(LogStatus.FAIL,s2);
		etest.log(LogStatus.ERROR,s3);
	}
	public static void warnTest(String s1,String s2) {
		etest.log(LogStatus.INFO,s1);
		etest.log(LogStatus.WARNING,s2);
		
	}
}
