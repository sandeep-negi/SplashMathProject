package pageObjectModel;

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
	
	
	public ParentSignUp(WebDriver driver)
	{
		this.driver=driver;
		
	}

	public void enterData(String email, String password) throws InterruptedException
	{
		
		pageElement = new VerifyElement(driver);
		
		elementStatus = pageElement.isElementPresent(ParentSignUpButton);
		Assert.assertTrue(elementStatus);
				
				driver.findElement(ParentSignUpButton).click();
				System.out.println("Parent SignUp Button Clicked");
				Thread.sleep(10);
				
				elementStatus= pageElement.isElementPresent(userEmail);
				Assert.assertTrue(elementStatus);
				driver.findElement(userEmail).sendKeys(email);
				
				elementStatus= pageElement.isElementPresent(userPassword);
				Assert.assertTrue(elementStatus);
				driver.findElement(userPassword).sendKeys(password);
				
				elementStatus= pageElement.isElementPresent(signUpButton);
				Assert.assertTrue(elementStatus);
				driver.findElement(signUpButton).click();
				Thread.sleep(10);
	}
}
