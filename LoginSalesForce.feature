Feature: 	Login to Sales Force Application

Scenario: 	Login Sales Force application with valid data

Given 	Launch the Sales Force Application with url 'https://login.salesforce.com/'
And 	Enter the username as 'dilip@testleaf.com'
And 	Enter the password as 'leaf@2024'
When Click on the login button
Then Verify successful login