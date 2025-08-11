#Author: Krithika D 

Feature: To validate customer and order details of a pet store 

Background: User authenticate the API services 
Given: User authenticate the API services 

@create_updated_user
Scenario Outline: Validate the creation of a customer and updation of a customer details 
Given user has access to endpoint "/user"
When Pet store user detail is created using POST request
|id|username| firstname   | lastname   | email   | password   | phone   | userstatus   | 
|<id>|<useername>| <firstname> | <lastname> | <email> | <password> | <phone> | <userstatus>  |
Then user details is validated using GET request
And Updated the user name of the pest store using PUT request

Examples: 
|id|username| firstname   | lastname   | email   | password   | phone   | userstatus   | 
|10|NewCustomer| New   | Customer   | NewCustomer@gmail.com   | password   | phone   | 0   | 

@pet_order
Scenario Outline: Validate the order details of the pet store
When user placed a new order for a pet using POST request
|id|petid| quantity   | shipdate   | status   | completed   |
|<id>|<petid>| <quantity> | <shipdate> | <status> | <completed> |
Then get the order details and validate the order id using GET request
And delete the placed order using DELETE request

Examples: 
|id|petid| quantity   | shipdate   | status   | completed   |
|10|10| 10   | 2025-28-04   | placed   | true   | 
