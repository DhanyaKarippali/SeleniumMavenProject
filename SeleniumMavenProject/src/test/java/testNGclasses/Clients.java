package testNGclasses;

import org.testng.annotations.Test;

import elements.clientspage;
import elements.loginpage;

public class Clients extends TestBase {
	
	loginpage login;
	
	clientspage clientspage;
	
	@Test(priority=1)
	  
	public void loginpage1() throws InterruptedException {
	
	login=new loginpage(driver);
	  
	  //WebElement username=driver.findElement(By.id("loginform-username"));
		
		
	  
	   login.setUsername("carol");
		  
		  Thread.sleep(5000);
		  
		  login.setPassword("1q2w3e4r");
		  
		  Thread.sleep(5000);
		 
		  login.clickLogin();
		  
		  Thread.sleep(5000);
	}
	
	
  @Test(priority=2)
  public void clientSearch() throws InterruptedException {
	  
	  clientspage=new clientspage(driver);
	  
	  clientspage.setClientsName("Appolo Nursing Home");
	  
	  Thread.sleep(5000);
	  
	  clientspage.setClientSearchId("1");
	  
	  Thread.sleep(5000);
	  
	  clientspage.search();
	  
	  Thread.sleep(5000);
	  
	  
  }
}
