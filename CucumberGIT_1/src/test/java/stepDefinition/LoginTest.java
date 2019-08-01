package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	 LoginOR orobj;
	@Given("User is on home Page")
	public void user_is_on_home_Page() {
	   System.out.println("User is on Home Page");
	   System.setProperty("webdriver.chrome.driver", "resources\\chromedriver1.exe");
	   driver=new ChromeDriver();
	   driver.get("https://the-internet.herokuapp.com/login");
	   orobj=new LoginOR(driver);
	}

	@When("User Enters Username and Password")
	public void user_Enters_Username_and_Password() {
		
		
		System.out.println("User Enters Username and Password");
		
		orobj.username.sendKeys("tomsmith");
		orobj.password.sendKeys("SuperSecretPassword!");
	}

	@When("Clicks on Login button")
	public void clicks_on_Login_button() {
		System.out.println("Clicks on Login button");
		orobj.login.click();
	}

	@Then("User Logged in successfully")
	public void user_Logged_in_successfully() {
		System.out.println("User Logged in successfully");
	}
}
