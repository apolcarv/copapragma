Feature: On this occasion, the login function of the front of a test web page will be automated.

  @LoginSuccessFul
  Scenario Outline: Login success
    Given the user opens the web page
    When insert credentials
    |login|
    |<login>|
    Then visualize the home of the page web
    Examples:
    |login|
    |  0  |
