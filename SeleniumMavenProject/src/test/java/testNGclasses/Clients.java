package testNGclasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import elements.clientspage;
import elements.loginpage;
import utility.Excelread;

public class Clients extends TestBase {
	
	loginpage login;
	
	clientspage clientspage;
	
	Excelread excel;
	
	////////////////////////////Login Test/////////////////////////////////////////////
	
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
	
	
	//////////////////////////////////Client search Test/////////////////////////////////
	
  @Test(priority=2,enabled=true)
  public void clientSearch() throws InterruptedException {
	  
	  clientspage=new clientspage(driver);
	  
	  clientspage.setClientsName("Appolo Nursing Home");
	  
	  Thread.sleep(5000);
	  
	  clientspage.setClientSearchId("1");
	  
	  Thread.sleep(5000);
	  
	  clientspage.search();
	  
	  Thread.sleep(5000);
	  
	  Assert.assertEquals(clientspage.clientNameGetText(), "Appolo Nursing Home");
  }
}
