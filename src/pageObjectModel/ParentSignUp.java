package pageObjectModel;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import common.VerifyElement;

public class ParentSignUp 
{
	WebDriver driver;
	VerifyElement pageElement;
	boolean elementStatus ;
	
	private By ParentSignUpButton= By.linkText("Parents, Start Your Free Month");
	private By userEmail = By.id("user_email");
	private By userPassword = By.id("user_password");
	private By signUpButton = By.id("signup-button");
	
	Logger logs;
		
	
	
	public ParentSignUp(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void enterData(String email, String password) throws InterruptedException
	{
		logs = Logger.getLogger("ParentSignUp"); // Class name as an argument
		PropertyConfigurator.configure("log4j.properties");	
		
		
		pageElement = new VerifyElement(driver);
		
		elementStatus = pageElement.isElementPresent(ParentSignUpButton);
		Assert.assertTrue(elementStatus);
				
				driver.findElement(ParentSignUpButton).click();
				logs.info("Parent SignUp Button Clicked");
				Thread.sleep(10);
				
				elementStatus= pageElement.isElementPresent(userEmail);
				Assert.assertTrue(elementStatus);
				logs.info("Email field visible");
				
				driver.findElement(userEmail).sendKeys(email);
				logs.info("Entered user Email in Text field");
				
				elementStatus= pageElement.isElementPresent(userPassword);
				Assert.assertTrue(elementStatus);
				logs.info("Password field visible");
				
				driver.findElement(userPassword).sendKeys(password);
				logs.info("Password Entered");
				
				elementStatus= pageElement.isElementPresent(signUpButton);
				Assert.assertTrue(elementStatus);
				logs.info("SignUp button visible");
				
				driver.findElement(signUpButton).click();
				logs.info("clicked on SignUp Button");
				
				Thread.sleep(10);
				logs.info("Waiting for 10sec");
	}
}
