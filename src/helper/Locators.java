package helper;

public class Locators {

	// tutorial page strings
	public static String id_tutorial_next_button="com.awok.store:id/next";
	public static String id_tutorial_done_button="com.awok.store:id/done";
	
	// country/language page strings
	public static String ui_select_English="new UiSelector().text(\"English\")";
	public static String ui_select_Arabic="new UiSelector().text(\"«·⁄—»Ì…\")";
	public static String ui_select_UAE="new UiSelector().text(\"United Arab Emirates\")";
	public static String done_language_country_selection = "com.awok.store:id/locale_done_button";
	
	// Hamburger menu string
	public static String class_menu= "android.widget.ImageButton";
	public static String ui_logout= "new UiSelector().text(\"Logout\")";
	public static String logout_button= "com.awok.store:id/logoutButton";
	public static String signup_text= "com.awok.store:id/signupTxt";
	public static String signin_text= "com.awok.store:id/nameTxt";
	public static String ui_shopping_cart= "new UiSelector().text(\"Shopping Cart\")";
	public static String ui_my_profile= "new UiSelector().text(\"Profile\")";
	public static String ui_my_addresses= "new UiSelector().text(\"Addresses\")";
	public static String ui_my_coupons= "new UiSelector().text(\"Coupons\")";
	public static String ui_orders_history= "new UiSelector().text(\"Orders\")";
	public static String ui_customer_support= "new UiSelector().text(\"Customer Support\")";
	public static String ui_About_us= "new UiSelector().text(\"About Us\")";
	public static String ui_privacy_policy="new UiSelector().text(\"Privacy Policy\")";
	public static String ui_settings="new UiSelector().text(\"Settings\")";
	public static String ui_terms_of_services="new UiSelector().text(\"Terms of Service\")";
	public static String my_account="new UiSelector().text(\"My Account\")";
	
	// Register page strings
	public static String  reg_user_name ="com.awok.store:id/regPhoneNumberEditText";
	public static String  reg_password ="com.awok.store:id/regPasswordEditText";
	public static String  reg_confirm_password ="com.awok.store:id/regConfirmPasswordEditText";
	public static String  reg_check_terms ="com.awok.store:id/chk_terms";
	public static String  reg_register_button ="com.awok.store:id/registerButton";
	public static String  reg_already_have_account_test_button ="com.awok.store:id/acc";
	public static String  reg_Facebook ="com.awok.store:id/regFBButton";
	
	
	// login page strings
	public static String forget_pass_login_button ="com.awok.store:id/loginButton";
	public static String login_button ="com.awok.store:id/nextButton";
	public static String login_password="com.awok.store:id/passwordEditTextMain";
	public static String login_forget_password="com.awok.store:id/forgotPass";
	public static String login_email_text="com.awok.store:id/emailEditText";
	public static String login_forget_password_mail_text="com.awok.store:id/passwordEditText";
	public static String login_Facebook="com.awok.store:id/fbButton";
	public static String login_signup="com.awok.store:id/sign_up";
	public static String login_back="com.awok.store:id/skipButton";
	
	// error alert
	public static String  error_text ="com.awok.store:id/error_txt";
	public static String  error_ok_button ="com.awok.store:id/ok";
	
	// success alert
	public static String  sucess_text ="com.awok.store:id/error_head";
	public static String  sucess_ok_button ="com.awok.store:id/ok";
	
	//system alert yes/ no
	public static String alert_yes= "android:id/button1";
	public static String alert_no= "android:id/button2";
	
	
	// my profile page strings
	public static String profile_name= "com.awok.store:id/input_name";
	public static String profile_new_password= "com.awok.store:id/new_password";
	public static String profile_retype_new_password= "com.awok.store:id/retype_password";
	public static String profile_update_profile_button= "com.awok.store:id/button_pwd";
	
	// my addresses page stings
	public static String address_add_icon= "com.awok.store:id/add_shipping_address";
	public static String address_delete_icon= "com.awok.store:id/delete_shipping_address";
	public static String address_primary_item= "com.awok.store:id/make_primary";
	public static String address_list_of_addresses= "com.awok.store:id/recyclerAddress";
	public static String address_remove_item= "com.awok.store:id/removeAddressButton";
	public static String address_add_button= "com.awok.store:id/buttonAdd";
	public static String address_back_button = "android.widget.ImageButton";
	public static String address_remove_xpath_item = "//android.widget.RelativeLayout[@bounds='[899,322][965,388]']";
	public static String address_list_item= "com.awok.store:id/mainAddressListLay"; 
	
	// add new address page Strings
	public static String new_address_ui_country="";
	
