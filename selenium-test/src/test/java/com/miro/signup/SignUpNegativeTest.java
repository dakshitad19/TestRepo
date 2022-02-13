package com.miro.signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpNegativeTest {

	//Validating Error/Warning Message

	@Test(priority=1, enabled = true, groups = { "signupNegativeTests", "smokeTests" })

	public void emptyUsernameTest() {


		System.out.println("Starting incorrectUsernameTest");


		//Create driver
		System.setProperty("webdriver.chrome.driver", "/Users/zc-dakshitad/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();


		// open link
		String url = "https://miro.com/signup/";
		driver.get(url);
		System.out.println("Page is open.");


		driver.manage().window().maximize();


		//emptyname
		WebElement emptyname = driver.findElement(By.id("name"));
		emptyname.sendKeys("");


		//email
		WebElement workemail = driver.findElement(By.id("email"));
		workemail.sendKeys("tiasharma12@gmail.com");

		//password
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Miro@1234DAKSHITAhello");


		//checkbox
		WebElement checkbox = driver.findElement(By.className("mr-checkbox-1__check"));
		checkbox.click();

		//getStartedNow Button
		WebElement getStartedNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/form/button"));
		getStartedNow.click();


		//Empty name Verifications 

		WebElement errorMsg = driver.findElement(By.id("nameError")); 
		String expectedErrorMsg ="Please enter your name."; 
		String actualErrorMsg = errorMsg.getText();
		Assert.assertEquals(actualErrorMsg,expectedErrorMsg, "Actual Error message for NAME is not the same as expected");


		//close browser
		//driver.quit();


	}

	@Test(priority=2, enabled = true, groups = { "signupNegativeTests"})


	public void incorrectEmailTest() {


		System.out.println("Starting incorrectEmailTest");


		//Create driver
		System.setProperty("webdriver.chrome.driver", "/Users/zc-dakshitad/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();


		// open link
		String url = "https://miro.com/signup/";
		driver.get(url);
		System.out.println("Page is open.");


		driver.manage().window().maximize();


		//name
		WebElement emptyname = driver.findElement(By.id("name"));
		emptyname.sendKeys("Zoe");



		//email
		WebElement workemail = driver.findElement(By.id("email"));
		workemail.sendKeys("zoegmail.com");

		//password
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Miro@1234DAKSHITAhello");

		//checkbox
		WebElement checkbox = driver.findElement(By.className("mr-checkbox-1__check"));
		checkbox.click();

		//getStartedNow Button
		WebElement getStartedNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/form/button"));
		getStartedNow.click();


		//Invalid Email verifications
		WebElement emailErrorMsg = driver.findElement(By.id("emailError")); 
		String expectedEmailErrorMsg ="Enter a valid email address."; 
		String actualEmailErrorMsg = emailErrorMsg.getText();
		Assert.assertEquals(actualEmailErrorMsg,expectedEmailErrorMsg, "Actual Email Error Msg is not the same as expected");


		//close browser
		//driver.quit();



	}


	@Test(priority=3, enabled = true, groups = { "signupNegativeTests"})


	public void existingEmailTest() {


		System.out.println("Starting existingEmailTest");


		//Create driver
		System.setProperty("webdriver.chrome.driver", "/Users/zc-dakshitad/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();


		// open link
		String url = "https://miro.com/signup/";
		driver.get(url);
		System.out.println("Page is open.");


		driver.manage().window().maximize();


		//name
		WebElement emptyname = driver.findElement(By.id("name"));
		emptyname.sendKeys("Dakshita");



		//email
		WebElement workemail = driver.findElement(By.id("email"));
		workemail.sendKeys("dakshitad19@gmail.com");

		//password
		WebElement password = driver.findElement(By.cssSelector("#password"));
		password.sendKeys("Miro@1234DAKSHITAhello");

		//checkbox
		WebElement checkbox = driver.findElement(By.className("mr-checkbox-1__check"));
		checkbox.click();

		//getStartedNow Button
		WebElement getStartedNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/form/button"));
		getStartedNow.click();


		//Existing Email verifications
		WebElement existEmailMsg = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/form/div[1]/div[2]/div[2]/div/label")); 
		String expectedExistEmailMsg ="Sorry, this email is already registered"; 
		String actualExistEmailMsg = existEmailMsg.getText();
		Assert.assertEquals(actualExistEmailMsg,expectedExistEmailMsg, "Actual Existing Email Error Msg is not the same as expected");


		//close browser
		//driver.quit();



	}
	@Test (priority=4, enabled = true, groups = { "signupNegativeTests"})

	public void incorrectPasswordTest() {


		System.out.println("Starting incorrectPasswordTest");


		//Create driver
		System.setProperty("webdriver.chrome.driver", "/Users/zc-dakshitad/Downloads/chromedriver");		
		WebDriver driver = new ChromeDriver();

		// open link
		String url = "https://miro.com/signup/";
		driver.get(url);
		System.out.println("Page is open.");


		driver.manage().window().maximize();


		//name
		WebElement emptyname = driver.findElement(By.id("name"));
		emptyname.sendKeys("Pooja");



		//email
		WebElement workemail = driver.findElement(By.id("email"));
		workemail.sendKeys("pooja123@gmail.com");

		//password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("M");

		//checkbox
		WebElement checkbox = driver.findElement(By.className("mr-checkbox-1__check"));
		checkbox.click();

		//getStartedNow Button
		WebElement getStartedNow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/form/button"));
		getStartedNow.click();


		//password  verifications
		WebElement pwErrordMsg = driver.findElement(By.id("signup-form-password"));
		String expectedWarnMsg = "Please use 8+ characters for secure password.";
		String actualWarnMsg = pwErrordMsg.getAttribute("data-text-default");
		Assert.assertEquals(actualWarnMsg,expectedWarnMsg, "Actual Password Warning message is not the same as expected");

		//close browser
		//driver.quit();


	}




}


