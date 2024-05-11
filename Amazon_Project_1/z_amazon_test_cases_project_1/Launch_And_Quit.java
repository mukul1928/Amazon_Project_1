package z_amazon_test_cases_project_1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_And_Quit 
{
	ChromeDriver driver;
	
	@BeforeMethod
	public void Launch_Browser()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void Close_Browser()
	{
		//driver.close();
	}
}
