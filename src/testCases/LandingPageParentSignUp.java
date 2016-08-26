package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.ParentSignUp;
import basic.Base;

public class LandingPageParentSignUp extends Base
{
	ParentSignUp signUp;
	
	
	@Test
	public void enterInvalidEmailAndPAssword() throws InterruptedException
	{
		signUp= new ParentSignUp(driver);
		signUp.enterData("sandeep","1234");
	
		Assert.assertEquals(driver.findElement(By.id("signup-button")).getAttribute("value"), "Sign up for FREE");
		System.out.println("A");
		
	}
	
	@Test
	public void enterBlankCredentials() throws InterruptedException
	{
		signUp= new ParentSignUp(driver);
		signUp.enterData(" "," ");
		
		Assert.assertEquals(driver.findElement(By.id("signup-button")).getAttribute("value"), "Sign up for FREE");
		System.out.println("B");
	}
	
	@Test
	public void enterBlankUserEmail() throws InterruptedException
	{
		signUp= new ParentSignUp(driver);
		signUp.enterData(" ","1234");
	
		Assert.assertEquals(driver.findElement(By.id("signup-button")).getAttribute("value"), "Sign up for FREE");
		System.out.println("C");
	}
	
	@Test
	public void enterBlankUserPassword() throws InterruptedException
	{
		signUp= new ParentSignUp(driver);
		signUp.enterData("sandeep@splashmath.com"," ");
		
		Assert.assertEquals(driver.findElement(By.id("signup-button")).getAttribute("value"), "Sign up for FREE");
		System.out.println("D");
	}
	
	@Test
	public void enterValidEmailAndInvalidPassword() throws InterruptedException
	{
		signUp= new ParentSignUp(driver);
		signUp.enterData("sandeep@splashmath.com","1234");
		
		Assert.assertEquals(driver.findElement(By.id("signup-button")).getAttribute("value"), "Sign up for FREE");
		System.out.println("E");
	}
	
	@Test
	public void enterExistingParentEmailAndPassword() throws InterruptedException
	{
		signUp= new ParentSignUp(driver);
		signUp.enterData("sandeep.negi+pg012@splashmath.com","123456");
		
		Assert.assertEquals(driver.findElement(By.id("submit")).getAttribute("value"), "Sign up");
		System.out.println("F");
	}
	
	@Test
	public void enterValidParentEmailAndPassword() throws InterruptedException
	{
		double num = Math.random();
		signUp= new ParentSignUp(driver);
		signUp.enterData("sandeep.negi+" +num +"@splashmath.com","123456");
		
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Share Your Child's Details");
		System.out.println("enterValidParentEmailAndPassword() method");
	}
	
	
}
