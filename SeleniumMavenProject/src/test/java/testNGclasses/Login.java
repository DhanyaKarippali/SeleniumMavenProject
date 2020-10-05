package testNGclasses;

import org.testng.annotations.Test;

import elements.loginpage;
import utility.Excelread;
import utility.Utility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Login extends TestBase {
	
	loginpage login;
	
	 Excelread excel;
	 
	 //////////////////////////////Login test////////////////////////////////////////////////////
	
  @Test(priority=2,enabled=true)
  
  public void loginpage1() throws InterruptedException, IOException {
	  
	  login=new loginpage(driver);
	  
	  //WebElement username=driver.findElement(By.id("loginform-username"));
		
		
	  
	  //login.username.sendKeys("carol");
	  
	    excel = new Excelread();

		String username = excel.readData(0, 0);
		
		String password = excel.readData(0, 1);

	  
	  login.setUsername(username);
	  
	  Thread.sleep(5000);
	  
	  login.setPassword(password);
	  
	  Thread.sleep(5000);
	 
	  login.clickLogin();
	  
	  Thread.sleep(5000);
	  
	  
  }
  /////////////////////To verify Loginpage Title/////////////////////////////////////////
  	
  
  @Test(priority=1,enabled=true)

	public void verifyTitle(){
  
  			login=new loginpage(driver);
  			
  			Assert.assertEquals(login.getTitle(), "Login");
  
  			System.out.println("Expected title------>" +login.getTitle());
 }
	  
	  
  }
  



