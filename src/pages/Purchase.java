package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Purchase {
	
	WebDriver driver;
	By selectarea = By.xpath("//*[@id=\"root\"]/main/div[2]/div/div[4]/div[3]/div[1]");
	By button3 = By.name("next");
	

	
	public Purchase(WebDriver driver) {
		 this.driver = driver;
	}



	public void buttonclick()
	{
		driver.findElement(button3).click();
		driver.findElement(selectarea).click();
	}

}
