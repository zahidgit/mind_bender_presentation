Feature: Amazon user registration
  This feature will test amazon login features
  
  @chrome @sanity @regression
  Scenario: Error message should become visible when user try to submit the accouunt creation form without a name
    Given user is in amazon login page
    When user clicks on create account
    And user enters a valid email in email input field "talentechpowerrangers@gmail.com"
    And user enters acceptable password in password field "March2022"
    And user re-enters passwords in re-eneter password field "March2022"
    And user clicks verify email button
    Then missing name error masage appears 
    And user verifies missing name error messages
    
     @chrome @regression
  Scenario: Error message should become visible when user try to submit the accouunt creation form without an email
    Given user is in amazon login page
    When user clicks on create account
    And user enters user name in name input field "Power Rsangers"
    And user enters acceptable password in password field "March2022"
    And user re-enters passwords in re-eneter password field "March2022"
    And user clicks verify email button
    Then missing email error masage appears 
    And user verifies missing email test visible
    
     @chrome @sanity @regression
  Scenario: Error message should become visible when user try to submit the accouunt creation form with blank password field
    Given user is in amazon login page
    When user clicks on create account
    And user enters a valid email in email input field "talentechpowerrangers@gmail.com"
    And user enters user name in name input field "Power Rsangers"
    And user re-enters passwords in re-eneter password field "March2022"
    And user clicks verify email button
    Then minimum password requirement message appear 
    And user verifies password requirement message
    
    
   @chrome @regression
  Scenario: Error message should become visible when user try to submit the accouunt creation without matching password
    Given user is in amazon login page
    When user clicks on create account
    And user enters a valid email in email input field "talentechpowerrangers@gmail.com"
    And user enters acceptable password in password field "March2022"
    And user re-enters passwords in re-eneter password field "March202"
    And user clicks verify email button
    Then error masage appears for password not matching
    And user verify password not matching message
    
    
    @chrome @regression
  Scenario: Error message should become visible when user try to submit the accouunt creation with all inputfield blank
    Given user is in amazon login page
    When user clicks on create account
    And user clicks verify email button
    Then error masage appears 
  
    @chrome  @regression
  Scenario: User able to register providing correct inputs
  Given user is in amazon login page
    When user clicks on create account
    And user enters user name in name input field "Power Rsangers"
    And user enters a valid email in email input field "talentechpowerrangers@gmail.com"
    And user enters acceptable password in password field "March2022"
    And user re-enters passwords in re-eneter password field "March2022"
    And user clicks verify email button
    Then error masage appears 
    And user verify page title
    
    
    
    
    
    
    
    
    
    