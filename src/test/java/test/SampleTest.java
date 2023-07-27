package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TrainingBase;
import pagefactory.HomePage;

public class SampleTest extends TrainingBase {
	
	TrainingBase base;
	
	@BeforeMethod(groups = {"smoke"})
	public void setUp()
	{
		base = new TrainingBase();
		base.initialize();
	}
	
	
	@Test(priority=2, groups = {"smoke"})
	public void amazonLogoExists()
	{
		
		WebElement amazonLogo = driver.findElement(By.xpath(HomePage.amazonLogoXpath));
		
		Assert.assertEquals(amazonLogo.isDisplayed(), true); // (false, false) - pass , (true, true) - pass
	}
	
	@Test(priority=1, groups = {"smoke"})
	public void amazonVerifyFirstMenuOptionName()
	{
		WebElement amazonMenuFirst = driver.findElement(By.xpath(HomePage.amazonMenuItemXpath));
		String menuText = amazonMenuFirst.getText();
		
		Assert.assertEquals(menuText, "Amazon miniTV"); // (false, false) - pass , (true, true) - pass
		
	}
	
	@Test(priority=3)
	public void amazonVerifyTest()
	{
		System.out.println("This is 3rd test which is not required");
		
	}
	
	@AfterMethod(groups = {"smoke"})
	public void tearDown()
	{
		driver.quit();
	}
	

}
