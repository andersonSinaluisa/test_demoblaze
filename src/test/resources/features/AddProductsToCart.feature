# author: Anderson Sinaluisa (andersonsinaluisa.com)
# date: 2023-08-30
# This script runs the analysis to create a report of the number of products in the cart.

Feature: Add Products to Cart
    As a user
    I want to add products to the cart
    So that I can purchase them

  @WithOutExamples
  Scenario: Add Products to Cart
    Given the user is on the home page
    When the user adds the first product LAPTOP, Sony vaio i7 to the cart
    And the user adds the second product PHONE, Nokia lumia 1520 to the cart
    Then the user should see that the products are in the cart

  @WithExamples
  Scenario Outline: Add Products to Cart
    Given the user is on the home page
    When the user adds the first product to the cart
      | <tipo> | <producto> |
    And the user adds the second product to the cart
      | <tipo> | <producto> |
    Then the user should see that the products are in the cart


    Examples:
      | tipo    | producto    |
      | PHONE   | iPhone 11   |
      | LAPTOP  | MacBook Pro |
      | MONITOR | LG          |

