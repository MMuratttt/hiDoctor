Feature: Platform login feature
  As a brand admin, I should be able to login with correct credentials. And dashboard should be displayed.

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the Platform login page

  Scenario: Login with valid credentials
    When User enters valid username "murat@brandbassador.com"
    And User enters valid password "password123"
    And User clicks Submit button
    Then user should see the dashboard