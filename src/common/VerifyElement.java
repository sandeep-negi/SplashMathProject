package common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class VerifyElement 
{
	WebDriver driver;
	public VerifyElement(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean isElementPresent(By locator)
	{
		try
		{
			driver.findElement(locator);
			return true;
		}
		
		catch(NoSuchElementException e)
		{
			System.out.println("Element Not found on Page!!!");
			return false;
		}
	}
}
