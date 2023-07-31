package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeClass
		public void setup()
		{
//			driver = new ChromeDriver();
//			driver.get("https://bookboon.com/");
//			driver.manage().window().maximize();
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications"); 
	    driver = new ChromeDriver(options);

	    driver.get("https://bookboon.com/");
	    driver.manage().window().maximize();
	    
	    

	}

}







