package base;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelReader;

public class Base {
	

public static WebDriver driver;

	
@Test
	public static void inIt() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		Select select=new Select( driver.findElement(By.id("select-demo")));
		List<WebElement> listValues=select.getOptions();
		for(WebElement we:listValues)
		{
		
			System.out.println(we.getText());
		}
		
	}
	
	
	/*@DataProvider
	public Object[][] dataDriverTypeOfBusiness()  {
		reader = new ExcelReader();

		int rowCount = reader.getsheetRows("Sheet1");
		int ColCount = reader.getSheetColoumns("Sheet1");
		System.out.println(rowCount);
		System.out.println(ColCount);
		Object data[][] = new Object[rowCount - 1][ColCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < ColCount; j++) {
				String name = reader.getCellData("Sheet1", j, i);
				System.out.print(name + "  ");
				data[i - 1][j] = name;
			}
		}
		return data;
	}*/
}
