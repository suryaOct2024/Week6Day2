Feature: Passing data from a feature file in Sales Force Application 

Scenario: Pass data in Sales Force Application using static parameterization 

Given Click the App Launcher Icon next to Setup 
And Select Accounts
And Search for the account using the account name 'TestUser'
When Click the dropdown icon next to the account
Then Select Edit
And Set Type to 'Technology Partner'
And Set Industry to 'Healthcare'
And Enter the Billing Address as 'Test Billing Address'
And Enter the Shipping Address as 'Test Shipping Address'
And Set Customer Priority to 'Low'
And Set SLA to 'Silver'
And Set Active to 'NO'
And Enter a unique number in the Phone field as '1111112224'
And Set Upsell Opportunity to 'No'
When Click Save
Then verify the phone number as '1111112224'