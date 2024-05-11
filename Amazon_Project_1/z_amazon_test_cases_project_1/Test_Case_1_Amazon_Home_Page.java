package z_amazon_test_cases_project_1;

import org.testng.annotations.Test;

import z_amazon_source_project_1.Amazon_Home_Page;

public class Test_Case_1_Amazon_Home_Page extends Launch_And_Quit
{
	
@Test 
public void sign_in()
{
	Amazon_Home_Page a1=new Amazon_Home_Page(driver);
	a1.signup();
}
}
