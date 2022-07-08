package com.vnv.magicBricks.runner;

import org.openqa.selenium.WebDriver;

public class MagicPageFactory {
	
	WebDriver driver;
	
	public MagicPageFactory (WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		}
	

}
