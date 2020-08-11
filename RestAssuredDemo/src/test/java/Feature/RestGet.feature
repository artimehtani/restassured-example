# new feature
# Tags: optional

Feature: Verify different Get operations using Rest Assured

  Scenario: Verify one use of the post
    Given I perform Get operation
    When I perform Get operation on user with Id number 1
    Then I should get the first name as "George"



  Scenario: Verify collection of users in the post
    Given I perform Get operation
    When I perform Get operation on user with Id number 1
    Then I should get the user names
