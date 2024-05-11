package z_amazon_test_cases_project_1;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Checkout_Payment_Page;
import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_Search_Products_Page;
import z_amazon_source_project_1.Amazon_Sign_In_Page;

public class Test_Case_12_Amazon_Choose_Each_Payment_Mode extends Launch_And_Quit
{
@Test
public void Test_Case_12_Choose_Each_Payment_Methods() throws InterruptedException
{	
	Amazon_Sign_In_Page a1=new Amazon_Sign_In_Page(driver);
	a1.hoverovertosigninbutton();
	a1.email();
	a1.continuebutton();
	a1.rightpassword();
	a1.clicktosignin();
	
	Amazon_Home_Page a2=new Amazon_Home_Page(driver);
	a2.search_products();
	
	Amazon_Search_Products_Page a3=new Amazon_Search_Products_Page(driver);
	a3.clickoneshoes();
	//a3.quantity();
	a3.addtocartoption();
	
	Amazon_Checkout_Payment_Page a4=new Amazon_Checkout_Payment_Page(driver);
	a4.proceedtocheckout();
	//a4.changeaddress();
	//a4.takeaddress();
	a4.usethisaddress();
	//a4.choosepaymentmethod();
	//a4.debitcreditcard();
	//Thread.sleep(1000);
	//a4.netbanking();
	//a4.chooseDDnetbanking();
	//a4.choosehdfcbank();
	//Thread.sleep(1000);
	//a4.clicktootherupi();
	//Thread.sleep(1000);
	//a4.emi();
	//Thread.sleep(1000);
	a4.cashondelivery();
}
}
