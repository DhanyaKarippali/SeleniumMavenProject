package testNGclasses;

import org.testng.annotations.Test;

import elements.company;
import elements.loginpage;
import utility.Excelread;
import utility.Utility;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Company extends TestBase {
	
	loginpage login;
	company companypage;
	Excelread excel;
	
	///////////////////////////////////Login Test/////////////////////////////////////////////////////////////
	
	@Test(priority=1,enabled=true)
  
	public void loginpage1() throws InterruptedException, IOException {
	  
		login=new loginpage(driver);
	   
		excel=new Excelread();
	   
	   	String username = excel.readData(0, 0);
		
		String password = excel.readData(0, 1);
	   
	  //WebElement username=driver.findElement(By.id("loginform-username"));
		
		
	  
		login.setUsername(username);
		  
		  Thread.sleep(5000);
		  
		  login.setPassword(password);
		  
		  Thread.sleep(5000);
		 
		  login.clickLogin();
		  
		  Thread.sleep(5000);
		  
	  
	  
	}
	
	////////////////////////////////Save company Test/////////////////////////////////////////////////////
	
	@Test(priority=2,enabled=true)
	  
	
	public void company1() throws InterruptedException {
		
		 companypage=new company(driver);
		
		 companypage.ClickCompany();
		
		 Thread.sleep(5000);
		
		 companypage.setCompanyName("Company Dhanya");
		
		 Thread.sleep(5000);
		
		 companypage.setCompanyEmail("CompanyDhanya@gmail.com");
		
		 Thread.sleep(5000);
		
		 companypage.setCompanyAddress("Redmond, Washington");
		
		 Thread.sleep(5000);
		
		 companypage.clearDate1();
		 
		 companypage.setDate("9/27/20");
		
		 Thread.sleep(5000);
		
		 companypage.setStatus();
		 
		 Thread.sleep(5000);
		
		 companypage.saveData();
		
		 Thread.sleep(5000);
		
		
		Assert.assertTrue(companypage.getButtonStatus());
		
		
  }
  

}
