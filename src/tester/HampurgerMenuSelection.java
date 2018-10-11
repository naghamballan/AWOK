package tester;

import java.net.MalformedURLException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import helper.Helper;
import helper.Locators;

public class HampurgerMenuSelection{
	
	@Test(priority=0,alwaysRun=true,description="Hamburger menu options")
	public static void test_case_luncher() throws MalformedURLException, InterruptedException
	{
		Helper.app_luncher();
		
		Thread.sleep(5000);
		
		Helper.tutorial_page_done();
		
		Helper.country_language_page();
		
		login_with_valid_credentials();
		
		/*Test Cases calls*/
		Helper.console_print("Profile test case");
		Profile();
		
		Helper.console_print("Addresses test case");
		Addresses();
		
		Helper.console_print("Coupons test case");
		Coupons();
		
		Helper.console_print("Orders test case");
		Orders();
		
		Helper.console_print("Track Order test case");
		Track_Order();
		
		Helper.console_print("Setting test case");
		settings();
		
		Helper.console_print("Term of services test case");
		terms_of_services();

		Helper.console_print("Privacy policy test case");
		privacy_policy();		
		
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
		Thread.sleep(3000);
		
	}

	private static void Profile() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.my_account_section(); //open the my account 
		
		Helper.sleep();
		
		MyProfieTestCase.test_case_luncher();
		Reporter.log("Update profile test case is done", true);
		//Helper.navigate_back();
	}
    
	private static void Addresses() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.my_account_section(); //open the my account 
		
		MyAddressesTestCase.test_case_luncher();
		Helper.sleep();
		Helper.navigate_back();
		
		Reporter.log("Addresses test cases are done", true);
	}

	private static void Orders() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.my_account_section(); //open the my account 
		
		OrdersHistoryTestCase.test_case_luncher();
		Helper.navigate_back();
		
		Reporter.log("Orders test cases are done", true);
	}

    private static void Coupons() throws InterruptedException
    {
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.my_account_section(); //open the my account 
		
		MyCouponsTestCase.test_case_luncher();
		Helper.navigate_back();
		
		Reporter.log("Coupons test cases are done", true);
	}
    
    private static void Track_Order() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		OrdersHistoryTestCase.test_case_luncher();
		Helper.navigate_back();
		
		Reporter.log("All Track Orders test cases are done", true);
	}
	   
	private static void settings() throws InterruptedException
	{
		Helper.sleep();
		Helper.open_Hamburger_menu();//open the hamburger menu
		
		Helper.button_click_ui_id(Locators.ui_settings);// select settings
		Helper.sleep();
		
		Helper.navigate_back();
		Reporter.log("All settings test cases are done", true);
	}
	
	private static void terms_of_services() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		Helper.scroll_to_text2("Terms of Service");
		
		Helper.button_click_ui_id(Locators.ui_terms_of_services);// select terms_of_services
		Helper.sleep();
		Helper.navigate_back();
		Reporter.log("All terms of services test cases are done", true);
	}
	
	private static void privacy_policy() throws InterruptedException
	{
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		Helper.scroll_to_text2("Privacy Policy");
		
		Helper.button_click_ui_id(Locators.ui_privacy_policy);// select privacy_policy
		Helper.sleep();
		Helper.navigate_back();
		Reporter.log("All Privacy Policy test cases are done", true);
	}

	
}
