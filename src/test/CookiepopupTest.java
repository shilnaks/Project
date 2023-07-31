package test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.CookiePopup;


public class CookiepopupTest {
	WebDriver driver;
	
	@Test
		public void cookie()
		{
		CookiePopup ob2 = new CookiePopup(driver);
			ob2.acceptCookies();
		}


}
