package z_amazon_test_cases_project_1;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_Search_Products_Page;
@Listeners(Listeners_Class.class)
public class Test_Case_7_Amazon_Product_Details extends Launch_And_Quit
{
	@Test(retryAnalyzer=z_amazon_test_cases_project_1.Retry_Class.class)
	public void Product_Details()
	{
	Amazon_Home_Page a1=new Amazon_Home_Page(driver);
	a1.search_products();
	
	Amazon_Search_Products_Page a2=new Amazon_Search_Products_Page(driver);
	a2.category();
	a2.price();
	a2.clickoneshoes();
	}
}