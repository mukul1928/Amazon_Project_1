package z_amazon_test_cases_project_1;

import org.testng.annotations.Test;

import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_SignUp_Page;

public class Test_Case_2_Amazon_SignUp_Page extends Launch_And_Quit
{

@Test
public void Signup()
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
