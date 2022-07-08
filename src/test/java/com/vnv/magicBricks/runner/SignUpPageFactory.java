package com.vnv.magicBricks.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPageFactory 

{
	
     WebDriver driver;
     
    @FindBy(xpath = "//*[@id=\"ubiusertype1\"]")
 	@CacheLookup
 	WebElement selectBuy1;
    
    @FindBy(xpath = "//*[@id=\"ubiusertype2\"]")
 	@CacheLookup
 	WebElement selectAgent;
    
    @FindBy(xpath = "//*[@id=\"ubiusertype3\"]")
 	@CacheLookup
 	WebElement selectBuilder;
  
    @FindBy(name ="ubifname")
 	@CacheLookup
 	WebElement name1;
  
    @FindBy(xpath = "//*[@id=\"ubiemail\"]")
 	@CacheLookup
 	WebElement email1;
  
    @FindBy(id = "ubipass" )
 	@CacheLookup
 	WebElement password1;
  
    @FindBy(id="ubimobile1")
 	@CacheLookup
 	WebElement mobileno1;
    
    @FindBy(className = "tc__checkbox")
 	@CacheLookup
 	WebElement checbox1;
  
    @FindBy(xpath ="//*[@id=\"signUp\"]/div/div[11]/button" )
 	@CacheLookup
 	WebElement signUp; 

    

	public WebElement selectBuyField()
	   {
		return selectBuy1;
		}

		public void selectBuy()
		{
		this.selectBuy1.click();
		}
		
		public WebElement selectAgentField()
		   {
			return selectAgent;
			}

			public void selecAgent()
			{
			this.selectAgent.click();
			}
			
			public WebElement selectBuilderField()
			   {
				return selectBuilder;
				}

				public void selectBuilder()
				{
				this.selectBuilder.click();
				}
		
		public WebElement fieldName()
		   {
			return name1;
			}
		
		public void enterName(String name)
		{
			this.name1.sendKeys(name);
		}

	
		public WebElement fieldEmail()
		   {
			return email1;
			}
		
		public void enterEmail(String email)
		{
			this.email1.sendKeys(email);
		}
		

		public WebElement fieldPassword()
		   {
			return password1;
			}
		
		public void enterPassword(String password)
		{
			this.password1.sendKeys(password);
		}
		
		public WebElement fieldMobile()
		   {
			return mobileno1;
			}
		
		public void enterMobileNo(String mobileno)
		{
			this.mobileno1.sendKeys(mobileno);
		}
	
	    public SignUpPageFactory(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		
		}
	    
	    public WebElement checkboxField()
		   {
			return checbox1;
			}

			public void clickCheckBox()
			{
			this.checbox1.click();
			}
			
			 
		    public WebElement signUpField()
			   {
				return signUp;
				}

				public void clickSignUp()
				{
				this.signUp.click();
				}
				

	
	
}
