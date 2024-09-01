package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainingBase {
	
	public static String url = "https://www.amazon.in/";
	public static WebDriver driver;
	
	// Launching browser chrome
	public void initialize()
    {
		ChromeOptions chromeOptions = new ChromeOptions();
    	//WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver(chromeOptions);
    	
    	driver.get(url);
    	
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    	
    	
    }

}
