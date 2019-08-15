# cafeTOWNSEND

## Execution Strategy
### Pre - requisites
- **IDE** (Preferred Eclipse with Maven, TestNG and Cucumber plugins)
- **Java SDK 1.8**
- **Maven 3.3 or newer**

### Downloading and setting the project
- Please clone or download the project from https://github.com/OsirisVilla/cafetownsend_repo
- Install project as a new Maven project so we do not have to worry for manage dependencies, Maven takes care for all of this:  File > Import > Maven > Existing Maven Projects

### Executing project
- First of all we need to be sure that our project set up is correct, it should look like this:

  ![Screen Shot 2019-08-15 at 12.17.15 PM.png](https://www.dropbox.com/s/obj0vsdqirdikxv/Screen%20Shot%202019-08-15%20at%2012.17.15%20PM.png?dl=0&raw=1)

There are two ways we can execute our project: 
- By running entire suite (5 Test Cases)
- By running a specific feature

It is important to have in mind that sometimes a test can fail because of a time out and not because of a real failure, so we need to run again our specific scenario and ensure it is working or not working as expected.

##### - Run entire suite 

Go to CafeTownsend > src/main/java > testRunner_CT > TestRunner_CafeTownsend.java as seen here:

![Screen Shot 2019-08-15 at 12.24.24   PM.png](https://www.dropbox.com/s/mjnn1f1q0jlm0uu/Screen%20Shot%202019-08-15%20at%2012.24.24%20PM.png?dl=0&raw=1)

Open that file and right click > Run As > TestNG Test, as seen here:
![Screen Shot 2019-08-15 at 12.27.07 PM.png](https://www.dropbox.com/s/gooc9y7zu6qopyy/Screen%20Shot%202019-08-15%20at%2012.27.07%20PM.png?dl=0&raw=1)

##### - Run specific feature

Go to CafeTownsend > src/test/java > features
Here open any feature you want to run, as seen here:
![Screen Shot 2019-08-15 at 12.33.44 PM.png](https://www.dropbox.com/s/aeg7m0cs51tjr1v/Screen%20Shot%202019-08-15%20at%2012.33.44%20PM.png?dl=0&raw=1)

Right click and Run As > Cucumber feature:

![Screen Shot 2019-08-15 at 12.35.36 PM.png](https://www.dropbox.com/s/g57940tqs3vl803/Screen%20Shot%202019-08-15%20at%2012.35.36%20PM.png?dl=0&raw=1)

### Test Results
- TestNG provides a test report in html format after entire suite is ran, it can be found in CafeTownsend > test – ouput > emailable–report.html

**Note: You need to refresh your project after your test suite runs in order to have an updated test report**
