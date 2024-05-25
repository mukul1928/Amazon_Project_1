package z_amazon_source_project_1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
WebDriver driver;

@FindBy(xpath="(//a[.='Start here.'])[2]")
WebElement hoverovertosignup;

@FindBy(xpath="//span[@class='nav-line-2 ']")
WebElement hoverovertoaccoutandlists;

@FindBy(xpath="(//span[@class='sc-ksBlkl sc-jRwbcX fedVjG fqsXfW'])[1]")
WebElement manage_profile;

@FindBy(id="twotabsearchtextbox")
WebElement searching_shoes;


public void signup()
{
	hoverovertosignup.click();
}

public void hovertoaccountandlists()
{
	Actions a1=new Actions(driver);
	a1.moveToElement(hoverovertoaccoutandlists).perform();
	//hoverovertoaccoutandlists.click();
}

public void edit_profile()
{
	manage_profile.click();
}

public void search_products()
{
	searching_shoes.sendKeys("shoes");
	searching_shoes.sendKeys(Keys.ENTER);
}

public Amazon_Home_Page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

}

