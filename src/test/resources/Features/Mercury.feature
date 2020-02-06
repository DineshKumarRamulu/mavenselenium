Feature: Mercury Login Test
  To check all the login functionality is working fine

  Scenario Outline: Mercury Login verification with valid cretentials
    Given I am on the Home page of Mercury Site "http://newtours.demoaut.com/"
    And I enter the "<username>" username
    And I enter the "<password>" password
    When I clickon the signin button
    Then It should naviage to the Fight Finder page successfully

    Examples: 
      | username | password | status  |
      | mercury  | mercury  | success |
      | dinesh   | mercury  | Fail    |
