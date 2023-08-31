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
    When the user adds the first product LAPTOP, Sony vaio i7  to the cart
    And the user adds the second product to the cart
    Then the user should see that the products are in the cart

  @WithExamples
  Scenario Outline: Add Products to Cart
    Given the user is on the home page
    When the user adds the first product to the cart
      | <tipo> |
    And the user adds the second product to the cart
    Then the user should see that the products are in the cart


    Examples:
      | tipo    | producto    | cantidad |
      | PHONE   | iPhone 11   | 1        |
      | LAPTOP  | MacBook Pro | 2        |
      | MONITOR | LG          | 3        |

