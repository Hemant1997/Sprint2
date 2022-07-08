
package com.vnv.magicBricks.steps.definitions;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import com.vnv.magicBricks.runner.SignUpPageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps {
	
	private WebDriver driver;
	private SignUpPageFactory signup;
	XSSFWorkbook wb;
    XSSFSheet sh;
    
  /*  @Before
	public void openBrowser() throws Exception{
		//launching web browser....
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	login=new LogInPageFactory(driver);
		driver.manage().window().maximize();
		
		//using pagefactory file as reference....
		signup=PageFactory.initElements(driver, SignUpPageFactory .class);
		
		//reading file from excel....
		FileInputStream fread=new FileInputStream("./Excell_sheet/MagicBricks.xlsx");
		wb=new XSSFWorkbook(fread);
	}*/
    
    @Given("User is on sign up page")
    public void  User_is_on_sign_up_page()
    {
    	System.out.println("user is on signup page");
		driver.navigate().to("https://www.magicbricks.com/bricks/User-Registration1");	
    }
    
   @When("choose the user category as buyer_owner")
   public void choose_the_user_category_as_buyerowner()
   {
	   signup.selectBuy();
	  // driver.findElement(By.xpath("//*[@id=\"ubiusertype1\"]")).click();
	 //  driver.findElement(By.name("ubifname")).sendKeys("hemant");
	 // System.out.println("hello");
   }
   
    @When("Enter the name")
    public void Enter_the_name()
    {
    	sh=wb.getSheet("Sheet3");
		signup.enterName(sh.getRow(1).getCell(0).getStringCellValue());
    }
    
    @When("Enter the Email")
    public void Enter_the_Email()
    {
    	sh=wb.getSheet("Sheet3");
		signup.enterEmail(sh.getRow(1).getCell(1).getStringCellValue());
    }
    
   @When("Enter the password")
   public void Enter_the_password()
   {
	   sh=wb.getSheet("Sheet3");
	   signup.enterPassword(sh.getRow(1).getCell(2).getStringCellValue());
   }
    @When("Enter the mobile no")
    public void Enter_the_mobile_no() 
    {
    	sh=wb.getSheet("Sheet3");
 	   signup.enterMobileNo(sh.getRow(1).getCell(3).getStringCellValue());
    	
    }
    @When("do check the agree field")
    public void check_the_agree_field() throws Exception
    {
    	//signup.clickCheckBox();
    	//driver.findElement(By.name("termsAndConditions")).click();
    	Thread.sleep(6000);
    }
    @When("Click on Sign Up")
    public void Click_on_Sign_Up()
    {
    	signup.clickSignUp();
    	//driver.findElement(By.cssSelector(null)).click();
    	//Thread.sleep(6000);
    	System.out.println("user logged In");
    }
    
    @Then("user is successfully registered")
    public void user_is_successfully_registered()
    {
    	System.out.println("user is successfully registered");
    }
    
    @When("Close")
    public void close()
    {
    	driver.close();
    }
	
    

@Given("User is on sign up page2")
public void User_is_on_sign_up_page2()
{
	System.out.println("user is on signup page");
	driver.navigate().to("https://www.magicbricks.com/bricks/User-Registration1");
	
}
@When("choose the user category as Agent2")
public void choose_the_user_category_as_Agent2()
{
	signup.selecAgent();
}
@When("Enter the name2")
public void Enter_the_name2()
{
	sh=wb.getSheet("Sheet3");
	signup.enterEmail(sh.getRow(2).getCell(0).getStringCellValue());
}

@When("Enter the Email2")
public void Enter_the_Email2()
{
	sh=wb.getSheet("Sheet3");
	signup.enterEmail(sh.getRow(2).getCell(1).getStringCellValue());
}

@When("Enter the password2")
public void Enter_the_password2()
{
   sh=wb.getSheet("Sheet3");
   signup.enterPassword(sh.getRow(2).getCell(2).getStringCellValue());
}
@When("Enter the mobile no.2")
public void Enter_the_mobile_no2() 
{
	sh=wb.getSheet("Sheet3");
	   signup.enterMobileNo(sh.getRow(2).getCell(3).getStringCellValue());
	
}
@When("do check the agree field2")
public void check_the_agree_field2() throws Exception
{
	//signup.clickCheckBox();
	//driver.findElement(By.name("termsAndConditions")).click();
	Thread.sleep(6000);
}
@When("Click on Sign Up2")
public void Click_on_Sign_Up2()
{
	signup.clickSignUp();
	//driver.findElement(By.cssSelector(null)).click();
	//Thread.sleep(6000);
	System.out.println("user logged In");
}

@Then("user is successfully registered2")
public void user_is_successfully_registered2()
{
	System.out.println("user is successfully registered");
}

@When("Close2")
public void close2()
{
	driver.close();
}


@Given("User is on sign up page3")
public void  User_is_on_sign_up_page3()
{
	System.out.println("user is on signup page");
	driver.navigate().to("https://www.magicbricks.com/bricks/User-Registration1");	
}

@When("choose the user category as builder3")
public void choose_the_user_category_as_buyerowner3()
{
   signup.selectBuilder();
  // driver.findElement(By.xpath("//*[@id=\"ubiusertype1\"]")).click();
 //  driver.findElement(By.name("ubifname")).sendKeys("hemant");
 // System.out.println("hello");
}

@When("Enter the name3")
public void Enter_the_name3()
{
	sh=wb.getSheet("Sheet3");
	signup.enterName(sh.getRow(3).getCell(0).getStringCellValue());
}

@When("Enter the Email3")
public void Enter_the_Email3()
{
	sh=wb.getSheet("Sheet3");
	signup.enterEmail(sh.getRow(3).getCell(1).getStringCellValue());
}

@When("Enter the password3")
public void Enter_the_password3()
{
   sh=wb.getSheet("Sheet3");
   signup.enterPassword(sh.getRow(3).getCell(2).getStringCellValue());
}
@When("Enter the mobile no.3")
public void Enter_the_mobile_no3() 
{
	sh=wb.getSheet("Sheet3");
	   signup.enterMobileNo(sh.getRow(3).getCell(3).getStringCellValue());
	
}
@When("do check the agree field3")
public void check_the_agree_field3() throws Exception
{
	//signup.clickCheckBox();
	//driver.findElement(By.name("termsAndConditions")).click();
	Thread.sleep(6000);
}
@When("Click on Sign Up3")
public void Click_on_Sign_Up3()
{
	signup.clickSignUp();
	//driver.findElement(By.cssSelector(null)).click();
	//Thread.sleep(6000);
	System.out.println("user logged In");
}

@Then("user is successfully registered3")
public void user_is_successfully_registered3()
{
	System.out.println("user is successfully registered");
}

@When("Close3")
public void close3()
{
	driver.close();
}

@Given("User is on sign up page4")
public void User_is_on_sign_up_page4()
{
	
}

@When("Do not choose the user category") 
public void not_choose_the_user_category()
{
	
}

@When("do not enter the name")
public void not_enter_the_name()
{
	
}

@When("do not enter the Email")
public void not_enter_the_Email()
{
	
}

@When("do not enter the password4")
public void not_enter_the_password_11()
{
	
}

@When("do not enter the mobile no.")
public void not_enter_the_mobile_no()
{
	
}
@When("do not check the agree field")
public void not_check_the_agree_field() {
	
}
@When("Click on Sign Up4")
public void Click_on_Sign_Up4()
{
	
}

@Then("alert should be given by all fields")
public void alert4()
{
	
}
@Then ("Close4")
public void close4()
{
	
}



}

   


