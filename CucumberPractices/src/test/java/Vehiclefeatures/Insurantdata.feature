#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Enter Insurant Data

  Scenario: Enter Personal Details
    Given We have filled Vehicle data and click on next
    When I Click on the Next button
    Then Navigate to enter Insurant data page and provide following Details
      | First Name     | Shivani                                    |
      | Last Name      | Dwivedi                                    |
      | Date Of Birth  | 04/11/1992                                 |
      | Gender         | Female                                     |
      | Street Address | Rua Franciso Curitiba                      |
      | Country        | Brazil                                     |
      | Zip Code       |                                     110094 |
      | City           | Curitiba                                   |
      | Occupation     | Employee                                   |
      | Hobbies        | Skydiving                                  |
      | Website        | http://sampleapp.tricentis.com/101/app.php |
      | Picture        | Self1.jpeg                                 |
