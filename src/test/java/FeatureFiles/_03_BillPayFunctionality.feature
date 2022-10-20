Feature: Paying bills

  Scenario Outline: Login successfully and unsuccessfully
    Given Navigate to parabank
    When Login with real username
    Then Success messages should be displayed

    When Click on BillPay Button
    Then Fill the forms name as "<value>" and short name as "<amount>"click the payment button
    And Check payments status

    Examples:
    |value |amount |
    |  elektrik    |    85   |
    |  su    |   45    |
    |  dogalgaz    |   120    |



