# Manual Test Scenarios – Shopping Cart

### TC-CART-01: Add a product to the shopping cart

  Scenario: Add a product to the shopping cart
    Given the user is on the product catalog screen
    And the shopping cart is empty
    When the user selects a product
    And the user adds the product to the cart
    Then the shopping cart should contain 1 item
    And the selected product should be displayed in the cart


### TC-CART-02: Verify product details in the shopping cart

  Scenario: Verify product details in the shopping cart
    Given the user is on the product catalog screen
    When the user adds "Sauce Labs Backpack" to the cart
    And the user opens the shopping cart
    Then "Sauce Labs Backpack" should be displayed in the cart
    And the product price should match the price displayed in the catalog
    And the cart should contain 1 item

### TC-CART-03: Add multiple products to the shopping cart

  Scenario: Add multiple products to the shopping cart
    Given the user is on the product catalog screen
    And the shopping cart is empty
    When the user adds 2 different products to the cart
    And the user opens the shopping cart
    Then both selected products should be displayed in the cart
    And the cart should contain 2 items

### TC-CART-04: Remove a product from the shopping cart

  Scenario: Remove a product from the shopping cart
    Given the user has added a product to the shopping cart
    And the user is viewing the shopping cart
    When the user removes the product from the cart
    Then the product should no longer be displayed in the cart
    And the shopping cart should be empty

### TC-CART-05: Continue shopping from the shopping cart

  Scenario: Continue shopping from the shopping cart
    Given the user has added a product to the shopping cart
    And the user is viewing the shopping cart
    When the user selects the continue shopping option
    Then the user should be redirected to the product catalog
    And the previously added product should remain in the shopping cart

## Test Coverage

| Test Case | Covered functionality | Priority |
|---|---|---|
| TC-CART-01 | Add product | High |
| TC-CART-02 | Product details and price | High |
| TC-CART-03 | Multiple products | High |
| TC-CART-04 | Remove product | High |
| TC-CART-05 | Continue shopping | Medium |
