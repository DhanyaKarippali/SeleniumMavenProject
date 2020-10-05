package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class company {
	

	WebDriver driver;
	
	public company(WebDriver driver1){
		
		this.driver=driver1;
		
		PageFactory.initElements( driver, this);
		
	
	}
	
	@FindBy(xpath ="/html/body/header/div[2]/div/div/nav/div/div[2]/ul/li[2]/a")
	
	public WebElement company;
	
	@FindBy(id ="company-company_name")
	
	public WebElement companyname;
	
	@FindBy(id="company-company_email")
	
	public WebElement companyemail;
	
	@FindBy(id="company-company_address")
	
	public WebElement address;
	
	@FindBy(xpath="//*[@id=\"company-started_at-kvdate\"]/span[2]/i")
	
	public WebElement cleardate;
	
	@FindBy(id="company-started_at")
	
	public WebElement startdate;
	
	@FindBy(xpath="//*[@id=\"w0\"]/div[5]/div/label")
	
	public WebElement status;
	
	@FindBy(xpath="//*[@id=\"w0\"]/div[6]/div/button")
	
	public WebElement save;
	
	
	public void ClickCompany() {
		
		company.click();
	}
	
	
	public void setCompanyName(String strcompanyname) {
		
		companyname.clear();
		companyname.sendKeys(strcompanyname);
	}
	
	
	public void setCompanyEmail(String strcompanyemail) {
		
		companyemail.clear();
		companyemail.sendKeys(strcompanyemail);
	}
	

	public void setCompanyAddress(String strcompanyaddress) {
	
	address.clear();
	address.sendKeys(strcompanyaddress);
}

	public void clearDate1() {
		
		cleardate.click();
	}

	public void setDate(String date) {
		
		startdate.sendKeys(date);
	}
	
	
	public void setStatus() {
	
		//status.clear();
		
		status.click();
	}

	public void saveData() {
	
	save.click();
	}
	
	public boolean getButtonStatus() {
	 
	 boolean buttonstatus=save.isDisplayed();
			 
			 return buttonstatus;
 }
	
}


