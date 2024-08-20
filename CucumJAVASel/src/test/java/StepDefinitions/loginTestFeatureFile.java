package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class loginTestFeatureFile {


	WebDriver driver = null;
	//WebDriverWait webdriverwait = null;
	
	public static void waitForVisibilityByClass(WebDriver driver,
            String className, Duration seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .className(className)));
    }
	
	@Given("The user is on the banking website")
	public void the_user_is_on_the_banking_website() {
		WebDriverManager.chromedriver().setup();// Set up the chrome driver to run
		driver = new ChromeDriver(); // instantiate chrome driver
		
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();// maximise the running window
		driver.navigate().to("https://magento.softwaretestingboard.com/");//navigate to the website
		
		
	}

	@And("User navigates to the Registeration Page")
	public void user_navigates_to_the_registeration_page() {
		driver.findElement(By.xpath("//a[text()=\'Create an Account\']")).click();
		
	
	}

	@When("The user enter all the mandatory details")
	public void the_user_enter_all_the_mandatory_details() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id=\'contentarea\']")).isDisplayed();
		
		driver.findElement(By.id("firstname")).sendKeys("Akshay");
		driver.findElement(By.id("lastname")).sendKeys("Ranalkar");
		driver.findElement(By.id("email_address")).sendKeys("akshay.ranalkar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Arsenal@123");
		driver.findElement(By.id("password-confirmation")).sendKeys("Arsenal@123");
		
		 
		
		//WebDriverWait wait = new WebDriverWait(driver, 1000);
		//Thread.sleep(2000);
	}
	
	

	@And("Clicks on the Save button")
	public void clicks_on_the_save_button() {
		
		
		driver.findElement(By.xpath("//form[@id='form-validate']/div/div/button/span")).click();
		
		//webdriverwait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()= \'Create an Account\')]"))).click();

	}

	@Then("New user is registered successfully")
	public void new_user_is_registered_successfully() {
		
		driver.findElement(By.linkText("Thank you for registering with Main Website Store.")).isDisplayed();
		
		driver.close();
		driver.quit();

	}
}


