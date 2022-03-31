@chrome  
Feature: Amazon login feature
  This feature will test amazon login features
  
	@chrome @sanity @regression
  Scenario: Verify customer login with valid userid and password
    Given user is in amazon login page
    When when user enters correct email address "zahid00nyc@gmail.com"
    And user clicks continue
    And user enters correct password "March2022"
    And user clicks sign-in
    Then user able to log-in

   #@firefox @regression 
   #Scenario Outline:  Verify customer login with correct userid and wrong password
    #Given user in amazon login page
    #When user types correct userid "zahid00nyc@gmail.com"
    #And user clicks continue 
    #And user types wrong password "<password>"
    #And user clicks sign-in
    #Then Customer should not be able to login
#
    #Examples: 
      #| password |
  #		| pass123  |
      #| pass321  |
      #| 123pass  |
   
   
   
   
   
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
