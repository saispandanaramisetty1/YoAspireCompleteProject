package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;

public class InterviewedPage {
	@FindBy(xpath="//P[@class='drive-name'][text()='Syntel Mega Off Campus Drive 2019 ']")
	public WebElement driveName;
	@FindBy(xpath="//a[text()='Interviewed (1)']")
	public WebElement interviewed;
	@FindBy(xpath="//BUTTON[@class='btn connect-btn'][text()='Feedback']")
	public WebElement feedback;
	
	
	public void viewFeedback() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(driveName);
		Thread.sleep(2000);
		CommonMethods.click(interviewed);
		CommonMethods.click(feedback);
	}
}
