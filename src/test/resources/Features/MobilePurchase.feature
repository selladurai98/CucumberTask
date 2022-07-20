#Author: your.email@your.domain.com
Feature: Mobile Feature
  I want to use this template for my feature file

  Scenario: Mobile
    Given user launches flipkart application
    And user login into flipkart
    When user search mobile
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario: Mobile by using one dim list
    Given user launches flipkart application
    And user login into flipkart
    When user search mobile by using one dim list
      | poco |
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario: Mobile by using one dim map
    Given user launches flipkart application
    And user login into flipkart
    When user search mobile by using one dim map
      | phone1 | redmi |
    And user choose the mobile and doing payments
    Then user receive order confirmation message

  Scenario Outline: All Mobiles
    Given user launches flipkart application
    And user login into flipkart
    When user search mobiles"<phones>"
    And user choose the mobile and doing payments
    Then user receive order confirmation message

    Examples: 
      | phones |
      | oppo   |
      | vivo   |
