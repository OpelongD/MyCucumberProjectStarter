Feature: Add Contract

  As a user, I want to add a new contract so that it can be managed and tracked in the system.

  Scenario Outline: Successfully add a new contract
    Given User has successfully logged In with valid credentials
    Then User is on Landing to select Tenant
    And User is directed to dashboard and click Contract Button
    Then User click the AddContract button
    And I fill in the contract details '<ContractName>', '<DeliveryType>','<Quantity>'.
    And AddONE '<StartsOnDate>','<EndOnDate>','<NumberofLoads>','<AverageLoad>','<TripsRequired>'.
    And AddTWO '<ReferenceNumber>','<ContractCurrency>','<ContractValue>','<Notes>'.
    And AddTHREE '<Customer>','<PaymentTerm>', '<ProductDescription>','<Route>'.
    Then I click Contract Save button

    Examples:

      | ContractName | DeliveryType           | Quantity | StartsOnDate | EndOnDate  | NumberofLoads | AverageLoad | TripsRequired | ReferenceNumber | ContractCurrency | ContractValue | Notes          | Customer    | PaymentTerm     | ProductDescription | Route         |
      | Contract A   | Fast without insurance | 10       | 2025-04-04   | 2025-04-04 | 10            | 5           | 2             | Test01          | Angolan Kwanza   | 10            | Ishmael Direro | Paul Jaco   | Cash in advance | Testing1           | DBN_KOL_Swift |
      | Contract B   | Fast without insurance | 20       | 2025-03-10   | 2025-03-20 | 11            | 15          | 4             | Test02          | Angolan Kwanza   | 1             | Ishmael Direr  | Paul Jacobs | Cash in advance | Testing2           | DBN_KOL_Swift |
      | Contract C   | Fast without insurance | 30       | 2025-03-11   | 2025-03-21 | 12            | 30          | 6             | Test03          | Angolan Kwanza   | 3             | Ishmael Dire   | Paul JacoS  | Cash in advance | Testing3           | DBN_KOL_Swift |
      | Contract D   | Fast without insurance | 40       | 2025-03-12   | 2025-03-22 | 13            | 59          | 8             | Test04          | Angolan Kwanza   | 55            | Ishmael Dir    | Paul JacoH  | Cash in advance | Testing4           | DBN_KOL_Swift |
      | Contract E   | Fast without insurance | 50       | 2025-03-13   | 2025-03-23 | 14            | 89          | 10            | Test51          | Angolan Kwanza   | 7             | Ishmael DirQ   | Paul Ja     | Cash in advance | Testing5           | DBN_KOL_Swift |
