package z_amazon_test_cases_project_1;

import org.testng.annotations.Test;

import z_amazon_source_project_1.Amazon_Sign_In_Page;

public class Test_Case_3_Amazon_Invalid_Credentials extends Launch_And_Quit
{
@Test

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
