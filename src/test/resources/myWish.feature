Feature: Create an My Wish List
  @SmokeTest
  Scenario: Creating my wishlist


    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And click to sign in button
    And navigate over the titles
    And click to women button
    When click add to  wish list button
    Then verify to added wishlist message
    And click my profile
    When click my wishlist
    Then verify your product should be displayed
    And click to delete button
    When accept to alert message
    Then wishlist should be empty

