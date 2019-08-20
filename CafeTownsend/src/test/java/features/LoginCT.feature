
Feature: Login 
  
  Scenario Outline: Login with valid credentials
    Given User navigates to "CafeTownsend" page
    When User enter <email> and <password> 
    Then user validates correct login with <greeting> message
    
   Examples:
|email	|password	  | greeting   |
|Luke	  |Skywalker	| Hello Luke |
