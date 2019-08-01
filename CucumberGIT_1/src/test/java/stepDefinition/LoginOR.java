package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginOR {
	
	public LoginOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username") WebElement username;
	@FindBy(how=How.NAME,using="password") WebElement password;
	@FindBy(xpath = "//i[contains(.,'Login')]") WebElement login;
}
