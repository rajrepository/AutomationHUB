package pageTest;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.Login;

public class LoginTest extends Base  {
	
	
	
	

	@BeforeMethod
	public void start() throws InterruptedException
	{
		inIt();
	}
	
	
	@Test
	
		public void end()
		{
			
		
		Login l=new Login(driver);
		l.fillLogin();
	}

	
	
	
}
