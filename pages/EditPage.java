package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;

public class EditPage {
	@FindBy(xpath = "(//P[@class='date-txt'][text()='04 | Apr'][text()='04 | Apr'])[1]")
	public WebElement drive;
	@FindBy(xpath = "//I[@class='icon-card-drop-down-arrow3']")
	public WebElement drivearrow;
	@FindBy(xpath = "//BUTTON[@class='btn connect-btn'][text()='Edit Drive Info']")
	public WebElement editdriveinfo;
	@FindBy(xpath = "//BUTTON[@class='btn register-drive-btn'][text()='Edit']")
	public WebElement edit;

	
	public void specific() throws Exception
	{
		Thread.sleep(2000);
		CommonMethods.click(drive);
	}
	public  void details () throws Exception
	{
		Thread.sleep(3000);
		CommonMethods.click(drivearrow);

	}
	public  void editdriveinfo () throws Exception 
	{
		Thread.sleep(3000);
		CommonMethods.click(editdriveinfo);
		CommonMethods.click(edit);
	}	
	
}


