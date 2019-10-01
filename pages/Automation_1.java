package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import com.basetest.BaseTest;
import com.util.CommonMethods;



public class Automation_1 extends BaseTest{
	
	@FindBy(how = How.XPATH, using = ("//I[@class='icon-arrow']"))
	private  WebElement downarrow;
	
	@FindBy(how = How.XPATH, using = ("//INPUT[@id='input_11']"))
	private WebElement enter_un;
	
	@FindBy(how = How.XPATH, using = ("//INPUT[@id='input_12']"))
	private WebElement enter_pwd;
	
	@FindBy(how = How.XPATH, using = ("//BUTTON[@class='btn signin-btn'][text()='Sign in']"))
	private WebElement click_sign_in;
	
	@FindBy(how = How.XPATH, using = ("(//I[@class='icon-calendericonmenu'])[1]"))
	private WebElement MyDrives;
	
	@FindBy(how = How.XPATH, using = ("(//IMG[@src='/static/media/admin.dc8eb05f.jpg'])[1]"))
	private WebElement click_drive;
	
	@FindBy(how = How.XPATH, using = "//a[text()='View Feedback (3)']")
	private WebElement viewFeedback;
	
	@FindBy(how = How.XPATH, using = ("//BUTTON[@class='btn connect-btn'][text()='Feedback']"))
	private WebElement click_feedback;

	@FindBy(how = How.XPATH, using = ("//IMG[@src='https://yoaspire.com:8050/public/images/15458201955583fd4c63f-9845-43c3-b497-026bb6535abd.jpg']")) 
	private WebElement profile;
	@FindBy(how = How.XPATH, using = ("//A[text()='Sign Out']"))
	private WebElement signOut;
	@FindBy(how = How.XPATH, using = ("(//BUTTON[@class='btn'][text()='Sign Out'][text()='Sign Out'])[1]"))
	private WebElement signOutCl;
	public void Test1(String un,String pwd) throws Exception
	{
		driver.navigate().refresh();
		CommonMethods.click(downarrow);
		Thread.sleep(3000);
		CommonMethods.enter(enter_un, un);
		Thread.sleep(3000);
		CommonMethods.enter(enter_pwd, pwd);
		CommonMethods.click(click_sign_in);
		Thread.sleep(3000);
		CommonMethods.click(MyDrives);
		Thread.sleep(5000);

		CommonMethods.click(click_drive);
		Thread.sleep(5000);

		CommonMethods.click(viewFeedback);
		Thread.sleep(5000);

		CommonMethods.click(click_feedback);
		Thread.sleep(3000);
		profile.click();
		Thread.sleep(3000);
		signOut.click();
		Thread.sleep(3000);
		signOutCl.click();
		Thread.sleep(3000);
	}
	
	
	
}
