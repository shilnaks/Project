
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CookiePopup {
	
	 WebDriver driver;

    
By acceptButton = By.id("cookie-button__all"); 

  


	public CookiePopup(WebDriver driver) {
		 this.driver = driver;
	}


	public void acceptCookies() {
		driver.findElement(acceptButton).click();
		
	}


}

