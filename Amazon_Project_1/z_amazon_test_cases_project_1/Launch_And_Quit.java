package z_amazon_test_cases_project_1;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_And_Quit extends Listeners_Class
{
	@BeforeMethod
	@Parameters("browser")
	public void Launch_Browser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.navigate().to("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.navigate().to("https://www.amazon.in");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		}
	}
	
	@AfterMethod
	public void Close_Browser() throws IOException
	{
				driver.close();
	}
}
