@chrome @sanity @regression
Feature: Categories Funtionality

  Scenario: From Side Menu to a Specific Category
    Given User on  Amazon Home page
    When User clicks on Burger Menu
    When User clicks on Clothing Shoes Jewelry & Watches
    And User clicks on Women
    Then User should be routed to Amazon Fashion Home Page
