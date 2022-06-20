Feature: Login Functionality of Leaftaps application

Scenario Outline: TC0001_Login Functionality with positive credentials
Given Enter the username as '<username>'
And Enter the password as '<password>'
When I click Login button
Then I should be navigated to homepage without any issues
Examples: 
|username|password|
|DemoCSR|crmsfa|

Scenario: TC0002_Login Functionality with negative credentials
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When I click Login button
But I should see Error message in it

