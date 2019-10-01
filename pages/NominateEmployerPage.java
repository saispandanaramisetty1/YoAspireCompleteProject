package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;



public class NominateEmployerPage {
	@FindBy(xpath="(//SPAN[@class='navbar-option-txt'][text()='My Drives'][text()='My Drives'])[1]")
	public WebElement myDrives;
	@FindBy(xpath="//P[@class='drive-name'][text()='Virtusa Polaris Off Campus Drive 2019']")
	public WebElement driveName;
	@FindBy(xpath="//I[@class='icon-card-drop-down-arrow3']")
	public WebElement arrow;
	@FindBy(xpath="//BUTTON[@class='btn connect-btn'][text()='Edit Drive Info']")
	public WebElement editDrive;
	@FindBy(xpath="//BUTTON[@class='btn register-drive-btn'][text()='Nominate Employers']")
	public WebElement nominate;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement search;
	@FindBy(xpath="//BUTTON[@value='5c24999ce7179a7487984431'][text()='Add']")
	public WebElement add;
	@FindBy(xpath="//A[@class='archivelist-link'][text()='Back to Drive Details']")
	public WebElement backToDrives;
	@FindBy(xpath="//BUTTON[@value='5c24999ce7179a7487984431'][text()='Remove']")
	public WebElement remove;
	
	public void nominateEmployer(String name) throws InterruptedException {
		Thread.sleep(5000);
		CommonMethods.click(myDrives);
		Thread.sleep(2000);
		CommonMethods.click(driveName);
		Thread.sleep(2000);
		CommonMethods.click(arrow);
		CommonMethods.click(editDrive);
		CommonMethods.click(nominate);
		Thread.sleep(3000);
		CommonMethods.enter(search,name);
		Thread.sleep(2000);
		CommonMethods.click(add);
		
	}
	public void removeEmployer() throws InterruptedException {
		Thread.sleep(3000);
		CommonMethods.click(remove);
		CommonMethods.click(backToDrives);
	}

}
