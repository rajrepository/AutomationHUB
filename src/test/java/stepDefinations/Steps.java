package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class Steps {

	public static WebDriver driver;
	
	
	
	
	@When("User launches browser")
	public void user_launches_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    
	}

	@Given("User gives url {string}")
	public void user_gives_url(String url) {
		driver.get(url);
	    
	}

	@Given("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String usern, String passwd) {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.usernameField(usern);
		LoginPage.passwordField(passwd);
	   
	}


	@Then("click on login")
	public void click_on_login() {
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.loginButton();
	}


}
