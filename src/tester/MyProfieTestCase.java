package tester;

import helper.Helper;
import helper.Locators;

public class MyProfieTestCase {

	public static void test_case_luncher() throws InterruptedException
	{
		Helper.button_click_ui_id(Locators.ui_my_profile);// select my profile
		Helper.sleep();
		
		my_profile_edit(); // start editing
	}
	
	private static void my_profile_edit()throws InterruptedException
	{
		String name="Nagham";
		String new_password="122112";
		String retype_new_password="122112";
		String result;
		
		Helper.sendkeys_id(Locators.profile_name, name);  // update name
		Helper.sleep();
		
		Helper.sendkeys_id(Locators.profile_new_password, new_password);  //update password
		Helper.sleep();
		
		Helper.sendkeys_id(Locators.profile_retype_new_password, retype_new_password); // retype password
		Helper.sleep();
		Helper.hide_keyboard();
		Helper.sleep();
		
		Helper.button_click_id(Locators.profile_update_profile_button);//submit
		Helper.sleep();
		
		result = Helper.text_print_id(Locators.sucess_text);
		Helper.sleep();
		Helper.button_click_id(Locators.sucess_ok_button);
		Helper.sleep();
		
		Helper.console_print(result);
		Helper.console_print("Update password in my profile test case is passed");
	}
}
