@Home_page
Feature: Home_page

@HomePage
Scenario: functionality of home page
Given user is on home page
When mouse hover on buy
When mouse hover on rent
When mouse hover on sell
When mouse hover on home loan
When mouse hover on property services
When mouse hover on MB Advise
When mouse hover on help
Then all links are working
And close0

@SuccessfullLogIn
Scenario:  log In functionality when user enter valid credentials
Given user is on LogIn page
#When click on log in button
When enter registered email_id
And click on next
When enter registered password
And click on logIn
Then User should LogIn successfully
Then click on logOut
And close

@UnsuccessfullLogIn_by_unregistered_email_id
Scenario:  log In functionality when user enter unregistered email_id
Given user is on LogIn page1
#When click on log in button
When enter unregistered email_id1
And click on next1
Then alert No User found with this Email id.1
And close1

@UnsuccessfullLogIn_by_wrong_password
Scenario: log In functionality when user enter wrong password
Given user is on LogIn page2
#When click on log in button
When enter registered email_id2
And click on next2
And enter wrong password2
And click on LogIn2
Then alert Wrong password. Try again or click Forgot password to reset it
And close2



@UnsuccessfullLogIn_by_blank_email_id_field
Scenario: log In functionality when user not entered the email_id
Given user is on LogIn page3
#When click on log in button3
When no email_id entered3
And click on next3
Then alert Please enter either Email id or Mobile number3
And close3

@UnsuccessfullLogIn_by_blank_password
Scenario: log In functionality when user not entered the password
Given user is on LogIn page4
#When click on log in button4
When entered the registered email_id4
And click on next4
When do not enter the password4
Then click on logIn4
Then alert Please enter your password4
And close4

@SuccessfullLogIn_by_mobile_no
Scenario: log In functionality through registered mobile no.
Given user is on log in page5
When enter the registered mobile no
And click on next5
When enters valid otp
And click on logIn5
Then user should logIn succesfully
Then user should logOut
And close5

@UnsuccessfullLogIn_by_unregistered_mob_no
Scenario:  log In functionality when user enters unregistered mobile no
Given user is on LogIn page6
#When click on log in button
When enter unregistered mobile no6
And click on next6
Then alert No User found with this mobileno6
And close6

@UnsuccessfullLogIn_by_wrong_otp
Scenario: log In functionality when user entered wrong otp
Given user is on LogIn page7
When enter registered mobile no7
And click on next7
When enter wrong otp
Then alert incorrect otp code
And close7



@SignUpAsBuyer
Scenario: Sign Up functionality by signing as a buyer/owner
Given User is on sign up page
When choose the user category as buyer_owner
When Enter the name
And Enter the Email
And Enter the password
And Enter the mobile no
And do check the agree field
When Click on Sign Up
Then user is successfully registered
And Close

@SignUpAsAgent
Scenario: Sign Up functionality by signing as a Agent
Given User is on sign up page2
When choose the user category as Agent2
When Enter the name2
And Enter the Email2
And Enter the password2
And Enter the mobile no.2
And do check the agree field2
When Click on Sign Up2
Then user is successfully registered2
And Close2


@SignUpAsBuilder
Scenario: Sign Up functionality by signing as a builder
Given User is on sign up page3
When choose the user category as builder3
When Enter the name3
And Enter the Email3
And Enter the password3
And Enter the mobile no.3
And do check the agree field3
When Click on Sign Up3
Then user is successfully registered3
And Close3



@SignUpEmptyAll
Scenario: Sign Up functionality when no field is filled
Given User is on sign up page4
When Do not choose the user category 
When do not enter the name
When do not enter the Email
And do not enter the password4
And do not enter the mobile no.
And do not check the agree field
And Click on Sign Up4
Then alert should be given by all fields
And Close4




