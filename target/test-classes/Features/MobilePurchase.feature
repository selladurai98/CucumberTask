#Author: your.email@your.domain.com
@mobile
Feature: Mobile Feature
  I want to use this template for my feature file

  Background: 
    Given user launches flipkart application
    And user login into flipkart

  Scenario: Mobile
    When user search mobile
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario: Mobile by using one dim list
    When user search mobile by using one dim list
      | poco |
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario: Mobile by using one dim map
    When user search mobile by using one dim map
      | phone1 | redmi |
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario Outline: All Mobiles
    When user search mobiles"<phones>"
    And user choose the mobile and doing payments
    Then user receive order confirmation message

    Examples: 
      | phones |
      | oppo   |
      | vivo   |
 