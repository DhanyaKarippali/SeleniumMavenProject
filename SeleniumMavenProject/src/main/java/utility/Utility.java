package utility;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	WebDriver driver;

	public WebDriver launchbrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\v-dhkar.REDMOND\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return driver;

	}

public WebDriver launchbrowser1(String url,String browser) throws InterruptedException {
		
	
	
		
		switch(browser) {
		
		case "chrome":System.setProperty("webdriver.chrome.driver","C:\\Users\\v-dhkar.REDMOND\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		  driver = new ChromeDriver(); 
		  driver.get(url);
		  driver.manage().window().maximize(); 
		  Thread.sleep(5000);
		  break;
		 
					
		
		case "ie":   System.setProperty("webdriver.ie.driver","C:\\Users\\v-dhkar.REDMOND\\Desktop\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		
		  driver = new InternetExplorerDriver(); driver.get(url);
		  driver.manage().window().maximize(); 
		  Thread.sleep(5000);
		  break;
		 
					
					
		
		  case "firefox":System.setProperty("webdriver.gecko.driver",
		  "C:\\Users\\v-dhkar.REDMOND\\Desktop\\Selenium\\geckodriver-v0.27.0-win32\\geckodriver.exe"
		  ); 
		  driver = new FirefoxDriver(); 
		  driver.get(url);
		  driver.manage().window().maximize(); 
		  Thread.sleep(5000);
		  break;
		  
		  
		 
		}

			return driver;
	}

public void click(By property) {
	
	WebDriverWait wait= new WebDriverWait(driver,5);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(property));
	
	driver.findElement(property).click();
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(property)).click();
	
}

public void sendkeys(By property,String str) {
	
	
	driver.findElement(property).sendKeys(str);
	
}

public void alertaccept() {
	
	Alert obj=driver.switchTo().alert();
	  
	  obj.accept();
	  
}


public void alertdismiss() {
	
	Alert obj=driver.switchTo().alert();
	  
	  obj.dismiss();
	
}

public void alertsendkeys(String str) {
	
	Alert obj=driver.switchTo().alert();
	
	
	  obj.sendKeys(str);
}
public String alertgetText() {
	
	Alert obj=driver.switchTo().alert();
	
	
	  String text=obj.getText();
	  
	  return text;
}

//public  void captureScreenshot(WebDriver driver,String screenshotName) throws IOException {
//
// TakesScreenshot scrShot =((TakesScreenshot)driver);
//
//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//
//FileUtils.copyFile(SrcFile,new File("C:/Screenshot/"+screenshotName+".png"));
//}

public void moveToElement(WebElement element) {

Actions action=new Actions(driver);

action.moveToElement(element).click().build().perform();
}

public void doubleClick(WebElement element) {

Actions action=new Actions(driver);

action.contextClick(element).build().perform();

}

public void drangAndDrop(WebElement from,WebElement to) {

Actions action=new Actions(driver);

action.dragAndDrop(from, to).build().perform();
}
}
