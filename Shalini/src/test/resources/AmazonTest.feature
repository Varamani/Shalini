
Feature: AmazonTest

 Background:
  Given User opens browser and application
  
 Scenario Outline: Validate Add Address Functionality
    Given User login into application <UserName> , <Password>
    When User navigates to your account page
    When User navigates to your address page
    When User navigates to add address page
    Then Enter address and submit
    Then Validate address
 Examples: 
   | UserName| Password|
   | Shalini | Shalini |
   | Karimulla| Karimulla|
 
    
  Scenario: Validate Edit Address Functionality
    Given User login into application 
    When User navigates to your account page
    When User navigates to your address page
    When User navigates to Edit address page
    Then update address and submit
    Then Validate address
 
    
    
 
    


