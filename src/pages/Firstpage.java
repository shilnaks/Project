package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstpage {
	WebDriver driver;
	CookiePopup cookiePopup;
		
		//object repository
		
	By tryforfreebutton = By.className("header__sign-up-button");
	 By acceptButton = By.id("cookie-accept-button");
		

		public Firstpage(WebDriver driver) {
			this.driver = driver;
			 cookiePopup = new CookiePopup(driver); 
		}
			 
	public void acceptCookies() {
			        driver.findElement(acceptButton).click();
			    }
			

	public void tryfree()
		{
		
			driver.findElement(tryforfreebutton).click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.urlContains("https://bookboon.com/login/register?retry=0"));
		}


}