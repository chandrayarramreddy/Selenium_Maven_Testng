package example;


	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

	

public class Sel {		

	  
		@Test				
		public void testEasy() {
			System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.guru99.com/test/guru99home/");  

			driver.quit();	
		}	

}
