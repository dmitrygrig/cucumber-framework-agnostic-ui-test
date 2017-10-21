Feature: Google search

  Scenario: Search for a term return results
    Given Google initial page is open
    When I search for 'ChromeDriver'
    Then Page with results is opened