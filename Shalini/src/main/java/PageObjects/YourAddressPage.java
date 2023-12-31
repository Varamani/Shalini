package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAddressPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='ya-myab-plus-address-icon']")
	public WebElement addAddressLink;
	
	@FindBy(xpath="//*[@id='ya-myab-address-delete-btn-1']")
	public WebElement deleteAddressLink;
	
	@FindBy(xpath="//*[@id='ya-myab-address-edit-btn-0']")
	public WebElement editAddressLink;
	
	public YourAddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToaddAddress()
	{
		addAddressLink.click();
	}
	
	public void navigateToeditAddress()
	{
		editAddressLink.click();
	}
	
	public void deleteAddress()
	{
		deleteAddressLink.click();
	}
	

}
