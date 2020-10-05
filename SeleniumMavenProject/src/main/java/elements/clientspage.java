package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clientspage {
	
WebDriver driver;
	
	public clientspage(WebDriver driver1){
		
		this.driver=driver1;
		
		PageFactory.initElements( driver, this);
		
	
	}
	
	@FindBy(xpath ="//*[@id=\"w3\"]/li[3]/a")
	
	public WebElement clients;
	
	@FindBy(xpath ="//*[@id=\"clientsearch-client_name\"]")
	
	public WebElement clientname;

	@FindBy(id ="clientsearch-id")

	public WebElement clientsearchid;
	
	@FindBy(xpath ="//*[@id=\"w0\"]/div[3]/button[1]")

	public WebElement searchbutton;
	
	
	public void setClientsName(String clientname1) {
		
		clientname.click();
		
		clientname.sendKeys(clientname1);
	}
	
	
	public void setClientSearchId(String clientsearchid1) {
		
		clientname.sendKeys(clientsearchid1);
	}
	
	public void search() {
		
		searchbutton.click();
		
	}

}


