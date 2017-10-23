package example;		

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;		
public class NewTest {		
	    public WebDriver driver;		
		
	    
	    @Test				
		public void testEasy() throws InterruptedException {	
			Thread.sleep(3000);
			driver.get("http://www.google.com");  
			String title = driver.getTitle();
			
			System.out.println(title);
			Thread.sleep(5000);
		}
		
		@BeforeTest
		public void beforeTest() {
			
			System.setProperty("webdriver.gecko.driver", "D:\\setup\\drivers\\geckodriver.exe");
		    driver = new FirefoxDriver();  
		}		
//		@AfterTest
//		public void afterTest() {
//			driver.quit();			
//		}		
}