package com.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.basetest.BaseTest;
import com.pages.EditProfile;
import com.pages.Profile;
import com.pages.ProfileBio;
import com.pages.UserPage;
import com.relevantcodes.extentreports.LogStatus;
import com.util.ExcelSheet;
/**
 * 
 * @author TestCases
 * Class for executing the different Test Cases
 *
 */
public class TestCases extends BaseTest
{
	 
	@Test(priority=1)
	public static void login() throws Exception
	{
		etest = reports.startTest("testcase1");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		String userName = ExcelSheet.readDataFromExcel("UserPageExcel", 1, 1,"./ExcelSheet/UserPageExcel.xlsx");
		String password = ExcelSheet.readDataFromExcel("UserPageExcel", 1, 2,"./ExcelSheet/UserPageExcel.xlsx");
		user.login(userName, password);
		etest.log(LogStatus.INFO, "login with valid credentials");
		etest.log(LogStatus.PASS, "Test is passed");
	}
	@Test(priority=2)
	public static void registerForDrives() throws Exception
	{
		etest = reports.startTest("testcase2");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		user.driveRegistration();
		etest.log(LogStatus.INFO, "register for drives");
		etest.log(LogStatus.PASS, "Test is passed");	
	}
	@Test(priority=3)
	public static void recommendConections() throws Exception
	{
		etest = reports.startTest("testcase3");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		String search = ExcelSheet.readDataFromExcel("UserPageExcel", 2, 1,"./ExcelSheet/UserPageExcel.xlsx");
		String text = ExcelSheet.readDataFromExcel("UserPageExcel", 2, 2,"./ExcelSheet/UserPageExcel.xlsx");
		user.recommendingConnections(search,text);
		etest.log(LogStatus.INFO, "recommend connections");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=4)
	public static void connections() throws Exception
	{
		etest = reports.startTest("testcase4");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		String search = ExcelSheet.readDataFromExcel("UserPageExcel", 3, 1,"./ExcelSheet/UserPageExcel.xlsx");
		user.myConnections(search);
		etest.log(LogStatus.INFO, "connect to the new users");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=5)
	public static void connectionsConnections() throws Exception
	{
		etest = reports.startTest("testcase5");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		String text = ExcelSheet.readDataFromExcel("UserPageExcel", 4, 1,"./ExcelSheet/UserPageExcel.xlsx");
		user.connectionConnections(text);
		etest.log(LogStatus.INFO, "connecting tho the friend connections");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=6)
	public static void articles() throws Exception
	{
		etest = reports.startTest("testcase6");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		user.articles();
		etest.log(LogStatus.INFO, "open and read articles");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	@Test(priority=7)
	public static void messages() throws Exception
	{
		etest = reports.startTest("testcase7");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		String message = ExcelSheet.readDataFromExcel("UserPageExcel", 5, 1,"./ExcelSheet/UserPageExcel.xlsx");
		user.messages(message);
		etest.log(LogStatus.INFO, "sending messages");
		etest.log(LogStatus.PASS,"Test is passed");
	}
	//Edit proofile and click cancel button
		@Test(priority=8)
		public void editWithCancel() throws InterruptedException
		{
			
			etest = reports.startTest("edit profile and click on cancel");
			driver.navigate().refresh();
			Thread.sleep(5000);
			EditProfile edit=PageFactory.initElements(BaseTest.driver, EditProfile.class);
			String last=ExcelSheet.readDataFromExcel("jyo", 4, 0,"./ExcelSheet/Registration.xlsx");
			String city=ExcelSheet.readDataFromExcel("jyo", 4, 1,"./ExcelSheet/Registration.xlsx");
			String num=ExcelSheet.readDataFromExcel("jyo", 4, 2,"./ExcelSheet/Registration.xlsx");
			edit.editAndCancel(last, city, num);
			etest.log(LogStatus.INFO, "In  edit");
			etest.log(LogStatus.PASS, "Test is passed");
		
		}
		
		
		//Edit profile and click save button
		@Test(priority=9)
		public void editWithSave() throws InterruptedException
		{
			
			logger.info("test is started");
			etest = reports.startTest("edit profile and click on save");
			driver.navigate().refresh();
			Thread.sleep(5000);
			EditProfile edit=PageFactory.initElements(BaseTest.driver, EditProfile.class);
			String last=ExcelSheet.readDataFromExcel("jyo", 4, 0,"./ExcelSheet/Registration.xlsx");
			String city=ExcelSheet.readDataFromExcel("jyo", 4, 1,"./ExcelSheet/Registration.xlsx");
			String num=ExcelSheet.readDataFromExcel("jyo", 4, 2,"./ExcelSheet/Registration.xlsx");
			edit.editAndSave(last, city, num);
			etest.log(LogStatus.INFO, "In  edit");
			etest.log(LogStatus.PASS, "Test is passed");
		
		}
		
		//Edit bio and click cancel button
		@Test(priority=10)
		public void bioWithcancel() throws InterruptedException
		{
			
			logger.info("test is started");
			etest = reports.startTest(" edit bio and click on cancel");
			driver.navigate().refresh();
			Thread.sleep(5000);
			ProfileBio bio=PageFactory.initElements(BaseTest.driver, ProfileBio.class);
			String text=ExcelSheet.readDataFromExcel("jyo", 5, 1,"./ExcelSheet/Registration.xlsx");
			bio.bioWithCancel(text);
			etest.log(LogStatus.INFO, "In  bio");
			etest.log(LogStatus.PASS, "Test is passed");
		
		}
		
		//edit profile and click save
		@Test(priority=11)
		public void bioWithSave() throws InterruptedException
		{
		
			logger.info("test is started");
			etest = reports.startTest("edit bio and click on save");
			driver.navigate().refresh();
			Thread.sleep(5000);
			ProfileBio bio=PageFactory.initElements(BaseTest.driver, ProfileBio.class);
			String text=ExcelSheet.readDataFromExcel("jyo", 5, 1,"./ExcelSheet/Registration.xlsx");
			bio.bioWithsave(text);
			etest.log(LogStatus.INFO, "In  bio");
			etest.log(LogStatus.PASS, "Test is passed");
		
		
		}
		
		//Add work experience and click cancel button
		@Test(priority=12)
		public void workExperenceWithCancel() throws InterruptedException
		{
			
			logger.info("test is started");
			etest = reports.startTest("add work experience and click on cancel");
			driver.navigate().refresh();
			Thread.sleep(5000);
			Profile work=PageFactory.initElements(BaseTest.driver, Profile.class);
			String company=ExcelSheet.readDataFromExcel("jyo", 6, 1,"./ExcelSheet/Registration.xlsx");
			String des=ExcelSheet.readDataFromExcel("jyo", 6, 2,"./ExcelSheet/Registration.xlsx");
			String location=ExcelSheet.readDataFromExcel("jyo", 6, 3,"./ExcelSheet/Registration.xlsx");
			String discription=ExcelSheet.readDataFromExcel("jyo", 6, 4,"./ExcelSheet/Registration.xlsx");
			work.workExperienceAndClose(company, des, location, discription);
			etest.log(LogStatus.INFO, "In  sort by last name");
			etest.log(LogStatus.PASS, "Test is passed");
		
		}
		
		//Add work experience and click save button
		@Test(priority=13)
		public void workExperenceWithSave() throws InterruptedException
		{
			
			logger.info("test is started");
			etest = reports.startTest("add work experience click on save");
			driver.navigate().refresh();
			Thread.sleep(5000);
			Profile work=PageFactory.initElements(BaseTest.driver, Profile.class);
			String company=ExcelSheet.readDataFromExcel("jyo", 6, 1,"./ExcelSheet/Registration.xlsx");
			String des=ExcelSheet.readDataFromExcel("jyo", 6, 2,"./ExcelSheet/Registration.xlsx");
			String location=ExcelSheet.readDataFromExcel("jyo", 6, 3,"./ExcelSheet/Registration.xlsx");
			String discription=ExcelSheet.readDataFromExcel("jyo", 6, 4,"./ExcelSheet/Registration.xlsx");
			work.workExperienceAndSave(company, des, location, discription);
			etest.log(LogStatus.INFO, "In  sort by last name");
			etest.log(LogStatus.PASS, "Test is passed");
		
		}

	//Add the skills and click cancel button
		@Test(priority=14)
		public void cancelSkil() throws InterruptedException
		{
			
			logger.info("test is started");
			etest = reports.startTest("add skils and click on cancel");
			Thread.sleep(5000);
			Profile skil=PageFactory.initElements(BaseTest.driver, Profile.class);
			String skils=ExcelSheet.readDataFromExcel("jyo", 7, 1,"./ExcelSheet/Registration.xlsx");
			skil.cancelSkills(skils);
			etest.log(LogStatus.INFO, "In  skils");
			etest.log(LogStatus.PASS, "Test is passed");
			driver.navigate().refresh();
		
		}
		
		//Add skills and click save button
		@Test(priority=15)
		public void addSkil() throws InterruptedException
		{
			
			logger.info("test is started");
			etest = reports.startTest("add skils and click on save");
			Thread.sleep(5000);
			Profile skil=PageFactory.initElements(BaseTest.driver, Profile.class);
			String skils=ExcelSheet.readDataFromExcel("jyo", 7, 1,"./ExcelSheet/Registration.xlsx");
			skil.addSkills(skils);
			etest.log(LogStatus.INFO, "In  skils");
			etest.log(LogStatus.PASS, "Test is passed");
		
		}
		
		
		
		//Add gender and click cancel button
		@Test(priority=16)
		public void cancelGenders() throws InterruptedException
		{
			logger.info("test is started");
			etest = reports.startTest("add gender and click cancel");
			Thread.sleep(5000);
			Profile skil=PageFactory.initElements(BaseTest.driver, Profile.class);
			skil.cancelGender();
			etest.log(LogStatus.INFO, "In  gender");
			etest.log(LogStatus.PASS, "Test is passed");
			driver.navigate().refresh();
		
		}
		
		
		//Add gender and click save Button
		@Test(priority=17)
		public void addGenders() throws InterruptedException
		{
			
			etest = reports.startTest(" add gender and click on save");
			Thread.sleep(5000);
			Profile skil=PageFactory.initElements(BaseTest.driver, Profile.class);
			skil.addGender();
			etest.log(LogStatus.INFO, "In  gender");
			etest.log(LogStatus.PASS, "Test is passed");
		
		}
	@Test(priority=18)
	public static void logOut() throws Exception
	{
		etest = reports.startTest("testcase7");
		UserPage user = PageFactory.initElements(BaseTest.driver, UserPage.class);
		user.logout();
		etest.log(LogStatus.INFO, "logout");
		etest.log(LogStatus.PASS,"Test is passed");
	}

}
