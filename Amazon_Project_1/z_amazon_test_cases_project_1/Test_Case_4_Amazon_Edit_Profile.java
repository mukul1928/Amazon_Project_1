package z_amazon_test_cases_project_1;
import org.testng.annotations.Test;
import z_amazon_source_project_1.Amazon_Home_Page;
import z_amazon_source_project_1.Amazon_Manage_Profile_Page;
import z_amazon_source_project_1.Amazon_Sign_In_Page;

public class Test_Case_4_Amazon_Edit_Profile extends Launch_And_Quit
{
@Test
public void Editing_Profile_User()
{
	Amazon_Sign_In_Page a1=new Amazon_Sign_In_Page(driver);
	a1.hoverovertosigninbutton();
	a1.email();
	a1.continuebutton();
	a1.rightpassword();
	a1.clicktosignin();
	
	Amazon_Home_Page a2=new Amazon_Home_Page(driver);
	
	a2.hovertoaccountandlists();
	a2.edit_profile();
	Amazon_Manage_Profile_Page a3=new Amazon_Manage_Profile_Page(driver);
	a3.edityourprofile();
	a3.choosedepartment();
	a3.clicktoaddbutton();
	a3.choosemen();
	a3.savemen();
	//a3.chooseheight();
	a3.chooseage();
}
}
