package suitecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown() {
		//driver.close();
	}
	
	/*@param,expected title
	 * 
	 * will switch to new tab based on expected title
	 * will switch back to the original tab,
	 * 
	 * */
	public void switchByTitle(String title) {
		 String original = driver.getWindowHandle();
		 
		 for (String handle : driver.getWindowHandles()) {
			 driver.switchTo().window(handle);
			 if(driver.getTitle().equals(title)) {
				 // do not do anything else and leave the method
				 // since we are now in the right window
				 return ;
			 }	
		}
		 driver.switchTo().window(original);
	}
	
}

