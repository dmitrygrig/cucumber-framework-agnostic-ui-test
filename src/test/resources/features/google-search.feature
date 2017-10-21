Feature: Google search

  Background:
    Given Google initial page is open

  Scenario: Search for a term returns results
    When Search for 'ChromeDriver' performed
    Then Search results exist

  Scenario Outline: Search for multiple terms ('<term>') returns results
    When Search for '<term>' performed
    Then Search results exist

    Examples: IT Companies
      | term     |
      | Google   |
      | Facebook |

  Scenario: Search for an unknown term returns no results
    When Search for '12938123ib12kj3n1kjnk312312' performed
    Then No search results exist
