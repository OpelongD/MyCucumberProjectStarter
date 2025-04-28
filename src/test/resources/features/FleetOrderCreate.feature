Feature: Fleet Order Creation
  As a fleet manager
  I want to create orders
  So that I can manage order assignments

  Background: User is logged into the system
    Given User has OpenWebsite and logged in with valid Credentials
    And USer is direct to dashboard

  Scenario Outline: Create a new order
    When User clicks the Order button
    And User clicks the Create Order button
    And User fills in the Order Information with: '<OrderId>', '<PONumber>', '<Customer>', '<Route>', '<Product>', '<ProductDesc>','<DeliveryType>', '<Quantity>', '<SlotTime>'
    Then User click SaveButton


    Examples:
      | OrderId     | PONumber            | Customer             | Route                | Product | ProductDesc                   | DeliveryType | Quantity | SlotTime |
      | OrderId 1st | Product Order 10111 | SIM001 - Simone Sims | 000001 - Zinja Mguni | Product | Order Successfully Created 01 | DeliveryType | 20       | 00:00    |
    
    
    
    
