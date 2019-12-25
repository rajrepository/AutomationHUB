package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id="txtUsername")
	static WebElement uname;
	

	@FindBy(id="txtPassword")
	static WebElement pass;
	
	
	public void fillLogin()
	{
		uname.sendKeys("Admin");
		pass.sendKeys("admin123");
	}
}
