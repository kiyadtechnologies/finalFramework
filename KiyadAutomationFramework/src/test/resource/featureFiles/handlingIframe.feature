@Dev
Feature: This feature file contain scenario related to handling iframe

  Scenario: Verify that user can handle iframe
    Given user login as 'Admin' user
    Then user is now on the 'Home' page
    When user clicks on the 'Handling Iframe' link
    And user handel iframe
    Then user is handels 'shadow root' frame successfully
    When user creates new customer
      | Element       | Type    | Value         | Alias        |
      | patientName   | textbox | RANDOM_STRING | &patientName |
