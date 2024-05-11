package z_amazon_source_project_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Search_Products_Page 
{
ChromeDriver driver;
@FindBy(xpath="(//span[@class='a-list-item'])[2]")
WebElement chosingcategory;

@FindBy(xpath="//span[contains(text(),'₹1,000 - ₹2,500')]")
WebElement chosingpricing;

@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
WebElement clickfirstshoes;

@FindBy(id="p_72/1318476031")
WebElement rating;

@FindBy(xpath="//input[@id='add-to-cart-button']")
WebElement addtocart;

@FindBy(partialLinkText="Cart")
WebElement gotocart;

@FindBy(id="quantity")
WebElement selectquantity;

@FindBy(xpath="//input[@title='Delete 2 items']")
WebElement detelefromcart;

@FindBy(xpath="(//input[@id='buy-now-button'])")
WebElement buynow;

public void category()
{
	chosingcategory.click();
}
public void price()
{
	chosingpricing.click();
}

public void addtocartoption()
{
	addtocart.click();
}

public void clicktobuynow()
{
	buynow.click();
}

public void clickoneshoes()
{
	clickfirstshoes.click();
	Set<String> g1= driver.getWindowHandles();
	System.out.println(g1);
	Iterator<String> g2= g1.iterator();
	String s1= g2.next();//1st time->parent id sepreate
	String s2= g2.next();//2nd time->child id
	driver.switchTo().window(s2);//for switiching the control from one window to the second window
	//driver.close();
	driver.switchTo().window(s2);
}

public void chooserating()
{
	rating.click();
}

public void quantity()
{
	selectquantity.click();
	Select s1=new Select(selectquantity);
	s1.selectByValue("2");
}

public void deteleitemsfromcart()
{
	detelefromcart.click();
}


public Amazon_Search_Products_Page(ChromeDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
