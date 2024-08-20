package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lumalogin {
	
	WebDriver driver = null;
	
	@Given("I am on the LUMA Website")
	public void i_am_on_the_luma_website() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().fullscreen();
	    driver.navigate().to("https://magento.softwaretestingboard.com/");
		
	}
	
	@When("I click on the Sign In button")
	public void i_click_on_the_sign_in_button() {
	   driver.findElement(By.linkText("Sign In")).click();
	}



	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
	   driver.findElement(By.id("email")).sendKeys("akshay.ranalkar@gmail.com");
	  
	   
		
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		 driver.findElement(By.id("pass")).sendKeys("Arsenal@123");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		 driver.findElement(By.id("send2")).click();
		 
	}

	@Then("I am able to login into the website successfully")
	public void i_am_able_to_login_into_the_website_successfully() {
		 driver.findElement(By.xpath("//button[@type='button']")).click();
	}

	@Then("Am able to navigate to the My Account Page")
	public void am_able_to_navigate_to_the_my_account_page() {
	    driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
	    driver.getPageSource().contains("Akshay Ranalkar");
	    driver.close();
	    driver.quit();
	   
	    
	}

}
