package webElements;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element {

	public void setUp() {
		System.out.println("Setting up Webbriver in BeforeClass...");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, SECONDS);
		
		
		@Test
		public void WebElementExamples() {
			driver.get("https://forms.zohopublic.com/murodil/report/Applicants/reportperma/DibkrcDh27GWoPQ9krhiTdlSN4_34rKc8ngubKgIMy8");
			WebElement email = driver.findElement(By.name("Email"));
			
			String value = email.getAttribute("value");
			String maxLength = email.getAttribute("maxlength");
			String type= email.getAttribute("type");
			String tag= email.getTagName();
			boolean b= email.isEnabled();
			
			System.out.println("value: "+ value+"\n" +
								"maxlength: "+maxLength+ 
								"type: "+ type+"\n"+
								"tag: "+tag+"\n"+
								"isEnabled: "+b);
			assertEquals(value, "youremail@mail.com");
			
			email.clear();
			email.sendKeys("another@mail.com");
			
			WebElement country= driver.findElement(By.id("Address_Country"));
			Select selectCountry= new Select(country);
			
			String d= selectCountry.getFirstSelectedOption().getText();
			System.out.println(d);
			selectCountry.selectByIndex(67);
			
			WebElement cSalary = driver.findElement(By.name("Number"));
			assertEquals(cSalary.isDisplayed(),true);
			
			driver.findElement(By.xpath("//em[.=' Next ']")).click();
			cSalary.sendKeys("123456");
			
			
			
			
			/** navigate to https://forms.zohopublic.com/murodil/form/SeleniumWebElements/formperma/eCecYgX4WMcmjxvXVq6UdhA2ABXIoqPAxnAF8H8CCJg
			     * Find all input boxes and assign to List of webelements -> 2
			     * Find all drop down boxes and assign to another List of webelements -> 3
			     * Find all check boxes and assign to another List of webelements -> 9
			     * Find all radio boxes and assign to another List of webelements -> 9
			     * Find all buttons and assign to another List of webelements -> 1
			     * assert each one’s count
			     */
			    @Test
			    public void SeleniumWebElementsForm() {
			        
			    }
		}
	}
}
