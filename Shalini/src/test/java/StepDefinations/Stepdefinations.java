package StepDefinations;

import PageObjects.HomePage;
import PageObjects.SignInPage;
import PageObjects.YourAccountPage;
import PageObjects.YourAddressPage;
import TestBase.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinations extends Base{
	
	@Given("User opens browser and application")
	public void user_opens_browser_and_application() {
	   Base.setup();
	}
	
	@Given("User login into application (.*), (.*) ")
	public void user_login_into_application(String Username, String Password) {
		HomePage homepage= new HomePage(driver);
		SignInPage signinpage= new SignInPage(driver);
		homepage.navigateToSignIn();
		signinpage.signIn(Username,Password);
	}

	@When("User navigates to your account page")
	public void user_navigates_to_your_account_page() {
		HomePage homepage= new HomePage(driver);
		homepage.navigateToYourAccount();
	    
	}

	@When("User navigates to your address page")
	public void user_navigates_to_your_address_page() {
		
		YourAccountPage youraccountpage = new YourAccountPage(driver);
		youraccountpage.navigateToYourAddress();
	}

	@When("User navigates to add address page")
	public void user_navigates_to_add_address_page() {
		YourAddressPage youraddresspage= new YourAddressPage(driver);
		youraddresspage.navigateToaddAddress();
	  
	}

	@Then("Enter address and submit")
	public void enter_address_and_submit() {
	  	}

	@Then("Validate address")
	public void validate_address() {
	   
	}

	@When("User navigates to Edit address page")
	public void user_navigates_to_edit_address_page() {
		YourAddressPage youraddresspage= new YourAddressPage(driver);
		
		youraddresspage.navigateToeditAddress();
	}

	@Then("update address and submit")
	public void update_address_and_submit() {
	   
	}

	   

}
