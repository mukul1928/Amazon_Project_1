package z_amazon_test_cases_project_1;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Home_Page;

public class Test_Case_5_Amazon_Search_Products extends Launch_And_Quit
{
@Test
public void searching_the_shoes()
{
	Amazon_Home_Page a1=new Amazon_Home_Page(driver);
	a1.search_products();
}
}
