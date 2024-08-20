package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.storage.DeleteCookiesParameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumOptions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleBrowserSearch {
	
	
	WebDriver driver = null;
	//ChromiumOptions options = new ChromiumOptions(null, null, null);
	
	
	@Given("The browser is open")
	public void the_browser_is_open() {
		
		//String projectPath = System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver",projectPath+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();;
		driver = new ChromeDriver(); 
		
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
	
		
	   //C:\Users\akshay.ranalkar\eclipse-workspace\CucumJAVASelsrc\test\resources\Drivers\chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay.ranalkar\\eclipse-workspace\\CucumJAVASel\\src\\test\\resources\\Drivers\\chromedriver.exe")
		// C:\Users\akshay.ranalkar\eclipse-workspace\CucumJAVASel\src\test\resources\Drivers\chromedriver.exe
	}

	@And("User is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		
		driver.navigate().to("https://google.com");
		Thread.sleep(2000);
		//WebElement frame = driver.findElement(By.id("KjcHPc"));
		//driver.switchTo().frame(frame);
		driver.findElement(By.id("L2AGLb")).click();
		//frame = driver.switchTo().frame();
	    
	}

	@When("user enters search text in the box")
	public void user_enters_search_text_in_the_box() throws InterruptedException {
		
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	    
	}

	@And("Hits Enter")
	public void hits_enter() throws InterruptedException {
	    
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("User is directed to the search page")
	public void user_is_directed_to_the_search_page() {
		
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}

}
