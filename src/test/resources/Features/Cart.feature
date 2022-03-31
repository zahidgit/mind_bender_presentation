@chrome 
Feature: Amazon Home to cart page
  This Feature will test if we can navigate from Amazon home page to cart

  Scenario: Amazon  to Cart page
    Given I am on Amazon home page
    And I navigate over to the cart button
    When I click on the cart
    Then I should be routed to cart page

#    And Click on Qty button
 #   And reduce Quantity to 8
  #  Then page should refresh
