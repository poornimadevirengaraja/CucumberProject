package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class login {
	WebDriver driver;
	
	@Given("Hi user navigates to the website javatpoint.com")
	public void user_navigates_to_the_website_javatpoint_com() {	 
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	    
		System.out.println("Given");
	}

	@When("Hi there user logs in through Login Window by using Username as {string} and Password as {string}")
	public void there_user_logs_in_through_login_window_by_using_username_as_and_password_as(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		System.out.println(username);
		System.out.println(password);
	}

	@Then("Hi login must be successful")
	public void login_must_be_successful() {
		 System.out.println("Then");
	}

}
