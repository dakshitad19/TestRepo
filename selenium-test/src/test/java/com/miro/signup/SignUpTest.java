package com.miro.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


public class SignUpTest{

	@Test // Validating Success Message

	public void signupTest(){
		System.out.println("Starting Test");


		//Create driver
		System.setProperty("webdriver.chrome.driver", "/Users/zc-dakshitad/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();


		// open link
		String url = "https://miro.com/signup/";
		driver.get(url);
		System.out.println("Page is open.");


		driver.manage().window().maximize();


		//name
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Dakshita Dhaundiyal");

		//email
		WebElement workemail = driver.findElement(By.id("email"));
		workemail.sendKeys("zain12@gmail.com");

		//password
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Miro@1234DAKSHITAhello");


		//checkbox
		WebElement checkbox = driver.findElement(By.className("mr-checkbox-1__check"));
		checkbox.click();



		//cookies
		WebElement cookies = driver.findElement(By.cssSelector("#onetrust-accept-btn-handler"));
		cookies.click();

		//getStartedNow Button
		WebElement getStartedNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/form/button"));
		getStartedNow.click();


		// successful email msg
		WebElement emailmsg = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/h1"));
		emailmsg.click();
		String expectedMsg = "Check your email";
		String actualMsg = emailmsg.getText();
		Assert.assertTrue(actualMsg.contains(expectedMsg), "Actuals message does not contain expected msg.\nActualMsg: " 
				+ actualMsg + "\nExpectedMsg:" + expectedMsg );
		


		//Verification of check your mail screen
		String expectedUrl = "https://miro.com/email-confirm/";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,expectedUrl, "Actuals page URL is not the same as expected"); // if the test fails then driver will print this msg





	}




}
