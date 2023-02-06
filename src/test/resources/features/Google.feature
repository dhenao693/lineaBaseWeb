Feature:  As a customer wish rent a car

  Scenario Outline: Find the blog
    Given the "user" stay in page
    When  find the page "<blogName>"
    Then see the page
      | blogName   | url   |
      | <blogName> | <url> |

    Examples:
      | blogName | url                       |
      | facebook | https://www.facebook.com/ |

  Scenario: Subscribe to the newsletter
    Given the "user" stay in page
    When  find the blog "Why Fintech in Latin America Is Having a Boom"
    And subscribe to the newsletter
    Then the user see the message "Thank you for subscribing! Stay tuned."

  Scenario: Print list of all titles with related links
    Given the "user" stay in page
    When  find the blog "Why Fintech in Latin America Is Having a Boom"
    And find related links
    Then the user see a list of all post titles with related links
