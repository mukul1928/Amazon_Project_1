package z_amazon_test_cases_project_1;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Home_Page;
@Listeners(Listeners_Class.class)
public class Test_Case_5_Amazon_Search_Products extends Launch_And_Quit
{
@Test(retryAnalyzer=z_amazon_test_cases_project_1.Retry_Class.class)
public void searching_the_shoes()
{
	Amazon_Home_Page a1=new Amazon_Home_Page(driver);
	a1.search_products();
}
}
