package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public static String amazonLogoXpath = "//div[@id='nav-logo']";
	
	public static String amazonMenuItemXpath = "//div[@id='nav-xshop-container']//a";
	
	public void searchItem(WebDriver driver, String searchtext)
	{
		
		driver.findElement(By.xpath("")).sendKeys(searchtext);
	}

}
