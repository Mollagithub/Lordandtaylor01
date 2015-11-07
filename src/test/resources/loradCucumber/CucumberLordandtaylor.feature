Feature: Broadleaf Commerce Login Functionality
  @debug
Scenario: 1. Valid user valid password
 Given As a not validated user
    When Browse to the application
    Then Broadlief home page should show
    When User click login button
    And Enter "molla@gmail.com" as emaill address
    And Enter "molla1234" as password
    And Click login
    Then Welcome message should display with "Welcome, Muhammad"
    @smoke
    
  Scenario: 2. inValid user invalid password
 Given As a not validated user
    When Browse to the application
    Then Broadlief home page should show
    When User click login button
    And Enter "Xmolla@gmail.com" as emaill address
    And Enter "Xmolla1234" as password
    And Click login
    Then Error message should display with "It appears that either the email address or password entered is incorrect. Please re-enter and submit the information."

Scenario Outline: 3. Sms Alart information
    When Browse to the application
    When User click SMS button
    And Enter "<firstname>" as firstname
    And Enter "<lastname>" as lastname
    And Enter "<email>" as email
    And Enter "<zipcode>" as zipcode
    And Enter "<phone>" as Phone
    And click carde holder yes or no
    And Click Submit
Examples:
|firstname         	  	|lastname			|email			  |zipcode		|phone|
|Muhammd    			|Sara  				|molla1@Gmail.com |1072			|6463633708|
|Molla    				|ARA				|arif1@Gmail.com  |10472		|3476379311|
  