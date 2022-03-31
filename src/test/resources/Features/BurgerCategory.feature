@chrome @sanity @regression 
Feature: Burger Menu button to Categories Funtionality

  Scenario: Navigate from Burger Menu to a Specific Category
    Given User in Amazon Home page
    When User clicks Burger Menu
    When User clicks on Prime Video
    And User clicks on Prime Video again
    Then User should able to land on Amazon Prime Video
