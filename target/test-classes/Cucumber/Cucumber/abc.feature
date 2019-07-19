
Feature: TestME App

  @assembly
  Scenario: Login TestMe
 When I enter usernmae
 And I enter password
 Then Home page is appeared
  
  @unit
  Scenario: Logout
 When I click on logoutButton
 Then user is navigated to login page
  
  @Smoke 
  Scenario: Purchase Headphone
 When I Go to All "Categories"
 And I Navigate to Electronics
 And Click on HeadPhones and Add to Cart
 Then the payment page is appeared

 

 