	public static String new_address_ui_emirate="new UiSelector().text(\"Emirate *\")";
	public static String new_address_data_emirate="new UiSelector().text(\"Abu Dhabi\")";
	
	public static String new_address_ui_area="new UiSelector().text(\"Area *\")";
	public static String new_address_data_area="new UiSelector().text(\"Al Bahia\")";
	
	public static String new_address_ui_street_flat="new UiSelector().text(\"Street, Apt No, Floor No. Villa No. etc *\")";
	
	public static String new_address_xpath_first_phone_number="//android.widget.RelativeLayout[@bounds='[166,1197][1080,1338]']";
	public static String new_address_xpath_second_phone_number="//android.widget.RelativeLayout[@bounds='[166,1338][1080,1479]']";
	
	public static String new_address_defaut_address_check_box="com.awok.store:id/dynamic_checkbox";
	
	public static String new_address_save_address_button="com.awok.store:id/button_save_address";
	
	// edit address page Strings
	public static String edit_address_layout= "com.awok.store:id/layoutOuter";
	public static String edit_address_edit_text= "com.awok.store:id/dynamic_textview";
	
	//orders history page Strings
	public static String orders_history_tabs_layout= "com.awok.store:id/orders_list_tab_layout";
	public static String orders_history_tabs_class_name= "android.support.v7.app.ActionBar$Tab";
	
	public static String orders_history_container_layout= "com.awok.store:id/orders_recycler";
	public static String orders_history_order_class_name= "android.widget.FrameLayout";
	public static String orders_history_ordernumber_class_name= "android.widget.TextView";
	
	//pending orders
	public static String order_history_cancel_button= "com.awok.store:id/cancel_order_linear_layout";
	public static String orders_history_cancel_textview_class_name= "android.widget.TextView";
	
	//delivered orders
	public static String order_history_add_complaint_button = "com.awok.store:id/button_2";
	public static String order_history_complaint_list_button = "com.awok.store:id/button_1";
	
	//cancel order page strings
	public static String cancel_order_select_reason_type= "com.awok.store:id/select_reason_layout";
	public static String cancel_order_write_reason= "com.awok.store:id/add_reason_edit_text";
	public static String cancel_order_submit_button= "com.awok.store:id/submit_button";
	public static String cancel_order_cancel_button= "com.awok.store:id/cancel_button";
	
	//ADD Claim For order Steps Strings
	public static String add_complaint_address_page_next_button = "com.awok.store:id/complain_step_one_btn";
	public static String add_complaint_products_page_next_button = "com.awok.store:id/complaint_step_two_btn";
	public static String add_complaint_products_page_product_container = "com.awok.store:id/complaint_view_two_products_recycler";
	public static String add_complaint_products_page_product_class_name = "android.widget.LinearLayout";
	public static String add_complaint_products_page_select_text_view = "com.awok.store:id/select_text_view";
	
	public static String add_complaint_products_page_select_button = "com.awok.store:id/select_layout";
	public static String add_complaint_products_page_quantity_choose = "com.awok.store:id/quantity_layout";
	
	public static String add_complaint_claims_page_claimed_products_container = "com.awok.store:id/complaint_view_three_products_recycler";
	public static String add_complaint_claims_page_claimed_products_class_name = "android.widget.LinearLayout";
	
	public static String add_complaint_claims_page_reason_choose = "com.awok.store:id/select_reason_layout";
	public static String add_complaint_claims_page_reason_text = "com.awok.store:id/add_reason_edit_text";
	public static String add_complaint_claims_upload_image_layout = "com.awok.store:id/upload_images_layout";
	public static String add_complaint_claims_page_submit_button = "com.awok.store:id/complaint_step_three_btn";
	public static String add_complaint_success_page_track_claim_button = "com.awok.store:id/complaint_step_four_btn";
	
	// My Coupon Page Strings
	public static String my_coupons_coupon_code = "com.awok.store:id/coupon_code_text_view";
	public static String my_coupons_coupon_amount = "com.awok.store:id/coupon_amount_text_view";
	public static String my_coupons_apply_coupon = "com.awok.store:id/coupon_apply_btn";
	public static String my_coupons_coupons_container = "com.awok.store:id/coupons_recycler";
	public static String my_coupons_coupon_class_name = "android.widget.LinearLayout";
	
	//Shopping Cart Page String
	public static String shopping_cart_coupon_code ="com.awok.store:id/coupon_txt";
	public static String shopping_cart_coupon_discount_amount ="com.awok.store:id/discount_applied_text_view";
	public static String shopping_cart_remove_applied_coupon_button ="com.awok.store:id/remove_coupon_btn";
	
	// Home Page Strings
	public static String home_page_cart_icon ="com.awok.store:id/app_cart";
}
