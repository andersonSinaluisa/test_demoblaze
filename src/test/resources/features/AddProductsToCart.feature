# author: Anderson Sinaluisa (andersonsinaluisa.com)
# date: 2023-08-30
# This script runs the analysis to create a report of the number of products in the cart.

Feature: Add Products to Cart
    As a user
    I want to add products to the cart
    So that I can purchase them


  Scenario: Add Products to Cart
    Given the user is on the home page
    When the user adds the first product to the cart
    And the user adds the second product to the cart
    Then the user should see that the products are in the cart
