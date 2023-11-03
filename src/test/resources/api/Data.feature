Feature: Data

  Scenario: GET - As user I have be able to get detail data
    Given I set GET endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  Scenario: POST - As admin I have be able to create new user
    Given I set POST endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201

  Scenario: PUT - As admin I have to be able to update an user
    Given I set PUT endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200

  Scenario: DELETE - As admin I have to be able to delete an user
    Given I set DELETE endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 204