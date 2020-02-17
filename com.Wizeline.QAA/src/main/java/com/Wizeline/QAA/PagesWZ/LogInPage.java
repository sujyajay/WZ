package com.Wizeline.QAA.PagesWZ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Wizeline.QAA.MasterWZ.Master;

public class LogInPage extends Master{


	
	@FindBy(xpath = "//ul[@class='W9ktc']//li//a[text()='Login']") WebElement loginLink;
	
	
	public LogInPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void launchLoginWindow() {
		
		loginLink.click();
		
	}

	
}
