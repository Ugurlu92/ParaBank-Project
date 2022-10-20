Feature: Citizenship with scenario Outline




  Scenario Outline: Login successfully and unsuccessfully
    Given Navigate to parabank
    When Login with name as "<Username>" short name as "<Password>"
    Then Success message should be displayed



    Examples:
      | Username | Password |
      | oguzhan111  | oguzhan111      |
      | Emrah111    | Emrah111      |



