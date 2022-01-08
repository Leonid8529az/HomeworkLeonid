Feature: ContactFormWork

  Scenario: Testing sending emails from my contact form
    Given I go to http://pocketsdeveloper.com/contacts/
    When I parse my name
    And I parse my email
    And I parse the subject
    And I click send Button
    Then I get the message "Your message was sent successfully"