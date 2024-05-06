Feature: Google Search

  @Sanity,@All
  Scenario: Google search shehan akalanka perera
    Given goto google page
    When type name as shehan akalanka perera
    And click on search
    Then verify result page as Shehan Perera - Senior Quality Assurance Engineer - LinkedIn
    And close browser

  @UAT,@All
  Scenario: Google search from config
    Given goto google page
    When type conf data
    And click on search
    Then verify conf result page title
    And close browser
