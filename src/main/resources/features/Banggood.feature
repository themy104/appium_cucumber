Feature: Verify BangGood Application
  Background:
    Given Open Banggood Easy Online Shopping App successfully
  @TC01
  Scenario: Verify product of Home And Garden
    When Click to the Category on footer menu
    And Scroll to Home and Garden in Left menu
    And Click to Home and Garden in Left menu
    And Click to the Home Decor
    And Click to the Filter
    And Input price from 20 to 30
    And Click Done
    And Click first product
    Then Verify product name should be displayed
    Then Product price in range 20 to 30
  @TC02
  Scenario: Verify product of Hot Categories
    When Scroll to Hot Categories
    And Click to the first category
    And Click to the first product
    Then The product detail page should be displayed: Product name, product price, Buy now button and Add to Cart button
    When Click Add to Cart
    And Click to Add to Cart button
    And Click to Cart icon
    Then Product name, product size, product price and quantity should be displayed

  @TC03
  Scenario: Verify login Screen
    When Click Account on footer menu
    And Click View All Order
    Then Verify the login screen