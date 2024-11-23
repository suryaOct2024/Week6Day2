Feature: Create an Account in Sales Force Application using Dynamic Parameterization

Scenario Outline: Create Account with valid data

Given Launch the Sales Force Application with url 'https://login.salesforce.com/'
And Enter the username as 'dilip@testleaf.com'
And Enter the password as 'leaf@2024'
When Click on the login button
Then Verify successful login
And Click on toggle menu button from the left corner
And Click view All
And Click Sales from App Launcher
And Click on Accounts tab
When Click on New button
Then Enter the account name as <acctName>
And Select Ownership as <ownership>
And Click save
And Verify Account name as <acctName>
And Close the browser

Examples:

|acctName||ownership|
|'TestUser'||'Public'|
|'TestUser1'||'Private'|
|'TestUser2'||'Subsidiary'|