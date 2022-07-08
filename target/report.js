$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/Home_Page.feature");
formatter.feature({
  "name": "Home_page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Home_page"
    }
  ]
});
formatter.scenario({
  "name": "functionality of home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@HomePage"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover on buy",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.mouse_hover_on_buy()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover on rent",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.mouse_hover_on_rent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover on sell",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.mouse_hover_on_sell()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover on home loan",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.mouse_hover_on_home_loan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover on property services",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.mouse_hover_on_property_services()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover on MB Advise",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.mouse_hover_on_MB_Advise()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover on help",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.mouse_hover_on_help()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "all links are working",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.all_links_are_working()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close0",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close0()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "log In functionality when user enter valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@SuccessfullLogIn"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on LogIn page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_LogIn_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter registered email_id",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_registered_email_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter registered password",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.When_enter_registered_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logIn",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_logIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should LogIn successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.User_should_LogIn_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logOut",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_logOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "log In functionality when user enter unregistered email_id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@UnsuccessfullLogIn_by_unregistered_email_id"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on LogIn page1",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_LogIn_page1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter unregistered email_id1",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_unregistered_email_id1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next1",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alert No User found with this Email id.1",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.alert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close1",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "log In functionality when user enter wrong password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@UnsuccessfullLogIn_by_wrong_password"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on LogIn page2",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_LogIn_page2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter registered email_id2",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_registered_email_id2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next2",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter wrong password2",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_wrong_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on LogIn2",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_logIn2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alert Wrong password. Try again or click Forgot password to reset it",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.alert2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close2",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close2()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "log In functionality when user not entered the email_id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@UnsuccessfullLogIn_by_blank_email_id_field"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on LogIn page3",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_LogIn_page3()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "no email_id entered3",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.no_email_id_entered3()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.apache.poi.xssf.usermodel.XSSFRow.getCell(int)\" because the return value of \"org.apache.poi.xssf.usermodel.XSSFSheet.getRow(int)\" is null\r\n\tat com.vnv.magicBricks.steps.definitions.HomePlusLogInSteps.no_email_id_entered3(HomePlusLogInSteps.java:315)\r\n\tat ✽.no email_id entered3(Feature/Home_Page.feature:55)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on next3",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next3()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "alert Please enter either Email id or Mobile number3",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.alert3()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close3",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close3()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "log In functionality when user not entered the password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@UnsuccessfullLogIn_by_blank_password"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on LogIn page4",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_LogIn_page_first4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "entered the registered email_id4",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.entered_the_registered_email_id4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next4",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "do not enter the password4",
  "keyword": "When "
});
formatter.match({
  "location": "SignUpSteps.not_enter_the_password_11()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logIn4",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_logIn4()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alert Please enter your password4",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "close4",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close4()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "log In functionality through registered mobile no.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@SuccessfullLogIn_by_mobile_no"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on log in page5",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_log_in_page5()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the registered mobile no",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_the_registered_mobile_no()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next5",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next5()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters valid otp",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enters_valid_otp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on logIn5",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_logIn5()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should logIn succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_should_logIn_succesfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should logOut",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_should_logOut()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close5",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close5()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "log In functionality when user enters unregistered mobile no",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@UnsuccessfullLogIn_by_unregistered_mob_no"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on LogIn page6",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_LogIn_page6()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter unregistered mobile no6",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_unregistered_mobile_no6()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next6",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next6()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alert No User found with this mobileno6",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.alert6()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close6",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close6()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "log In functionality when user entered wrong otp",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Home_page"
    },
    {
      "name": "@UnsuccessfullLogIn_by_wrong_otp"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on LogIn page7",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePlusLogInSteps.user_is_on_LogIn_page7()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter registered mobile no7",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_registered_mobile_no7()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on next7",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.click_on_next7()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter wrong otp",
  "keyword": "When "
});
formatter.match({
  "location": "HomePlusLogInSteps.enter_wrong_otp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "alert incorrect otp code",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePlusLogInSteps.alert_incorrect_otp_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close7",
  "keyword": "And "
});
formatter.match({
  "location": "HomePlusLogInSteps.close7()"
});
formatter.result({
  "status": "passed"
});
});