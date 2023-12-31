package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	
	WebDriver driver;
	
	@FindBy(id="ap_email")
	public WebElement userNameField;
	
	@FindBy(id="continue")
	public WebElement continueBtn;
	
	@FindBy(id="ap_password")
	public WebElement passwordField;
	
	@FindBy(id="signInSubmit")
	public WebElement submitBtn;
	
	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void signIn(String UserName, String Password)
	{
		userNameField.sendKeys(UserName);
		continueBtn.click();
		passwordField.sendKeys(Password);
		submitBtn.click();
		
	}
	

}

	
