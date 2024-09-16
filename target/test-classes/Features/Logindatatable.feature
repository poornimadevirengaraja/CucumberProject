Feature: Login 
@test 
Scenario: Login Functionality
Given user navigates to the website saucedemo.com
When there user logs in through Login Window by using Username and Password 
|standard_user|
|secret_sauce|
Then login must be successful


