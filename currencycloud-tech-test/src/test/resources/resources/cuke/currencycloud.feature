Feature: Using the Currencycloud API
As a user
I want to log into the Currencycloud API and create two quotes for selling/buying
So that I can verify the buy amount is correct to the rate of the first, verify the the buy amount is incorrect to the rate of the second, and exit

Scenario: Authenticate against the API and retrieve a login token
Given the correct web address
When I submit a Login ID and API key
Then I will be returned an authentication token.

Scenario: Create a quote for selling GBP and buying USD
Given A successful login authentication
When I create a quote for selling GBP and buying USD with the sell side
Then I can verify the buy amount is correct to the rate

Scenario: Create a new quote for selling GBP and buying USD
Given a successful login authentication 
When I create a new quote for selling GBP and buying USD with the sell side
Then I can verify the buy amount does not match the rate and end the API session