package z_amazon_test_cases_project_1;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Checkout_Payment_Page;
import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_Search_Products_Page;
import z_amazon_source_project_1.Amazon_Sign_In_Page;
@Listeners(Listeners_Class.class)
public class Test_Case_13_Amazon_Apply_Coupon_In_Product_Order_Page extends Launch_And_Quit
{
@Test(retryAnalyzer=z_amazon_test_cases_project_1.Retry_Class.class)
public void Apply_Coupons()
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
	a3.addtocartoption();
	
	Amazon_Checkout_Payment_Page a4=new Amazon_Checkout_Payment_Page(driver);
	a4.proceedtocheckout();
	a4.usethisaddress();
	a4.cashondelivery();
	a4.usethispayment();
	a4.couponcode();
}
}
