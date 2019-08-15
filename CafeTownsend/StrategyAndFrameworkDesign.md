
## 1. INTRODUCTION
#### 1.1 Purpose
Clear understanding in the test approach and framework execution 
	
-	**Test Strategy:** Focused in the approach the test is based on, including test case creation an thought process description 
-	**Execution Strategy:** Focused in how the test will be executed 


## 2. TEST STRATEGY
#### 2.1 Test Objectives
-	Principal objective is to verify the correct functionality of CaféTOWNSEND web site based on the specifications provided in email document
-	Testing will be executed to verify test scripts are working as expected, and identify major defects in the application 	

#### 2.2 Scope 
-   Smoke testing was performed at the very beginning to ensure no critical defects were 	present in the web site. Just an overall navigation in the application
-   Functional testing was performed to check the majority of the functions in the 	application 
- Test cases and test scripts are focused in UI testing

#### 2.3 Thought process
In this section the overall thought process will be described:

- **Test case creation:**
	- First thing was to ensure the CaféTOWNSEND did not have any critical or major defects, the was done by doing a quick smoke test, due to is a simply CRUD app it did not take too long.
	- Later the test case creation started, here I focused in document the most essential functionality of the application like Login, Logout, Employee Creation, Employee Editing and Employee Deletion, and from there I started to add the most common edge cases.
	- Then I focused in what test cases were going to be automated, so I choose the principal functionality of the application that was login, logout and CRUD actions. A total of 5 test cases were automated.

- **Test automation and framework design**
	- The language chosen here is Java because of two reasons, first is the language that I have more experience with and I feel most comfortable and second due to the level and type of testing it was going to be performed I think Java is a perfect candidate
	- Framework chosen was Selenium because once again is the one where I have more experience and it is perfect for the level and type of testing
	- Design pattern chosen was Page Object Model due to efficacy to create a scalable and maintainable automation framework
	- TestNG framework was chosen to integrate the Cucumber features and have an easier understanding while using annotations and generate reports
	- BDD framework Cucumber was chosen to readability of the test cases for non-technical people who just want to know the overall of the scenario and not dive into coding details	

- **Framework design**
    - The way the framework is design is by having 4 packages that I will describe
	-pageObjects:
	Each class focuses in one page of our application at a time, as we can see we have a class for the login page, another one for the employees page and so on, the purpose to have our classes this way is we can store the web elements and then write our methods to manipulate those web elements just once and then re-use them.
As you can see I also created a BasePage class in which I have the most common actions to manipulate web elements and that class is inherited by all others pageObject classes

    - **StepDefs:**
This package contains the steps definitions written in the Cucumber file, what the feature file does is read the sentence and look for the method that has the logic and perform it, features are “glued” to step definitions and this is scripted in our TestRunner file

    - **testData:**
Here there is a class in which we can retrieve the necessary data from a json file, like the url, credentials, etc, so we do not hardcore anything of that into our script

    - **testRunner_CT**
 This package contains a file that manages the test suite execution by joining our feature files and our steps definitions

    - **features**
This package has all our feature files, these are the ones that are seen by stakeholders, here nothing is shown as code, instead there are clear instructions as what our scenario is going to do, so it is actually easy to read and understand
