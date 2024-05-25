package z_amazon_source_project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Sign_In_Page 
{
WebDriver driver;

@FindBy(id="nav-link-accountList-nav-line-1")
WebElement hoverovertosignin;

@FindBy(id="ap_email")
WebElement enteremailid;

@FindBy(id="continue")
WebElement clicktocontinue;

@FindBy(id="ap_password")
WebElement enterpassword;

@FindBy(id="signInSubmit")
WebElement submit;

public void hoverovertosigninbutton()
{
	hoverovertosignin.click();
}

public void email()
{
	enteremailid.sendKeys("chandanpandey1928@gmail.com");
}

public void continuebutton()
{
	clicktocontinue.click();
}

public void password()
{
	enterpassword.sendKeys("jamesbond007");
}

public void rightpassword()
{
	enterpassword.sendKeys("mukul1928");
}

public void clicktosignin()
{
	submit.click();
}



public Amazon_Sign_In_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

}
