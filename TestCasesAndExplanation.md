# Soucedemo

                                          TEST CASES
Positive: 

User navigates to saucedemo.com website.
Then User should be able to enter the valid username in username box.
Then User should be able to enter the valid password in password box.
Then User should be click login button.
After click the login buton user should land on the main page



Negative;

User navigates to saucedemo.com website.
Then User should be able to enter the invalid username in username box.
Then User should be able to enter the invalid password in password box.
Then User should be click login button.
After click the login buton user should be able to see the error message.


General:
User should see accepted usernames at the  bottom of page
User should see valid password/s at the bottom of the page

-------------------------------------------------------------------------------------------------------------------------

After automating the login page of the website created by SwagLabs, I realized that there are 2 cases need to be fixed. These fails are:
1. while both username and password are empty it gives us "Epic sadface: Username is required" error message. but Actually it should give us "Epic sadface: Username and Password are required"
2. locked_out_user has been indicated as accepted username but in fact it says has been locked out. 


