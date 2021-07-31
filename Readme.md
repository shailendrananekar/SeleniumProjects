**How to execute the test:**
 
To Run the Project directly run "TravelRunner.java" file. This will execute the SignUp test scenario.

**Project Highlights:**

1. This is Maven project. Dependancy jars has been handled in pom.xml
2. Cucumber Framework used to write Test scenarios
3. For chromedriver.exe we have used WebDriverManager Dependancy. Due to which we can avoid .exe file in our project.

**Feature file contain below scenario:**

@SignUpFeatureFile
Feature: Sign Up Page Scenarios

  @SignUp
  Scenario: Sign Up to Travel website
    Given Launch the Signup page of Travel website
    When Validate dropdown values and enter other fields
    Then Click on Get Started and validate Email has been sent
