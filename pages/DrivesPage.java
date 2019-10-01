package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;



public class DrivesPage {
	@FindBy(xpath="//P[@class='drive-name'][text()='Virtusa Polaris Off Campus Drive 2019']")
	public WebElement driveName;
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light connect-btn'][text()='Schedule']")
	public WebElement scheduleButton;
	
	public void schedule() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(driveName);
		Thread.sleep(2000);
		CommonMethods.click(scheduleButton);
		
	}

}
