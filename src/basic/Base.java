package basic;

import java.awt.Toolkit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver driver;
	     
	@BeforeMethod
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","/Users/sandeep/Desktop/sandeepBackUp/Workspace_Neha/ProjectSplashmath/lib/chromedriver");
		driver=new ChromeDriver();
		driver.get("https:f2.splashmath.com");
		 
		 
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 int Width = (int) toolkit.getScreenSize().getWidth();
		 int Height = (int)toolkit.getScreenSize().getHeight();
		 Dimension screenResolution = new Dimension(Width,Height); 
		 
		 driver.manage().window().setSize(screenResolution); 
		 System.out.println("Browser opened");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
