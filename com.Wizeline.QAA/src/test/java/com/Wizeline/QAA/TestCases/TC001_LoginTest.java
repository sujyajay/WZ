package com.Wizeline.QAA.TestCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Wizeline.QAA.MasterWZ.Master;

public class TC001_LoginTest extends Master{
	

	@BeforeSuite
	public void initiateReport() {
		initiateReporting();
	}
	
	@AfterSuite
	public void saveReport() {
		flushReport();
	}
	
	
	@Test
	public void loginToWZ() {
		//to call Pages and methods  :
	}
	
	@BeforeMethod
	public void preMethodConditions() {
		
		
	}
	
	
	@AfterMethod
	public void postMethodConditions() {
		
	}
		
}