Feature: Google test

  Scenario: Navigation to google
    Given Google initial page is open
    When I search for 'ChromeDriver'
    Then Page with results is opened