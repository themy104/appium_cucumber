Feature: Verify BangGood Application
  Background:
    Given Open Banggood Easy Online Shopping App successfully
  @TC01
  Scenario: Verify product of Home And Garden
    When Click to the Category on footer menu
    And Scroll to Home and Garden in Left menu
    And Click to Home and Garden in Left menu
    Then The right category displayed
    When Click to the Home Decor
    And Click to the Filter
    And Input price from 20 to 30
    And Click Done
    And Click first product
    Then Verify product name should be displayed and product price in range 20 to 30
  @TC02
  Scenario: Verify product of Hot Categories
    When Scroll to Hot Categories
    And Click to the first category
    And Click to the first product

  @TC03
  Scenario: Verify the login screen
    When Click Account
    And Click View All Order
    Then The login screen should be displayed with: Email, password and Sign In button
