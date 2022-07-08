package com.vnv.magicBricks.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			junit= "--step-notifications",
					plugin = {"json:target/cucumber.json", 
							"html:target", 
							"junit:target/Cucumber.xml",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			features="Feature",
			glue={"com.vnv.magicBricks.steps.definitions"}
			,tags={"@HomePage,@SuccessfullLogIn,@UnsuccessfullLogIn_by_unregistered_email_id,@UnsuccessfullLogIn_by_wrong_password,@UnsuccessfullLogIn_by_blank_email_id_field,@UnsuccessfullLogIn_by_blank_password,@SuccessfullLogIn_by_mobile_no,@UnsuccessfullLogIn_by_unregistered_mob_no,@UnsuccessfullLogIn_by_wrong_otp"}
					
			)

public class MagicBricksRunner {
		

}
