@chrome @sanity @regression 
Feature: Amazon User End to End Testing
  This is an End to End Test for this Feature 

  Scenario: User completes order with End to End Testing
    Given User is on amazon login page
   When User enters correct email address "Talentechpowerrangers@gmail.com"
   And User clicks continue
 		And User enter password "March2022"
   And User clicks sign-in button
    When User enters input "balloons" in search box
    And Clicks search button
    And User selects first link item on the search result page
    And User adds item to cart
    Then User goes to cart page by clicking cart button
