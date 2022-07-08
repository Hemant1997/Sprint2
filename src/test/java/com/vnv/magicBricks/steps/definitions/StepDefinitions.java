package com.vnv.magicBricks.steps.definitions;

import java.io.FileInputStream;

import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import com.vnv.magicBricks.runner.MagicPageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	
	
		private WebDriver driver;
		private MagicPageFactory magic;
		XSSFWorkbook wb;
	    XSSFSheet sh;

//		@Before
//		public void openBrowser() throws Exception{
//			//launching web browser....
//			System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
//			driver=new ChromeDriver();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			magic=new MagicPageFactory(driver);
//			driver.manage().window().maximize();
//			
//			//using pagefactory file as reference....
//			//magic=PageFactory.initElements(driver, MagicPageFactory .class);
//			
//			//reading file from excel....
//			//FileInputStream fread=new FileInputStream("./exceldata/orangehrm_cucumber.xlsx");
//			//wb=new XSSFWorkbook(fread);
//		}
		
		
		
				
}
