package testNGclasses;

import org.testng.annotations.Test;

import utility.Utility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TestBase {
  
	 WebDriver driver;

	Utility util = new Utility();
	
  @BeforeTest
  
  public void beforeTest() throws InterruptedException {
	  
		driver = util.launchbrowser1("https://www.qabible.in/payrollapp/","firefox");

		Thread.sleep(5000);
  }

  @AfterTest
  
  public void afterTest() {
	  
	  driver.close();
  }

}
