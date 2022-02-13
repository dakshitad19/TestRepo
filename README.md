# TestRepo
TestRepo for sign-up feature of MIRO
**TITLE**
E2E test case for the functionality of the feature Sign-up in Miro

**UI WEBDRIVER**
Selenium has been used for automating this Sign-up feature 

**LANGUAGE**
 JAVA

**BUILD AUTOMATION TOOL**
Maven 

 **POM File**
Pom file consist of maven compiler and maven surefire plugins dependencies 

**IDE** 
Eclipse 

**PROJECT STRUCTURE DETAILS** 
1.	selenium-test is the project name 
2.	Under the selenium-test/src/main/resources – (chromedriver) is present
3.	Under selenium-test/src/test/java – com.miro.signup (Package is present)
4.	Package contains Test file – SignUpTest.java & SignUpNegativeTest.java
5.	SignUpTest.java contains all the positive Validation Success messages and Verifications along with each WebElement has been automated using Selenium driver 
6.	SignUpNegativeTest.java contains all the Validations /Error messages display in case of invalid and incorrect inputs given by the user 
7.	 @Test annotations has been used from Testng along with the Test Groups  

**CHROMEDRIVER**
1.	Chromedriver has been used, the path has  been given wherever is the chrome driver is present in your system , in my case it is under the DOWNLOADS FOLDER 
2.	Use latest chromedriver version check the version of your chrome from the HELP section of Chrome Browser 
For e.g -   System.setProperty("webdriver.chrome.driver", "/Users/zc-dakshitad/Downloads/chromedriver");
Syntax -   System.setProperty(string key , string value)  

**RUN TestNg**
1.	Download the TestNg from ECLIPSE Marketplace and run the project -> Right click -> Run -> Testng Test
2.	The other option Run from TERMINAL (Mac users)
o	Go to terminal > cd path of your IDE 
o	For E.G - cd eclipse-workspace > cd selenium-test > mvn clean test 
3.	RUN mvn clean test command by which all the test case will run one by one when the test end all the Test Reports will print in Terminal 


**TEST CASE FOR SignUpTest.java** 
1.	In the first file SignUpTest.java – Method name is signupTest()
2.	Driver has been created , WebElements has been automated (Name, Email, Password, Checkbox, Accept Cookies, GetStartedNow Button, Successful Check Your Email msg)
3.	 Positive Assertions has been added to check Actual msg = Expected msg using assertEquals() method


**DATA FOR TEST ASSERTIONS IN SignUpTest.java **

1.	It is positive assertion so we need to give new EMAIL ID every time for success of this test, please use below Email-Id’s.



•	ayesha123@gmail.com

•	rahul890@yahoo.com

•	soumya909@gmail.com

•	anoopsharma12@gmail.com






**TEST CASE FOR SignUpNegativeTest.java**
1.	In the second file SignUpNegativeTest.java – there are 3 Test has been added 
•	The First test is emptyUserNameTest() // in which user will not give any value in the NAME placeholder and give inputs in Email and password and click on Getstartednow Button.
•	In this test case the Expected error msg = “Please enter your name.”;
•	Assert method has been used to verify the expected msg and if test will fail some message will print in console.
•	Here the DATA ASSERTIONS for empty user is only this - //emptyname
		WebElement emptyname = driver.findElement(By.id("name"));
		emptyname.sendKeys("");


2.	**The second test is incorrectEmailTest() // **
•	in which user fails to match the validation for an email which includes - @,valid domain name and username.
•	Invalid Email verification Assertion has been used verify the actual msg =  expected msg and if test will fail some message will print in console.

**DATA FOR TEST ASSERTIONS IN incorrectEmailTest()  in SignUpNegativeTest.java
1.	Send these invalid email data under sendkeys -> 
		WebElement workemail = driver.findElement(By.id("email"));
		workemail.sendKeys("Dakshitayahoocom ");

Dakshitayahoocom
yash@gmailcom
rahulgmail.com









**3.	The third test is existingEmailTest()//**
•	Here if user will give already registered EMAIL for signing-up 
•	That time Existing EMAIL Error msg will be thrown/display in UI 
•	Assertions has been added in the test

**DATA FOR TEST ASSERTIONS IN existingEmailTest() in SignUpNegativeTest.java****
1.	Send these existing email  id data under sendkeys
WebElement workemail = driver.findElement(By.id("email"));
workemail.sendKeys("dakshitad19@gmail.com");

dakshitad19@gmail.com

cool.dakshita@gmail.com




4.	**The fourth test is incorrectPasswordTest() //**
•	Here user input in password is not validating with the Actual Validation of 8+ characters 

**DATA FOR TEST ASSERTIONS IN incorrectPasswordTest() in SignUpNegativeTest.java
2.	Send these incorrect password data under sendkeys
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("M")

MIRO
Hello
bye

•	In that case whenever user will fail for give 8+ characters in password the expected error msg is “Please use 8+ characters for secure password ”;
•	Password verification Assertion has been used verify the actual msg = expected msg and if test will fail some message will print in console.



CREATED_BY
Dakshita Dhaundiyal
dakshitad19@gmail.com


![image](https://user-images.githubusercontent.com/32579088/153749822-aa7fab85-3a4c-4950-a7bc-36af2a4da767.png)
