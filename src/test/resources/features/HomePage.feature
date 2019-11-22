@Regression @Smoke @HomePage
Feature: HomePage

Background: Launching the application
Given Theu user should be able to launch the application
Then The homepage should be displayed

Scenario: Login
Given The user enters username and password
And clicks the login button
Then The user should be able to see the Welcome page
When The user clicks on Order button
And The user should be able to see the Order page
When The user sees the Product dropdown menu
And The user should be able to make a selection from Dropdown menu
When The user click on ViewAllOrders Link
Then The user should be able to retrieve the value from the webtable


