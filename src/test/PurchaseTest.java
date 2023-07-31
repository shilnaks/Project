package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.Purchase;

public class PurchaseTest {
	
	WebDriver driver;
	
@Test
	public void sessionnext()
	{
		Purchase ob5 = new Purchase(driver);
		ob5.buttonclick();
		
	}
}
