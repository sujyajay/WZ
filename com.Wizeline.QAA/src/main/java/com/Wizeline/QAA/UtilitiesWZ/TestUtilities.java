package com.Wizeline.QAA.UtilitiesWZ;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Wizeline.QAA.MasterWZ.Master;

public class TestUtilities extends Master{

	
	public static void getScreenshot() throws IOException {
		
		String defaultName = "TestScreen"; //To be updated dynamically later.
		String screenshotPath = System.getProperty("user.dir") + "\\Screenshots\\" + defaultName + ".png";
		
		TakesScreenshot screen = (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File dest = new File(screenshotPath);
		FileUtils.copyFile(src, dest);
	}

	public static void readXLFile() {
		//TBD
	}
	
}
