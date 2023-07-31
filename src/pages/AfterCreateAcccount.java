package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AfterCreateAcccount {
	
	WebDriver driver;
	
	
	By namefield = By.className("team-name__form");
	By button2 = By.name("next");
	
	 public AfterCreateAcccount(WebDriver driver) {
	        this.driver = driver;
	    }
	
	 public void setvalues(String name2)
	 {
		 driver.findElement(namefield).sendKeys(name2);
			
		
	 }
	 public void nextsigin()
	 {
		 driver.findElement(button2).click();
		
	 }

}
