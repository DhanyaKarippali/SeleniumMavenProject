package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		  
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\v-dhkar.REDMOND\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		 
		  driver = new ChromeDriver();
		  driver.get("http://www.seleniumeasy.com/test/");
		  driver.manage().window().maximize(); 
		  Thread.sleep(5000);
		  
		  System.out.println(driver.getTitle());

	}

}
