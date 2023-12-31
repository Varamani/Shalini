package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")
	public WebElement yourAddressLink;
	
	public YourAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToYourAddress()
	{
		yourAddressLink.click();
	}
	

}
