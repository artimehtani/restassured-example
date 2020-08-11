Feature: OrangeHRM login
  Scenario: Logo presence on OrangeHRM home page
    Given I launch chrome browser
    When I opened OrangeHRM home page
    Then I verify that the logo is present on the page
    And Close the browser