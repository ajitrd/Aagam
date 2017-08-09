Feature: phptravels.net functional tests 


Scenario: User Registration in PhpTravels.net

Given Browser is opened
When Open Registration page when user enters URL as "http://www.phptravels.net/register"
And User enters firstname as "ajit" and lastname as "dodwad" and mobileno as "1234567891" and email as "ajit01@gmail.com" and password as "test123" and confirmpassword as "test123"
And Click submit
Then login should be successful after registration
When click logout
Then user should be logged out


Scenario: Login to PhpTravels.net

Given Login page is displayed
When user enters username as "ajit01@gmail.com" and password as "test123"
And click login
Then login should be successful

Scenario: Hotel booking

Given Hotels page is displayed
When user enters location as "singapore" and select hotel and click search button
Then hotel is listed on right side
When click on Book Now button
Then personal information page is displayed
When user clicks on Confirm this booking button
Then should redirect to Invoice page

Scenario: Tour booking

Given Tours page is displayed
When user enters location as "Dubai" and select place and click search button
Then place name is displayed on right side
When click on tour BookNow button
Then personal tour information page is displayed
When user clicks on tour Confirm this booking button
Then should redirect to tour Invoice page

Scenario: Car booking

Given Car booking page is displayed
When user select pickup point and click search button
Then cars are displayed on right side
When click on Details button
And click on car Booknow button
Then personal car information page is displayed
When user clicks on car Confirm this booking button
Then should redirect to car Invoice page


