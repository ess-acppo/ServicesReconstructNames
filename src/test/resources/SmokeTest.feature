@Feature
Feature: ---------SMOKE TESTS SERVICES ----------

  @Feature
  Scenario: Visit the page
    Given User is logged in 
    When user as admin clicks on Reconstruct name strings 
    Then Name Strings are generated 


