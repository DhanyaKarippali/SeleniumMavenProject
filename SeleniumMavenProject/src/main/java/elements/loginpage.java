package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
		
		WebDriver driver;
		
		//Constructor invoking initElements method
		
		public loginpage(WebDriver driver1){
			
			this.driver=driver1;
			
			PageFactory.initElements( driver, this);
			
		
		}
		
		@FindBy(id ="loginform-username")
		
		public WebElement username;
		
		@FindBy(id ="loginform-password")
		
		public WebElement password;
		
		@FindBy(xpath="//*[@id=\"login-form\"]/div[5]/button")
		
		public WebElement loginbutton;
		
		
		public void setUsername(String strusername) {
			
			username.sendKeys(strusername);
		}
		
		public void setPassword(String strpassword) {
			
		password.sendKeys(strpassword);
		
		}
		
		public void clickLogin() {
			
			loginbutton.click();
		}
		
		//Get the title of login page and return
		
		public String getTitle() {
			
			return driver.getTitle();
		}
		
	}