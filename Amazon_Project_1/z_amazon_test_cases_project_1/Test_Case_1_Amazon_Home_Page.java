package z_amazon_test_cases_project_1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_SignUp_Page;
@Listeners(Listeners_Class.class)
public class Test_Case_1_Amazon_Home_Page extends Launch_And_Quit
{
	
@Test(retryAnalyzer=z_amazon_test_cases_project_1.Retry_Class.class) 
public void sign_Up()
{
	Amazon_Home_Page a1=new Amazon_Home_Page(driver);
	a1.signup();
	Amazon_SignUp_Page a2=new Amazon_SignUp_Page(driver);
	a2.enterusername();
	a2.enteryourmobileno();
	a2.createyourpassword();
	a2.clicktosignup();
}
}
