package tester;

import java.net.MalformedURLException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import helper.Helper;
import helper.Locators;

public class Hamburger_menu_selection{
	
	@Test(priority=0,description="Hamburger menu options")
	public static void test_case_luncher() throws MalformedURLException, InterruptedException
	{
		Helper.app_luncher();
		
		Thread.sleep(5000);
		
		Helper.tutorial_page_done();
		
		Helper.country_language_page();
		
		login_with_valid_credentials();
		
		/*Test Cases calls*/
		Helper.console_print("My profile test case");
		//my_profile();
		
		Helper.console_print("My address test case");
		//my_addresses();
		
		Helper.console_print("Order History test case");
		//OrdersHistory();
		
		Helper.console_print("My Coupons test case");
		myCoupons();
		
		Helper.console_print("Setting test case");
		settings();
		
		Helper.console_print("Term of services test case");
		terms_of_services();
		
		Helper.console_print("Customer Support test case");
		customer_support();
		
		Helper.console_print("Privacy policy test case");
		privacy_policy();
		
		Helper.console_print("About Us test case");
		about_us();
		
	}

	private static void login_with_valid_credentials() throws InterruptedException 
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		Helper.button_click_id(Locators.signin_text);// click on sign up text field
		Helper.sleep();
		
		String username="themetest@awok.co";
		String password="123456";
		
		Helper.sendkeys_id(Locators.login_email_text, username); // enter user name
		Helper.sendkeys_id(Locators.login_password, password); // enter password
		//Helper.hide_keyboard(); //hide keyboard
		Helper.sleep();
		Helper.button_click_id(Locators.login_button); // press login button
		Helper.sleep();
		//Helper.dismiss_alert(); // press no on system alert dialog
		Helper.sleep();
		Helper.console_print("login with valid credentials");
	}

/*	private static void my_profile() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		MyProfieTestCase.test_case_luncher();
		Reporter.log("Update profile test case is done", true);
		//Helper.navigate_back();
	}*/
    
/*	private static void my_addresses() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		MyAddressesTestCase.test_case_luncher();
		Helper.sleep();
		Helper.navigate_back();
		Reporter.log("All My Addresses test cases are done", true);
	}*/

	/*private static void OrdersHistory() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		OrdersHistoryTestCase.test_case_luncher();
		Helper.navigate_back();
		Reporter.log("All Orders History test cases are done", true);
	}
*/
    private static void myCoupons() throws InterruptedException
    {
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
	
		MyCouponsTestCase.test_case_luncher();
		Helper.navigate_back();
		Reporter.log("All My Coupons test cases are done", true);
	}
	   
	private static void customer_support() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.button_click_ui_id(Locators.ui_customer_support);// select customer support
		Helper.sleep();
		Helper.navigate_back();
		Reporter.log("All cutomer support test cases are done", true);
	}
	
	private static void settings() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		
		Helper.scroll_to_text2("Settings");
		
		Helper.button_click_ui_id(Locators.ui_settings);// select settings
		Helper.sleep();
		
		Helper.navigate_back();
		Reporter.log("All settings test cases are done", true);
	}
	
	private static void terms_of_services() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.button_click_ui_id(Locators.ui_terms_of_services);// select terms_of_services
		Helper.sleep();
		Helper.navigate_back();
		Reporter.log("All terms of services test cases are done", true);
	}
	
	private static void about_us() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();

		Helper.button_click_ui_id(Locators.ui_About_us);// select about_us
		Helper.sleep();
		Helper.navigate_back();
		Reporter.log("All About US test cases are done", true);
	}
	
	private static void privacy_policy() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.button_click_ui_id(Locators.ui_privacy_policy);// select privacy_policy
		Helper.sleep();
		Helper.navigate_back();
		Reporter.log("All Privacy Policy test cases are done", true);
	}

	
}
