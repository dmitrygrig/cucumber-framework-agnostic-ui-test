Feature: Google search

  Background:
    Given Google initial page is open

  Scenario: Search for a ChromeDriver
    When Search for 'ChromeDriver' performed
    Then Search results exist

  Scenario: Search for a Cucumber
    When Search for 'Cucumber library' performed
    Then Search results exist
