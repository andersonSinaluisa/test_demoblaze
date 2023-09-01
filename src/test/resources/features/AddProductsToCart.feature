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
    When the user place the order
    And the user fills the form with the following data
      | Anderson  | Ecuador | Quito   | 123456789   | 12    | 2023 |
    Then the user should see the message "Thank you for your purchase!"

  @WithExamples
  Scenario Outline: Add Products to Cart
    Given the user is on the home page
    When the user adds the first product to the cart
      | <type> | <product> |
    And the user adds the second product to the cart
      | <type> | <product> |
    Then the user should see that the products are in the cart
    When the user place the order
    And the user fills the form with the following data
      | <full_name> | <country> | <city>   | <credit_card> | <month> | <year> |
    Then the user should see the message "Thank you for your purchase!"



    Examples:
      | type | product | full_name | country | city    | credit_card | month | year |
      | PHONE | Nexus 6 | Anderson | Ecuador | Quito   | 123456789   | 12    | 2023 |
      | LAPTOP | Sony vaio i7 | Anderson | Ecuador | Quito   | 123456789   | 12    | 2023 |
      | MONITOR | ASUS Full HD | Anderson  | Ecuador | Quito   | 123456789   | 12    | 2023 |

