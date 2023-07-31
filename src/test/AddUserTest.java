package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AddMoreUser;

public class AddUserTest {
	WebDriver driver;

    @BeforeMethod
    public void setup() {
        
        // Initialize the WebDriver
        driver = new ChromeDriver();
    }
    @Test
    public void testadduser() {
    AddMoreUser ob5 = new AddMoreUser(driver);
    ob5.againbutton();
    }
}
