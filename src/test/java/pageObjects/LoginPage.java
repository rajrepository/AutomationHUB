package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	
	@FindBy(id="txtUsername")
	public static WebElement uname;
	
	
	@FindBy(id="txtPassword")
	public static WebElement password;
	
	
	@FindBy(id="btnLogin")
	public static WebElement loginButton;
	
	
	public static void usernameField(String username)
	{
		uname.sendKeys(username);
	}
	
	public static void passwordField(String pass)
	{
		password.sendKeys(pass);
	}
	
	public static void loginButton()
	{
		loginButton.click();
	}
	
}
