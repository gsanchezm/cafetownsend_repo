
Feature: Logout 
  
  Scenario: Logout as User
    Given User navigates to CafeTownsend page
    When User enter Valid credentials
    And user validates correct login
    Then User logout 
    
    
