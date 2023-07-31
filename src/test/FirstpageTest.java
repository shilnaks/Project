package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Firstpage;
public class FirstpageTest {
		
		WebDriver driver;
		
	@Test
		public void testlogin()
		{
			Firstpage ob = new Firstpage(driver);
			ob.tryfree();
			
		}

		}

