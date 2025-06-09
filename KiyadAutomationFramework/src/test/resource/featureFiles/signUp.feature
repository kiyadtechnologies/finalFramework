Feature: This feature file contain scenario related playground registration

  @s1
  Scenario: Verify that by default signup button should be disabled
    When user clicks on the 'Login' button
    When user clicks on the 'Sign up' button
    Then user is now on the 'SignUp' page
    When user fills out the current form as follows
      | Element       | Type    | Value         | Alias  |
      | emailInput    | textbox | RANDOM_STRING | &email |
      | passwordInput | textbox | $password     |        |
    Then user is shown a 'signUpButton' element which is disabled
