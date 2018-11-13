Feature: Account creation

  Scenario: Create an account - happy case
    Given A user is eligible for Help to Save
    When they select to use their GG email
    And enter valid bank details
    Then they will see the Create account are you sure page
    When they accept the T&C's and create an account
    Then they will see the Account created page

