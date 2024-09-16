package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logindatatablesd {
	WebDriver driver;
	
	@Given("user navigates to the website saucedemo.com")
	public void user_navigates_to_the_website_javatpoint_com() {	 
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();	    
		System.out.println("Given");
	}

	@When("there user logs in through Login Window by using Username and Password")
	public void there_user_logs_in_through_login_window_by_using_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   List<String> ref= dataTable.asList(String.class);
	   driver.findElement(By.id("user-name")).sendKeys(ref.get(0));
	   driver.findElement(By.id("password")).sendKeys(ref.get(1));
	}


	@Then("login must be successful")
	public void login_must_be_successful() {
		 System.out.println("Then");
	}

	
}
