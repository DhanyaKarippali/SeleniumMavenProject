package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Branchpage {
	
WebDriver driver;
	
	public Branchpage(WebDriver driver1){
		
		this.driver=driver1;
		
		PageFactory.initElements( driver, this);
		
	
	}
	
	@FindBy(xpath ="/html/body/section/div/div/div[1]/ul/li[2]/a")
	
	public WebElement branch;
	
	
	@FindBy(id ="branch-company_id")
	
	public WebElement branchcompany;
	
	@FindBy(id ="branch-branch_name")
	
	public WebElement branchname;
	
	@FindBy(id="branch-branch_address")
	
	public WebElement branchaddress;
	
	@FindBy(xpath="//*[@id=\"w1\"]/div[4]/div/label")
	
	public WebElement branchstatus;

	@FindBy(xpath="//*[@id=\"w1\"]/div[5]/div/button")

	public WebElement branchsave;
	
	@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[5]/a[1]/span")

	public WebElement viewbutton;
	
	@FindBy(xpath="//*[@id=\"w1\"]/tbody/tr[1]/td")

	public WebElement viewcompanyname;
	
	@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[5]/a[2]/span")

	public WebElement updatebutton;
	
	@FindBy(xpath="//*[@id=\"w0\"]/table/tbody/tr[1]/td[3]")

	public WebElement updatedbranchname;
	
	public void branchClick() {
		
		branch.click();
	}
	
	public void setCompanyName() {
		
		//branchcompany.click();
		
		Select obj = new Select(branchcompany);
		
		obj.selectByVisibleText("Company Dhanya");
	}
	
	
	public void setBranchName(String branchname1) {
	
		branchname.clear();
		
		branchname.sendKeys(branchname1);
	}

	public void setBranchAddress(String branchaddress1) {
	
	branchaddress.clear();
	
	branchaddress.sendKeys(branchaddress1);
}
	
	public void setStatus() {
		
		branchstatus.click();
	}
	
	public void saveBranch() {
		
		branchsave.click();
	}
	

	public boolean getButtonStatus() {
	 
	 boolean buttonstatus=branchsave.isDisplayed();
			 
			 return buttonstatus;
 }
	
	public void view() {
		
		viewbutton.click();
	}
	
	
	public String viewGetText() {
		
		return viewcompanyname.getText();
	}
	
public void update() {
		
	updatebutton.click();
	}

public String UpdateGetText() {
	
	return updatedbranchname.getText();
}
	

}
