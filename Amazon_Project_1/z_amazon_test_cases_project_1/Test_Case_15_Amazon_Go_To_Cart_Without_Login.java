package z_amazon_test_cases_project_1;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_Search_Products_Page;

public class Test_Case_15_Amazon_Go_To_Cart_Without_Login extends Launch_And_Quit
{
	@Test
	public void Go_To_Cart_Without_Login()
	{	
		Amazon_Home_Page a2=new Amazon_Home_Page(driver);
		a2.search_products();

		Amazon_Search_Products_Page a3=new Amazon_Search_Products_Page(driver);
		a3.clickoneshoes();
		a3.addtocartoption();
	}
}
