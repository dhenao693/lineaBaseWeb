Feature:  As a customer wish rent a car

  Scenario Outline: Find the page
    Given the "user" stay in page
    When  find the page "<blogName>"
    Then see the page
      | pageInfo   | url   |
      | <pageInfo> | <url> |

    Examples:
      | blogName | url                         | pageInfo                     |
      | Facebook | https://es-la.facebook.com/ | Enlaces a sitios de Facebook |

  Scenario: Find the page
    Given the "user" stay in page
    When  find the page "Facebook"
    Then the user see the message "Facebook te ayuda a comunicarte y compartir con las personas que forman parte de tu vida."

