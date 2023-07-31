package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddMoreUser {
	WebDriver driver;
	
	By user = By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[4]/div[1]/div/div[1]/input[2]");
	By button4 = By.name("next");
	
	public AddMoreUser(WebDriver driver) {
		this.driver = driver;
	}
	public void setvalues2(String email)
	{
		driver.findElement(user).sendKeys(email);
	}
	public void againbutton()
	{
	driver.findElement(button4).click();
	}

}
