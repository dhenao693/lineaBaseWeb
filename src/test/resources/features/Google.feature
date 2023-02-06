Feature:  As a customer wish rent a car

  Scenario Outline: Find the page
    Given the "user" stay in page
    When  find the page "<blogName>"
    Then see the page
      | blogName   | url   |
      | <blogName> | <url> |

    Examples:
      | blogName | url                         |
      | Facebook | https://es-la.facebook.com/ |

  Scenario: Find the page
    Given the "user" stay in page
    When  find the page "Facebook"
    Then the user see the message "¿Qué estás pensando, Daniel?"

