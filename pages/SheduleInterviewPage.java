package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.basetest.BaseTest;
import com.util.CommonMethods;



public class SheduleInterviewPage {
	@FindBy(xpath="//input[@type='text'][@name='date']")
	public WebElement dateField;
	@FindBy(xpath="//DIV[@class='picker__day picker__day--infocus'][text()='9']")
	public WebElement date;
	@FindBy(xpath="//BUTTON[@class='btn-flat picker__close'][text()='Close']")
	public WebElement close;
	@FindBy(xpath="//input[@type='text'][@value='HH']")
	public WebElement hours;
	@FindBy(xpath="//SPAN[text()='2']")
	public WebElement two;
	@FindBy(xpath="//input[@type='text'][@value='MM']")
	public WebElement minutes;
	@FindBy(xpath="//SPAN[text()='00']")
	public WebElement clickmin;
	@FindBy(xpath="//input[@type='text'][@name='candidate_contact']")
	public WebElement contactDetails;
	@FindBy(xpath="//LABEL[@class='active']")
	public WebElement interviewer;
	@FindBy(xpath="//BUTTON[@class='btn waves-effect waves-light'][text()='Schedule']")
	public WebElement schedulebutton;
	@FindBy(xpath="//DIV[@class='picker__nav--next'][text()=' ']")
	public WebElement clickNext;
	@FindBy(xpath="(//BUTTON[@class='btn waves-effect waves-light btn-flat modal-action modal-close'][text()='Close'][text()='Close'])[4]")
	public WebElement closeButton;
	
	
	
	public void scheduleint(String number) throws InterruptedException {
		Thread.sleep(5000);
		CommonMethods.click(dateField);
		CommonMethods.click(clickNext);
		CommonMethods.click(date);
		Actions action = new Actions(BaseTest.driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		CommonMethods.click(close);
		Thread.sleep(3000);
		CommonMethods.click(hours);
		CommonMethods.click(two);                          
		CommonMethods.click(minutes);
		Thread.sleep(1000);
		CommonMethods.click(clickmin);
		Thread.sleep(1000);
		CommonMethods.enter(contactDetails, number);
		CommonMethods.click(interviewer);
		//CommonMethods.click(schedulebutton);
		CommonMethods.click(closeButton);
		
	}
	

}
