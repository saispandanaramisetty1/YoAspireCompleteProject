package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditInfo {
	@FindBy(xpath = "(//SPAN[@class='navbar-option-txt'][text()='My Drives'][text()='My Drives'])[1]")
	public WebElement clickOnDrives;
	
	@FindBy(xpath = "(//DIV[@class='row'])[1]")	
	public WebElement clickOnParDrive;
	
	@FindBy(xpath = "//I[@class='icon-card-drop-down-arrow3']")
	public WebElement downArrow;
	
	@FindBy(xpath = "//BUTTON[@class='btn connect-btn'][text()='Edit Drive Info']")
	public WebElement editInfo;
	
	public void navigateToEditData() throws InterruptedException {
		Thread.sleep(5000);
		clickOnDrives.click();
		Thread.sleep(3000);
		clickOnDrives.click();
		Thread.sleep(2000);
		clickOnParDrive.click();
		Thread.sleep(2000);
		downArrow.click();
	}
}
