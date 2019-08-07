package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModelClass {
	
	public PageObjectModelClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="SignIn") WebElement SignIn;
	
	@FindBy(id="userName") WebElement editUsername;
	
	@FindBy(id="password") WebElement editPassword;
	
	@FindBy(xpath="//input[@type='submit']") WebElement submit;
	
	@FindBy(xpath="//input[@type='text']") WebElement search;
	
	@FindBy(xpath="//input[@type='hidden' and @value='Headphone']") WebElement headphone;
	
	@FindBy(xpath="//input[@type='submit' and @name='val']")WebElement find;
	
	@FindBy(partialLinkText="Add to cart") WebElement addtocart;
	
	@FindBy(partialLinkText="Cart ") WebElement cart;
	
	@FindBy(partialLinkText="Checkout") WebElement chkout;
	
	@FindBy(xpath="//input[@type='submit' and @value='Proceed to Pay']")WebElement proceed;
	
	@FindBy(xpath="//label[contains(.,'Andhra Bank')]") WebElement bank;
	
	@FindBy(id="btn")WebElement btn;
	
	@FindBy(xpath="//input[@name='username']")WebElement buname;
	
	@FindBy(xpath="//input[@type='password']")WebElement bpsw;
	
	@FindBy(xpath="//input[@value='LOGIN']")WebElement login;
	
	@FindBy(xpath="//input[contains(@name,'transpwd')]")WebElement trans;
	
	@FindBy(xpath="//input[@type='submit' and @value='PayNow']")WebElement paynow;
}
