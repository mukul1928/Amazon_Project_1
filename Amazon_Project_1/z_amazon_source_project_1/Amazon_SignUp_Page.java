package z_amazon_source_project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SignUp_Page 
{
WebDriver driver;

@FindBy(id="ap_customer_name")
WebElement enteryourname;

@FindBy(id="ap_phone_number")
WebElement entermobileno;

@FindBy(id="ap_password")
WebElement createpassword;

@FindBy(id="continue")
WebElement verifyyourmobileno;

public void enterusername()
{
	enteryourname.sendKeys("Mukul Pandey");
}

public void enteryourmobileno()
{
	entermobileno.sendKeys("9807717087");
}
public void createyourpassword()
{
	createpassword.sendKeys("chandan1928");
}

public void clicktosignup()
{
	verifyyourmobileno.click();
}

public Amazon_SignUp_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
