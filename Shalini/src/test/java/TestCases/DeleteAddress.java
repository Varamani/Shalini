package TestCases;


import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.SignInPage;
import PageObjects.YourAccountPage;
import PageObjects.YourAddressPage;
import TestBase.Base;

public class DeleteAddress extends Base{
	
	@Test
	public void deleteAddress()
	{
        Base.setup();
			
        HomePage homepage= new HomePage(driver);
		SignInPage signinpage= new SignInPage(driver);
		YourAccountPage youraccountpage = new YourAccountPage(driver);
		YourAddressPage youraddresspage= new YourAddressPage(driver);
		
		homepage.navigateToSignIn();
		signinpage.signIn(prop.getProperty("UserName"),prop.getProperty("Password"));
		homepage.navigateToYourAccount();
		youraccountpage.navigateToYourAddress();
		youraddresspage.deleteAddress();
		
	}
}
