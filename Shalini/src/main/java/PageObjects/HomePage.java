package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/span")
	public WebElement accountandListLink;
	
	@FindBy(xpath="//*[@id='nav-link-accountList-nav-line-1']")
	public WebElement accountListLink;
	
	public HomePage(WebDriver driver)//driver= new FirefoxDriver()
	{
		this.driver=driver;//driver= new FirefoxDriver()
		PageFactory.initElements(driver, this);
	}
	
	
	public void navigateToSignIn()
	{
		accountandListLink.click();
	}
	
	public void navigateToYourAccount()
	{
		accountListLink.click();
	}
}
