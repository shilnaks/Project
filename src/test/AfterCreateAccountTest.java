package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.AfterCreateAcccount;

public class AfterCreateAccountTest extends Baseclass{

	WebDriver driver;

    @BeforeMethod
    public void setup() {
        
        // Initialize the WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testaftercreateaccount() {
    	
    	AfterCreateAcccount ob4  = new AfterCreateAcccount(driver);
    	ob4.nextsigin();
   
    
        
    }

 

}
