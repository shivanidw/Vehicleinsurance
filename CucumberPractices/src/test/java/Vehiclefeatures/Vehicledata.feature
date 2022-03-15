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
Feature: Enter Vehicle Data

  Scenario: Enter Vehicle Details
    Given We have Site available "http://sampleapp.tricentis.com/101/app.php"
    When I Click on the URL
    Then Navigate to enter vehicle data page and provide following Details
      | MAke                 | Audi       |
      | Model                | Motorcycle |
      | Cylindercapacity     |        100 |
      | Engineperformance    |         60 |
      | Date of Manufacture  | 03/02/2022 |
      | Number of seats      |          2 |
      | Right hand Drive     | Yes        |
      | Number of Seats      |          1 |
      | Fuel Type            | Petrol     |
      | Payload              |        100 |
      | Total Weight         |       1000 |
      | List Price           |      10000 |
      | License Plate Number | AWV4567    |
      | annual mileage       |       1000 |
