package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
	WebDriver driver;
	
	
	 By fullname = By.name("name");
	 By email = By.name("login");
	 By pass = By.name("password");
	 By pass2 = By.name("confirm_password");
	 By checkbox = By.name("data_policy");
	 By button = By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div[3]/form/div[8]/button");
	 
	 public CreateAccount(WebDriver driver) {
	        this.driver = driver;
	    }

	 
	 public void setvalues(String name1,String emailid, String password1,String password2)
	 {
		 driver.findElement(fullname).sendKeys(name1);
			driver.findElement(email).sendKeys(emailid);

			 driver.findElement(pass).sendKeys(password1);
				driver.findElement(pass2).sendKeys(password2);
		
	 }
	 
	 public void checkbox()
	 {
		 if (!driver.findElement(checkbox).isSelected()) {
	            driver.findElement(checkbox).click();
	        }
		
	 }
	 	
		

public void signup()
{
	
	driver.findElement(button).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.urlContains("https://bookboon.com/login/register?retry=0"));
}


}




