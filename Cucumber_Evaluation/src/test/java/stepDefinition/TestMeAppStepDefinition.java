package stepDefinition;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TestMeAppStepDefinition {

	WebDriver driver;
	PageObjectModelClass por;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("1");
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		por=new PageObjectModelClass(driver);
		String title=driver.getTitle();
		System.out.println(title);
		
		por.SignIn.click();
	}
	
	@When("User enters username and password and click on Login button")
	public void user_enters_username_and_password_and_click_on_Login_button() {
		System.out.println("2");
		driver.getTitle();
		por.editUsername.sendKeys("Lindaa");
		por.editPassword.sendKeys("linda123");
		
		por.submit.click();
		
		String verify_Login=driver.findElement(By.partialLinkText("SignOut")).getText();
		
		System.out.println(verify_Login);
		
		
	}
	
	@Then("User should be logged in and verified")
	public void user_should_be_logged_in_and_verified() {
		System.out.println("3");
		
		String verify_login=driver.findElement(By.partialLinkText("SignOut")).getText();
		if(verify_login.contains("SignOut")) {
			System.out.println("Sign in Successfull");
		}else {
			Assert.fail("Sign In Failed");
		}
	}
	@Given("Navigate to All categories - electronics and Head phone")
	public void navigate_to_All_categories_electronics_and_Head_phone() {
		
		Actions actions=new Actions(driver);
		actions.moveToElement(por.search);
		
		actions.sendKeys(por.search,"H").pause(1000).sendKeys(por.search,"e").pause(1000).sendKeys(por.search,"a").build().perform();
		por.find.click();
		
		
	}
	
	@Given("Add product into shopping cart")
	public void add_product_into_shopping_cart() {
		System.out.println("4");
		
		por.addtocart.click();
		por.cart.click();
	}
	
	@When("Proceed to checkout")
	public void proceed_to_checkout() {
		System.out.println("5");
		por.chkout.click();
		por.proceed.click();
	}
	
	@When("Select bank and credentials")
	public void select_bank_and_credentials() throws InterruptedException {
		System.out.println("6");
		
		Thread.sleep(3000);
		por.bank.click();
		por.btn.click();
		
		por.buname.sendKeys("123456");
		por.bpsw.sendKeys("Pass@456");
		por.login.click();
		
		por.trans.sendKeys("Trans@456");
		por.paynow.click();
	}
	
	@Then("Redirected to Thank you page")
	public void redirected_to_Thank_you_page() {
		System.out.println("7");
		
		String title=driver.getTitle();
		
		if(title.contains("Order Details")) {
			System.out.println("Order Has been Placed Successfully.. Redirected on Thank you page...");
		}else {
			Assert.fail("Error : Not Redirected To Thank you Page");

		}
		
	}
}
