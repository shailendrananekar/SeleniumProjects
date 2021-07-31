@SignUpFeatureFile
Feature: Sign Up Page Scenarios

  @SignUp
  Scenario: Sign Up to Travel website
    Given Launch the Signup page of Travel website
    When Validate dropdown values and enter other fields
    Then Click on Get Started and validate Email has been sent