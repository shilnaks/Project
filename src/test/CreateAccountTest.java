package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.CreateAccount;

public class CreateAccountTest extends Baseclass{
	
	WebDriver driver;

    @BeforeMethod
    public void setup() {
        
        // Initialize the WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testcreateaccount() {
    	
    	CreateAccount obj  = new CreateAccount(driver);
    	obj.signup();
    	obj.checkbox();
        
    }



}
