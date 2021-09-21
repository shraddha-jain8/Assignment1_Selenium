Feature: login into application

Scenario: Validating Aspiration Products 

Given intialize the browser with chrome
And Navigate to "https://aspiration.com" Site
When User Click on Spend and Save link link at the top of home page
Then Verify user can see two card products "Aspiration" and "Aspiration Plus"
And User clicks on GetAspiration button then Verify Email text box popups 

Given intialize the browser with chrome
And Navigate to "https://aspiration.com" Site
When User Click on Spend and Save link link at the top of home page
Then click on GetAspirationPlus button and validate radio option is present with text "$71.88 paid once yearly"
Then validate that monthly radio option "$7.99 paid monthly" 
