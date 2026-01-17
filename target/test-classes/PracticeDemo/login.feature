Feature: Registration functionality

  Scenario: Successful registration
    Given the user click the application url.
    And the user is able to see the login page.
    When the user enters the email as "xyz@gmail.com" and password as "pass@123"
    And the user click login button
    Then the user is able see land to dashboard page.

  Scenario Outline: Login Data driven
    Given the user navigate to login page
    When the user enter the email as "<email>" and "<password>"
    Then the user click login button

    Examples:
      | email         | password |
      | abc@gmail.com | pass@123 |
      | xyz@gmail.com | hp@123   |
