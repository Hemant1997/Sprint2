package com.vnv.magicBricks.steps.definitions;

import java.io.FileInputStream;
import java.io.IOException;

import com.magicbricks.utils.*;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;


import com.vnv.magicBricks.runner.LogInPageFactory;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePlusLogInSteps {
	private WebDriver driver;
	private LogInPageFactory login;
	XSSFWorkbook wb;
    XSSFSheet sh;
      ScreenShot screen;
    

	@Before
	public void openBrowser() throws Exception{
		//launching web browser....
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	login=new LogInPageFactory(driver);
		driver.manage().window().maximize();
		
		//using pagefactory file as reference....
		login=PageFactory.initElements(driver, LogInPageFactory .class);
		
		//reading file from excel....
		FileInputStream fread=new FileInputStream("./Excell_sheet/MagicBricks.xlsx");
		wb=new XSSFWorkbook(fread);
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() throws Exception
	{
		System.out.println("user is on home page");
		driver.navigate().to("https://www.magicbricks.com/");
		ScreenShot.captureScreenShot99(driver);
	}
	
	@When("mouse hover on buy")
	public void mouse_hover_on_buy() throws Exception
	{
		WebElement uname= driver.findElement(By.xpath("//*[@id=\"buyheading\"]"));
		Actions act= new Actions(driver);
		act.moveToElement(uname).build().perform();
		Thread.sleep(3000);
		//driver.close();
				
	}
	
	@When("mouse hover on rent")
	public void mouse_hover_on_rent() throws Exception
	{
		WebElement uname1= driver.findElement(By.xpath("//*[@id=\"rentheading\"]"));
		Actions act1= new Actions(driver);
		act1.moveToElement(uname1).build().perform();
		Thread.sleep(3000);
	}
	
	@When("mouse hover on sell")
	public void mouse_hover_on_sell() throws Exception
	{
		WebElement uname0= driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/a"));
		Actions act0= new Actions(driver);
		act0.moveToElement(uname0).build().perform();
		Thread.sleep(3000);
	}
	
	@When("mouse hover on home loan")
	public void mouse_hover_on_home_loan() throws Exception
	{
		WebElement uname1= driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[4]/a"));
		Actions act1= new Actions(driver);
		act1.moveToElement(uname1).build().perform();
		Thread.sleep(3000);
	}
	
	@When("mouse hover on property services")
	public void mouse_hover_on_property_services() throws Exception
	{
		WebElement uname1= driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[5]/a"));
		Actions act1= new Actions(driver);
		act1.moveToElement(uname1).build().perform();
		Thread.sleep(3000);
	}
	
	@When("mouse hover on MB Advise")
	public void mouse_hover_on_MB_Advise() throws Exception
	{
		WebElement uname1= driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/a"));
		Actions act1= new Actions(driver);
		act1.moveToElement(uname1).build().perform();
		Thread.sleep(3000);
	}
	
	
	@When("mouse hover on help")
	public void mouse_hover_on_help() throws Exception
	{
		WebElement uname2= driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[7]/a"));
		Actions act2= new Actions(driver);
		act2.moveToElement(uname2).build().perform();
		Thread.sleep(3000);
	}
	
	@Then ("all links are working")
	public void all_links_are_working()
	{
		System.out.println("All links are working fine");
	}
	
	@When("close0")
	public void close0()
	{
		driver.quit();
	}
	
	
	
	//@SuccessfullLogIn
	@Given("user is on LogIn page")
	public void user_is_on_LogIn_page()
	{
		System.out.println("user is on LogIn page");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
	}
	
	@When("enter registered email_id")
	public void enter_registered_email_id() throws Exception
	{
		System.out.println("user entered valid username");
		sh=wb.getSheet("Sheet1");
		login.setUname(sh.getRow(1).getCell(0).getStringCellValue());
		//login.setPassword(sh.getRow(5).getCell(1).getStringCellValue());
		//driver.findElement(By.id("emailOrMobile")).sendKeys("sh.getRow(5).getCell(0).getStringCellValue()");;
		Thread.sleep(2000);
	}
	
    @When("click on next")
    public void click_on_next()
    {
        login.clickNext();
    	
    }
    
    @When("enter registered password")
    public void When_enter_registered_password() throws Exception
    {
    	System.out.println("user entered password");
    	sh=wb.getSheet("Sheet1");
       login.setPassword(sh.getRow(1).getCell(1).getStringCellValue());
     // login.setPassword(sh.getRow(5).getCell(0).getStringCellValue());y
    	//driver.findElement(By.id("password")).sendKeys("Hemant1997");
        Thread.sleep(2000);	
    }
    
    @When("click on logIn")
    public void click_on_logIn()
    {
    	login.clickLogIn();
    }
	
    @When("User should LogIn successfully")
    public void User_should_LogIn_successfully()
    {
    	System.out.println("user is logged in successfully");
    }
    
    @Then("click on logOut")
    public void click_on_logOut() throws Exception
    {
    	driver.findElement(By.xpath("//*[@id=\"popupjsp\"]/a")).click();
    	WebElement uname2= driver.findElement(By.xpath("//*[@id=\"buyerDashboardNav\"]/div[1]/div"));
		Actions act2= new Actions(driver);
		act2.moveToElement(uname2).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"buyerDashboardNav\"]/div[2]/ul/li[7]/span")).click();
        Thread.sleep(3000);
    }
    
    @Then("close")
    public void close()
    {
    	driver.quit();
    }
    
    
    //@UnsuccessfullLogIn_by_unregistered_email_id
   @Given("user is on LogIn page1")
	public void user_is_on_LogIn_page1()
	{
		System.out.println("user is on LogIn page");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
	}
   
   @When("enter unregistered email_id1")
   public void enter_unregistered_email_id1()
   {
	   System.out.println("user entered valid username");
		sh=wb.getSheet("Sheet1");
		login.setUname(sh.getRow(2).getCell(0).getStringCellValue());
   }
   
   @When("click on next1")
   public void click_on_next1() throws Exception
   {
	   login.clickNext();
	   Thread.sleep(5000);
   }
   @Then("alert No User found with this Email id.1")
   public void alert()
   {
	   System.out.println("No User found with this Email id");
   }
	
   @When("close1")
   public void close1()
   {
	  driver.quit(); 
   }
   
   //@UnsuccessfullLogIn_by_wrong_password
   @Given("user is on LogIn page2")
	public void user_is_on_LogIn_page2()
	{
		System.out.println("user is on LogIn page2");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
	}
    
   @When("enter registered email_id2")
   public void enter_registered_email_id2()
   {
	   System.out.println("user entered valid username2");
		sh=wb.getSheet("Sheet1");
		login.setUname(sh.getRow(3).getCell(0).getStringCellValue());
   }
   
  // enter wrong password2
    
   
   @When("click on next2")
   public void click_on_next2()
   {
	   login.clickNext();
	   
   }
   
   @When("enter wrong password2")
   public void enter_wrong_password()
   {
	   System.out.println("user entered wrong password");
   	  sh=wb.getSheet("Sheet1");
      login.setPassword(sh.getRow(3).getCell(1).getStringCellValue());
      
      
   }
   
   @Then("alert Wrong password. Try again or click Forgot password to reset it")
   public void alert2()
   {
	   System.out.println("alert Wrong password. Try again or click Forgot password to reset it");
   }
   
   @When("click on LogIn2")
   public void click_on_logIn2() throws Exception
   {
   	login.clickLogIn();
   	Thread.sleep(5000);
   }
	
   @When("close2")
   public void close2()
   {
	  driver.quit(); 
   }
   
   
   //@UnsuccessfullLogIn_by_blank_email_id_field
   @Given("user is on LogIn page3")
   public void user_is_on_LogIn_page3()
   {
	   System.out.println("user is on LogIn page2");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
   }
   
  
   
   @When("no email_id entered3")
   public void no_email_id_entered3()
   {
	   System.out.println("user entered valid username");
		sh=wb.getSheet("Sheet1");
		login.setUname(sh.getRow(4).getCell(0).getStringCellValue());
   }
   
   @When("click on next3")
	public void click_on_next3()
	{
	   login.clickNext();
	}
   @Then("alert Please enter either Email id or Mobile number3")
	public void alert3()
	{
	   System.out.println("alert Please enter either Email id or Mobile number3");
	}
   @When("close3")
   public void close3()
   {
	  driver.quit();
   }
   
   //@UnsuccessfullLogIn_by_blank_password
   @Given("user is on LogIn page4")
   public void user_is_on_LogIn_page_first4() 
   {
	   System.out.println("user is on LogIn page2");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
   }
   
  @When("entered the registered email_id4")
  public void entered_the_registered_email_id4()
  {
	  System.out.println("user entered valid username");
		sh=wb.getSheet("Sheet1");
		login.setUname(sh.getRow(5).getCell(0).getStringCellValue());
 }
  
  @When("click on next4")
  public void click_on_next4()
  {
	  login.clickNext();
  }
  
  @When("do not enter the password")
  public void not_enter_the_pass()
  {
	    System.out.println("do not enter the password");
		sh=wb.getSheet("Sheet1");
		login.setUname(sh.getRow(5).getCell(1).getStringCellValue());

	  
  }
  @Then("click on logIn4")
  public void click_on_logIn4() throws Exception
  {
	  login.clickLogIn();
	  Thread.sleep(3000);
	 
  }
  		  
  @Then("alert Please enter your password4.")
   public void alert_Please_enter_your_password4()
   {
	System.out.println("alert Please enter your password");  
   }
   
   
  @When("close4")
  public void close4()
  {
	  driver.quit();
  }
   
 // @SuccessfullLogIn_by_mobile_no
  
  @Given("user is on log in page5")
  public void user_is_on_log_in_page5()
  {
	  System.out.println("user is on LogIn page2");
	 driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
		 
  }
  
  @When("enter the registered mobile no")
  public void enter_the_registered_mobile_no()
  { 
	  System.out.println("enter the registered mobile no");
	  sh=wb.getSheet("Sheet2");
		login.setUname(sh.getRow(1).getCell(0).getStringCellValue());
		
  }
  
  @When("click on next5")
  public void click_on_next5() throws Exception
  {
	  login.clickNext();
	  Thread.sleep(3000);
  }
 
  @When("enters valid otp")
  public void enters_valid_otp() throws Exception
  {
	  System.out.println("please enter the opt");
	  Thread.sleep(10000);
  }
  @When("click on logIn5")
  public void click_on_logIn5()
  {
	  login.clickContinues();
  }
  
  @Then("user should logIn succesfully")
  public void user_should_logIn_succesfully()
  {
	  System.out.println("user should logIn successfully");
	  
  }
  
  @Then("user should logOut")
  public void user_should_logOut() throws Exception
  {
	  WebElement uname2= driver.findElement(By.xpath("//*[@id=\"buyerDashboardNav\"]/div[1]/div"));
		Actions act2= new Actions(driver);
		act2.moveToElement(uname2).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"buyerDashboardNav\"]/div[2]/ul/li[7]/span")).click();
      Thread.sleep(3000);
	  
  }
  @When("close5")
  public void close5()
  {
	  driver.quit();
  }
  
  //@UnsuccessfullLogIn_by_unregistered_mob_no
  @Given("user is on LogIn page6")
  public void user_is_on_LogIn_page6()
  {
	  System.out.println("user is on LogIn page2");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
	  
  }
  @When("enter unregistered mobile no6")
  public void enter_unregistered_mobile_no6()
  {
	  System.out.println("enter the unregistered mobile no");
	  sh=wb.getSheet("Sheet2");
	  login.setUname(sh.getRow(2).getCell(0).getStringCellValue());
		
  }
		  
  
  @When("click on next6")
  public void click_on_next6()
  {
	  login.clickNext();
  }
  @Then("alert No User found with this mobileno6")
  public void alert6()
  {
	  System.out.println("alert No User found with this mobileno6");
  }
  @When("close6")
  public void close6()
  {
	  driver.quit();
  }
 
  //@UnsuccessfullLogIn_by_wrong_otp
 // Scenario: log In functionality when user entered wrong otp
  @Given("user is on LogIn page7")
  public void user_is_on_LogIn_page7()
  {
	  System.out.println("user is on LogIn page2");
		driver.navigate().to("https://accounts.magicbricks.com/userauth/login");
	  
  }
  
  
 @When("enter registered mobile no7")
 public void enter_registered_mobile_no7()
 {
	 System.out.println("enter the unregistered mobile no");
	  sh=wb.getSheet("Sheet2");
		login.setUname(sh.getRow(3).getCell(0).getStringCellValue());
 }
 
  @When("click on next7")
  public void click_on_next7()
  {
	  login.clickNext();
  }
  @When("enter wrong otp")
  public void enter_wrong_otp()
  {
	  System.out.println("enter wrong otp");
  }
  
  @Then("alert incorrect otp code")
  public void alert_incorrect_otp_code()
  {
	 System.out.println("incorrect otp code");
  }
  
  @Then("close7")
  public void close7()
  {
	  driver.quit();
  }
  
  

}

   


