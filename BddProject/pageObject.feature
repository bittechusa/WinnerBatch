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
@tag
Feature: Purchase product from Macys
 
	Background: 
		Given I open the browser and go to Macys webSite 

  @tag1
  Scenario: 
    When I click on men link
    And Click on shoes icon
    Then I should be redirected to the shoes page

  @tag2
  Scenario Outline: 
    When I search for products <products> 
    And Click on search button
    Then I should get related result

    Examples: 
      | products | 
      | "shirt"  |     
      | "pant"   |   
