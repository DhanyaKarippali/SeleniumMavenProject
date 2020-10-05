package testNGclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elements.Branchpage;
import elements.company;
import elements.loginpage;
import utility.Excelread;

public class ViewandUpdateBranch extends TestBase {
	

	loginpage login;
	company companypage;
	Branchpage branchpage;
	Excelread excel;

  /////////////////////////////////Login Test/////////////////////////////////////////////////
		
	@Test(priority=1,enabled=true)
		  
		public void loginpage1() throws InterruptedException, IOException {
		
		login=new loginpage(driver);
		
		excel=new Excelread();
		   
	   	String username = excel.readData(0, 0);
		
		String password = excel.readData(0, 1);
		  
		  
		login.setUsername(username);
			  
		Thread.sleep(5000);
			  
		login.setPassword(password);
			  
		Thread.sleep(5000);
			 
		login.clickLogin();
			  
		Thread.sleep(5000);
		}
	
	/////////////////////////View and Update test///////////////////////////////////////////////
		
		@Test(priority=2,enabled=true)
		
	  public void viewBranch() throws InterruptedException {
			
			companypage=new company(driver);
			
			companypage.ClickCompany();
			
			Thread.sleep(5000);
			
			branchpage=new Branchpage(driver);
			
			branchpage.branchClick();
			
			Thread.sleep(5000);
			
			branchpage.view();
			
			Thread.sleep(5000);
			
			Assert.assertEquals(branchpage.viewGetText(), "Company Dhanya");
			
		}
		
		//////////////////////////////Update Branch Test/////////////////////////////////////////
		
		@Test(priority=3,enabled=true)
		
		  public void UpdateBranch() throws InterruptedException {
			
			branchpage=new Branchpage(driver);
			
			branchpage.update();
			
			Thread.sleep(5000);
			
			branchpage.setBranchName("ekm4");
			
			Thread.sleep(5000);
			
			branchpage.saveBranch();
			
			Thread.sleep(5000);
			
			Assert.assertEquals(branchpage.UpdateGetText(), "ekm4");
			
			
}
}
