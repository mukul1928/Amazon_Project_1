package z_amazon_source_project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Manage_Profile_Page 
{
	WebDriver driver;
	@FindBy(linkText="View")
	WebElement clicktoview;
	
	@FindBy(xpath="(//ul[@class='accordion-trigger-content preview desktop'])[1]")
	WebElement preferdepartment;
	
	@FindBy(xpath="(//button[.='Add'])")
	WebElement addbutton;
	
	@FindBy(xpath="//button[.='Men']")
	WebElement selectmen;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement savebutton;
	
	@FindBy(xpath="//button[@id='radix-3']")
	WebElement heightandweight;
	
	@FindBy(xpath="(//ul[@class='accordion-trigger-content preview desktop'])[3]")
	WebElement age;
	
	public void edityourprofile()
	{
		clicktoview.click();
	}
	
	public void choosedepartment()
	{
		preferdepartment.click();
	}
	
	public void clicktoaddbutton()
	{
		addbutton.click();
	}
	
	public void choosemen()
	{
		selectmen.click();
	}
	
	public void savemen()
	{
		savebutton.click();
	}
	
	public void chooseheight()
	{
		heightandweight.click();
	}
	
	public void chooseage()
	{
		age.click();
	}
	public Amazon_Manage_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
