

Feature: Add and Delete Employee
  

  
  Scenario: Add a new employee
    Given User navigates to CafeTownsend page
    When User enter Valid credentials
    Then User adds a new employee to the system
    
    Scenario: Edit previously added employee
    Given User navigates to CafeTownsend page
    When User enter Valid credentials
    Then User edits employee
    
    
    Scenario: Delete previously added employee
    Given User navigates to CafeTownsend page
    When User enter Valid credentials
    Then User deletes previously added employee
    