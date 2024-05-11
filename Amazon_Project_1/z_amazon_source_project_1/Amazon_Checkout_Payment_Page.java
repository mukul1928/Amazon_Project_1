package z_amazon_source_project_1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Checkout_Payment_Page 
{
	ChromeDriver driver;
	@FindBy(id="sc-buy-box-ptc-button")
	WebElement clicktobuy;
	
	@FindBy(linkText="Change")
	WebElement clicktochange;
	
	@FindBy(xpath="//a[normalize-space()='Close']")
	WebElement closebuttonforaddress;
	
	@FindBy(xpath="(//div[@class='a-radio'])[3]")
	WebElement chooseaddress;
	
	@FindBy(xpath="(//input[@data-testid='Address_selectShipToThisAddress'])[1]")
	WebElement selectaddress;
	
	//@FindBy(xpath="(//a[@id='payChangeButtonId'])")
	//@FindBy(partialLinkText="Change")
	//@FindBy(linkText="Change")
	//@FindBy(id="spp-payment-change-coll")
	//@FindBy(id="payChangeButtonId")
	//@FindBy(xpath="(//span[@class='a-declarative'])[10]")
	//@FindBy(xpath="//a[@id='payChangeButtonId'][1]")
	//@FindBy(className="a-link-normal expand-panel-button expand-collapsed-panel-trigger checkout-pipeline-pref-link")
	//@FindBy(css="#payChangeButtonId")
	//@FindBy(tagName="a")
	//@FindBy(xpath="//a[@class='a-link-normal expand-panel-button expand-collapsed-panel-trigger checkout-pipeline-pref-link']")
	//@FindBy(xpath="(//span[@id='spp-payment-change-coll'])")
	//@FindBy(xpath="(//div[@class='a-column a-span2 a-text-right a-span-last'])[2]")
	
	@FindBy(xpath="(//h3[@class='a-color-base clickable-heading expand-collapsed-panel-trigger'])[2]")
	WebElement changepaymentoptionbutton;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
	WebElement otherUPIapps;
	
	@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")
	WebElement click_to_netbanking;
	
	@FindBy(xpath="(//span[@class='a-dropdown-prompt'])[1]")
	WebElement chooseanoptionDD;
	
	@FindBy(linkText="HDFC Bank")
	WebElement clicktohdfcbank;
	
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
	WebElement credit_debit_card_radio;
	
	@FindBy(xpath="")
	WebElement clicktoamazonpaylater;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
	WebElement emi_radio;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[5]")
	WebElement cash_on_delivery_radio;
	
	@FindBy(id="orderSummaryPrimaryActionBtn")
	WebElement use_this_payment_method_btn;
	
	@FindBy(id="spc-gcpromoinput")
	WebElement applycouponcode;
	
	

public void proceedtocheckout()
{
	clicktobuy.click();
}

public void changeaddress()
{
	clicktochange.click();
}

public void clicktocloseaddress()
{
	closebuttonforaddress.click();
}

public void takeaddress()
{
	chooseaddress.click();
}

public void usethisaddress()
{
	selectaddress.click();
}

public void choosepaymentmethod()
{
	changepaymentoptionbutton.click();
}

public void netbanking()
{
	click_to_netbanking.click();	
}

public void chooseDDnetbanking()
{
	chooseanoptionDD.click();
	Actions a1=new Actions(driver);
	a1.moveToElement(chooseanoptionDD).perform();
}

public void choosehdfcbank()
{
	clicktohdfcbank.click();
}

public void debitcreditcard()
{
	credit_debit_card_radio.click();
}

public void amazonpaylater()
{
	clicktoamazonpaylater.click();
}

public void clicktootherupi()
{
	otherUPIapps.click();
}

public void emi()
{
	emi_radio.clear();
}

public void cashondelivery()
{
	cash_on_delivery_radio.click();
}

public void usethispayment()
{
	use_this_payment_method_btn.click();
}

public void couponcode()
{
	applycouponcode.sendKeys("AJXpp89");
}

public Amazon_Checkout_Payment_Page(ChromeDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}