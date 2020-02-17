package com.Wizeline.QAA.PagesWZ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Wizeline.QAA.MasterWZ.Master;

public class LoginWindowPage extends Master{
	
	
	@FindBy(id="email") WebElement loginIDField;
	@FindBy(id="password") WebElement loginPasswordField;
	@FindBy(xpath="//button[@class = 'submit_btn ist_button ist_button_red sel_login']") WebElement loginButton;
	
	public LoginWindowPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void login(String email, String password) {

		//CODE to debug to see window handles....

		
		
		
		loginIDField.sendKeys(email);
		loginPasswordField.sendKeys(password);
		loginButton.click();
		
	}
	
}
