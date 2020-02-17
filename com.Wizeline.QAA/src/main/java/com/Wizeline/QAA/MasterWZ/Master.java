package com.Wizeline.QAA.MasterWZ;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Master {

	public static WebDriver driver;
	public static Properties globalDataFile;
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest logger; 
	
	public Master() {
		
		globalDataFile = new Properties();
		String globalFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\globalData.properties";
		try {
			globalDataFile.load(new FileInputStream(globalFilePath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
	public static void launchAndNavigate() {
		
		String browser = "chrome";
		String driverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe";
		String url = globalDataFile.getProperty("url");
		switch(browser){
			
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();			
			 break;
		case "IE": ;//TBD
		case "FF": ; //TBD
		default:
			
			System.out.println("Please enter a valid browser"); //This will be reported to the report file later.
			;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);		
	}
	

	public static void tearDown() {
		driver.quit();
	}

	
	public static void initiateReporting() {
		//Use simpleDateFormatter.
		String htmlReportPath = System.getProperty("user.dir") + "\\Reports\\ExtentReport.html";
		html = new ExtentHtmlReporter(htmlReportPath);
		extent = new ExtentReports();
		extent.attachReporter(html);
		logger = extent.createTest("Main log in Test Case :");
		logger.info("Test Case execution started .");
	}
	
	public static void flushReport() {
		
		extent.flush();
		
	}
	
	
}





















