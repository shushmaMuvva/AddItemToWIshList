@addItemToWishList
Feature: Web :: Adding item to my wish list
  In order to add item to my wish list 
  As a new customer
  I want to be able to create an account

  Background: 
    Given I navigate to automation practice website

  @itemWishList
  Scenario Outline: validates that new customer can create an account and add item to wish list
    And I click on Sign in link
    And I enter my email address and click on "Create an account" button
    And I create an account with details as
      | title          | <title>          |
      | firstName      | <firstName>      |
      | lastName       | <lastName>       |
      | Password       | <Password>       |
      | AddressLine1   | <AddressLine1>   |
      | City           | <City>           |
      | State          | <State>          |
      | Zip/PostalCode | <Zip/PostalCode> |
      | Country        | <Country>        |
      | MobilePhone    | <MobilePhone>    |
      | addressAlias   | <addressAlias>   |
    And I submit registration to login and view my account page
    And I can see my name on top right corner
    And I can See "MY WISHLISTS" link and click on it
    When I see "TOP SELLERS" list and click on first item
    And I can see "Add to wishlist" button and add an item to my wishlist
    Then Application should display that item "Added to your wishlist."
    And I should see only "1" item in my wishlist 
    And It should be same item as i added from TOP SELLERS list  

    Examples: 
      | title | firstName | lastName | Password    | AddressLine1  | City    | State   | Zip/PostalCode | Country       | MobilePhone | addressAlias |
      | Mrs   | shushma   | muvva    | Password!2  | white street  | Austin  | Texas   |          73301 | United States | 15105651234 | UsAddress1   |
      | Mr    | sekhar    | potru    | Password!23 | abbey street  | Atlanta | Georgia |          85526 | United States | 15123458988 | UsAddress2   |
      | Mr    | pratima   | muvva    | Password!24 | newton street | Phoenix | Arizona |          91427 | United States | 15235612234 | UsAddress3   |
