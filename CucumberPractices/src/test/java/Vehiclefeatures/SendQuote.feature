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
Feature: Send Quote

  Scenario: Enter User Details and Send Quote
    Given We have selected Price Option and click on send Quote button
    When I Click on the send Quote button
    Then Navigate to send quote page and need to provide following Details and click send email
      | Email           | shivanidwvd43@gmail.com         |  
      | Phone           |                   5511948267201 |  
      | username        | Shivani12                       |  
      | password        | acc@8&Hr                        |  
      | confirmpassword | acc@8&Hr                        |  
      | Comments        | Vehicle insurance data register |
