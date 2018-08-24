package com.cucmber.BNTiServices;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucmber.BNTiServices.EncryptTest;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BeforeAfter {
	
	/*Setup Config */
	public static String username ;	
	public static String password;	
	public static String URL ;
	public static Scenario scenarios;
	public static WebDriver drivers;
	
	@Before(order =1)
	public void GlobalTestSetup(Scenario scenario) throws IOException {
		System.out.println("---------GLOBAL TEST ENVIRONMENT---------");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+File.separator+"BROWSERS"+File.separator+"geckodriver.exe");
		EncryptTest e = new EncryptTest();
		
	}

	@After(order =1)
	public void GlobalTestTearDown(Scenario scenario) {

		System.out.println("----GLOBAL TEST ENVIRONMENT TEARDOWN-----");
		
		if (scenario.isFailed()) {
			// take ScreenShot
			{
				System.out.println("------Test has Failed---");
				final byte[] screenshot = ((TakesScreenshot) drivers).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png"); // stick it in the report
				System.out.println("inside Report");
			}
		}
		
		//drivers.close();
		drivers.quit();
	}

}