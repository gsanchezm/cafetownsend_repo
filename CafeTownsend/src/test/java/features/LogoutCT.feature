
Feature: Logout 
  
  Scenario Outline: Logout as User
    Given User navigates to "CafeTownsend" page
    When User enter <email> and <password> 
    Then user validates correct login with <greeting> message
    Then User logout 
    
    
Examples:
|email	|password	  | greeting   |
|Luke	  |Skywalker	| Hello Luke |