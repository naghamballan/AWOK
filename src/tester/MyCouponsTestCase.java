package tester;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Helper;
import helper.Locators;

public class MyCouponsTestCase {

	public static void test_case_luncher() throws InterruptedException
	{
		Helper.button_click_ui_id(Locators.ui_my_coupons);// select shopping cart
		Helper.sleep();
		
		apply_coupon(); // select coupon and apply it 	
		
	}

	private static void apply_coupon() throws InterruptedException 
	{
		String coupon_code, coupon_amount;
		
		// get all showed coupons
		List<WebElement> coupons = Helper.get_elements_by_class(Locators.my_coupons_coupons_container,
				 Locators.my_coupons_coupon_class_name);

		// select the first coupon to apply
		coupons.get(0).findElement(By.id(Locators.my_coupons_apply_coupon)).click();
		
		//save first coupon code
		coupon_code = coupons.get(0).findElement(By.id(Locators.my_coupons_coupon_code)).getText();
		Helper.console_print(coupon_code);
		
		//save first coupon amount
		coupon_amount = coupons.get(0).findElement(By.id(Locators.my_coupons_coupon_amount)).getText();
		Helper.console_print(coupon_amount);
		
		Helper.sleep();
		Helper.navigate_back();
		
		// go to shopping cart page and check if coupon is applied correctly
		check_coupon_in_cart_page(coupon_code,coupon_amount);
		
	}

	private static void check_coupon_in_cart_page(String coupon_code, String coupon_amount) throws InterruptedException 
	{
		//open cart using hamburger menu
		coupon_amount = "-  " + coupon_amount;
		Helper.console_print(coupon_amount);
		
		Helper.open_Hamburger_menu();//open the hamburger menu
		Helper.sleep();
		
		Helper.button_click_ui_id(Locators.ui_shopping_cart);// select shopping cart
		Helper.sleep();
		
		//go to coupon 
		Helper.scroll_to_text("Coupon");
		
		//get the coupon code and coupon value
		String cart_coupon_code, cart_coupon_amount;
		cart_coupon_code = Helper.text_print_id(Locators.shopping_cart_coupon_code);
		cart_coupon_amount = Helper.text_print_id(Locators.shopping_cart_coupon_discount_amount);
		
		Helper.console_print(cart_coupon_amount);
		Helper.console_print(cart_coupon_code);
		
		// compare values, print result
		if (coupon_code.compareTo(cart_coupon_code) == 0)
			if(coupon_amount.compareTo(coupon_amount)==0)
				Helper.console_print("Coupon is applied correctly");
			else
				Helper.console_print("Coupon code is the same but amount is different");
		else
			Helper.console_print("wrong values");
	
		Helper.sleep();
		
		//remove the coupon
		Helper.button_click_id(Locators.shopping_cart_remove_applied_coupon_button);
		Helper.sleep();
		Helper.sleep();
		
		Helper.console_print("My Coupons Test case end Successfully");
	}

}
