package z_amazon_test_cases_project_1;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_Search_Products_Page;
import z_amazon_source_project_1.Amazon_Sign_In_Page;

public class Test_Case_10_Amazon_Update_Cart_Quantity extends Launch_And_Quit
{
	@Test
	public void Product_Details()
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
	a3.quantity();
	a3.addtocartoption();
	a3.deteleitemsfromcart();
}
}