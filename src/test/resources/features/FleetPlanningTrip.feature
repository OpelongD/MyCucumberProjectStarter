Feature: Plan a Trip
  As a user, I want to plan a trip, so that I can manage and track it in the system

  Scenario: Create a new trip
    Given User has successfully logged In with valid credentials, UserName and Password
    Then User is redirect to dashboard, to select Tenant(
    And User navigate to the Planning Tab,to click Plan Button and click Add Trip Button
    Then Select Route, capture PO NUmber and enter how many time id the trip going to be executed and click Add Trip
    Then User will drag Vehicvle onto the drip Created and Save Trip
    Then the trip should be successfully created
    And Trip should be visible on Trip List