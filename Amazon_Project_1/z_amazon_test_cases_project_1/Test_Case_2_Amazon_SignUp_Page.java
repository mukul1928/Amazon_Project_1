package z_amazon_test_cases_project_1;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_SignUp_Page;
import z_amazon_source_project_1.Amazon_Sign_In_Page;
@Listeners(Listeners_Class.class)
public class Test_Case_2_Amazon_SignUp_Page extends Launch_And_Quit
{
@Test(retryAnalyzer=z_amazon_test_cases_project_1.Retry_Class.class)
public void SignIn()
{
	Amazon_Sign_In_Page a1=new Amazon_Sign_In_Page(driver);
	a1.hoverovertosigninbutton();
	a1.email();
	a1.continuebutton();
	a1.rightpassword();
	a1.clicktosignin();
}
}
