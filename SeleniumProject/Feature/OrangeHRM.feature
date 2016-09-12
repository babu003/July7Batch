Feature: Login and logout functionality of OrangeHRM

Scenario: Verfiy login functionality

Given the browser is launched and navigated to the orangehrm login page
When  we enter the username and password
And click on the sigin button
Then it should display a msg welcome admin

Scenario: Verify logout functionality

When we click on welcome admin link
And click on logout
Then it should display the home page