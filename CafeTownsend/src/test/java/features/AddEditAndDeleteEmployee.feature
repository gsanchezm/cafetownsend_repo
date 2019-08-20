Feature: Add, Edit and Delete Employee

  Scenario Outline: Add a new employee
    Given User navigates to "CafeTownsend" page
    When User enter <email> and <password>
    Then User adds a new employee with <First Name>, <Last Name>, <Start Date> and <Email>

    Examples: 
      | email | password  | First Name | Last Name | Start Date | Email           |
      | Luke  | Skywalker | Donald     | Duck      | 2019-10-12 | donald@duck.com |

  Scenario Outline: Edit employee
    Given User navigates to "CafeTownsend" page
    When User enter <email> and <password>
    Then User edits employee by changing First Name for "Cuack"

    Examples: 
      | email | password  |
      | Luke  | Skywalker |

  Scenario Outline: Delete employee
    Given User navigates to "CafeTownsend" page
    When User enter <email> and <password>
    Then User deletes previously added employee

    Examples: 
      | email | password  |
      | Luke  | Skywalker |
