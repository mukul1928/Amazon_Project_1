package z_amazon_test_cases_project_1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import z_amazon_source_project_1.Amazon_Sign_In_Page;
@Listeners(Listeners_Class.class)
public class Test_Case_3_Amazon_Invalid_Credentials extends Launch_And_Quit
{
@Test(retryAnalyzer=z_amazon_test_cases_project_1.Retry_Class.class)
public void login_with_invalid_credentials()
{	
	Amazon_Sign_In_Page a3=new Amazon_Sign_In_Page(driver);
	a3.hoverovertosigninbutton();
	a3.email();
	a3.continuebutton();
	a3.password();
	a3.clicktosignin();
}
}
