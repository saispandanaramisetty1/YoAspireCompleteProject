package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.util.CommonMethods;

public class MyDrives {

//	  @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/div[1]/img[1]")
//		public WebElement mydrive;
	@FindBy(xpath = "(//SPAN[@class='navbar-option-txt'][text()='My Drives'][text()='My Drives'])[1]")
	public WebElement mydrive;
	@FindBy(xpath = "//SPAN[@class='icon-add create-drive-icon']")
	public WebElement add;

	public void drives() throws InterruptedException {
		Thread.sleep(2000);
		CommonMethods.click(mydrive);
		Thread.sleep(2000);
		CommonMethods.click(mydrive);

	}

	public void adding() throws InterruptedException {
		Thread.sleep(3000);
		CommonMethods.click(add);

	}

}
