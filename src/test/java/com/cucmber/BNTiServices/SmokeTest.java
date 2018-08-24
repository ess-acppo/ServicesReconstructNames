package com.cucmber.BNTiServices;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	Scenario scenario = BeforeAfter.scenarios;
	WebDriver driver = BeforeAfter.drivers;
	String URL = BeforeAfter.URL;

	@Before(value = "@Feature")
	public void Setup(Scenario scenario) {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@After(value = "@Feature")
	public void teardown(Scenario scenario) throws IOException {
		
		BeforeAfter.scenarios = scenario;
		BeforeAfter.drivers = driver;
	}

	
	
	@Given("^User is logged in$")
	public void user_is_logged_in() throws Throwable {

		driver.findElement(By.cssSelector("[id='dLabel']")).click();

		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul[2]/li[2]/ul/li/div/form/label[1]/input"))
				.sendKeys("jamie");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul[2]/li[2]/ul/li/div/form/label[2]/input"))
				.sendKeys("password");

		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul[2]/li[2]/ul/li/div/form/input[2]")).click();
		Thread.sleep(2000);
	}

	@When("^user as admin clicks on Reconstruct name strings$")
	public void user_as_admin_clicks_on_Reconstruct_name_strings() throws Throwable {
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/ul[2]/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/div[1]/div/div[2]/ul/li[2]/a")).click();
								//	 /html/body/div[4]/div/div/div/div[1]/div/div[1]/div/div[2]/ul/li[2]/a
	}

	@Then("^Name Strings are generated$")
	public void name_Strings_are_generated() throws Throwable {
		
		Thread.sleep(15000);
		String TextDisplayed = driver.findElement(By.xpath("/html/body/div[3]")).getText();
		String ExpectedResult = "reconstructing all names where changed" ;
	    //reconstructing all names where changed. is displayed 
		Assert.assertTrue(TextDisplayed.contains(ExpectedResult));
	
		
	}
	
}
