package tester;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Helper;
import helper.Locators;

public class MyAddressesTestCase {

	public static void test_case_luncher() throws InterruptedException
	{
	
		Helper.button_click_ui_id(Locators.ui_my_addresses);// select my profile
		Helper.sleep();
		
		// add new address
		//add_new_address();
		//Helper.sleep();
		
		// update address
		update_address();
		Helper.sleep();

		// delete address
		//delete_address();
		//Helper.sleep();
		
		// make address primary			
		//make_address_primary();
		//Helper.sleep();
	}
	
	@SuppressWarnings("unused")
	private static void make_address_primary()
	{
		make_address_primary(2);
		Helper.console_print("Address is primary now");
	}
	
	// select address as primary in my addresses page
	public static void make_address_primary(int index)
	{
		WebElement target_address = addressesListItem(index,Locators.address_primary_item); // get the address to make it primary
			
		target_address.click();//mark address as primary
	}
		
	@SuppressWarnings("unused")
	private static void add_new_address() throws InterruptedException {
		
		Helper.button_click_id(Locators.address_add_button);//press add new address button
		Helper.navigate_back();// back to my addresses page and open add new address using + icon
		
		Helper.button_click_id(Locators.address_add_icon); // press add new address icon
		
		//select an Emirate
		Helper.button_click_ui_id(Locators.new_address_ui_emirate);
		Helper.button_click_ui_id(Locators.new_address_data_emirate); 
		Helper.sleep();
		
		//select an area
		Helper.button_click_ui_id(Locators.new_address_ui_area);
		Helper.button_click_ui_id(Locators.new_address_data_area);
		Helper.sleep();
		
		// type address details
		Helper.sendkeys_ui(Locators.new_address_ui_street_flat, "testing 555");// set the street, flat no
		Helper.hide_keyboard();
		Helper.sleep();
		
		//make this address as primary
		Helper.button_click_id(Locators.new_address_defaut_address_check_box); //make address as default
		Helper.sleep();
		
		//save the address
		Helper.button_click_id(Locators.new_address_save_address_button);//save the address
	}
	
	@SuppressWarnings("unused")
	private static void delete_address()
	{
		delete_address_by_x_button(1);
		Helper.console_print("Item is successfully deleted");
	}
	
	// delete address from my addresses page
	public static void delete_address_by_x_button(int index)
		{
			WebElement target_address = addressesListItem(index,Locators.address_remove_item); // get the address to delete
			
			target_address.click();//delete the address
		}
			
	private static void update_address() throws InterruptedException
	{
		//open the address that u want to update
		select_address_to_update(2);
		
		// this method is not compatible with this java version so now we can not use it 
		//edit_address_details();
		Helper.sleep();
	
		// save the changes
		Helper.button_click_id(Locators.new_address_save_address_button);//save the address
		
	}
	//editing action: but crashing, not working
	public static void edit_address_details() throws InterruptedException
	{
		WebElement target_item = edit_address_Items(2);
		
		Helper.console_print("value is returned");
		Helper.sleep();	
		
		target_item.click();
		Helper.console_print("clicked");
		Helper.sleep();
		
		target_item.clear();
		Helper.console_print("cleared");
		
	    target_item.sendKeys(new String[]{"0523341123"});
	    Helper.sleep();
	    Helper.console_print("edit address details successfully");
	}

	//select address to update
	public static void select_address_to_update(int index)
	{
		WebElement target_address = addressesListItem(index,Locators.address_list_item); // get the address to update it
		target_address.click();//the address details page is opened now
	}
		
	// get target element for the target address
	public static WebElement addressesListItem(int index, String type_of_element)
	{
		// get all wanted elements in the view
		List<WebElement> elements =   
						Helper.get_elements_by_id(Locators.address_list_of_addresses,type_of_element); 
//			List<WebElement> elements = Helper.driver.findElementById(Locators.address_list_of_addresses).
//							findElements(By.id(type_of_element)); // get all wanted elements in the view
//			
		return elements.get(index); // return the element for the index
	}
	
	//get elements of edit address page
	public static WebElement edit_address_Items(int index) throws InterruptedException
	{
		// get all wanted elements in the view
		List<WebElement> elements =   
				Helper.get_elements_by_id(Locators.edit_address_layout, Locators.edit_address_edit_text); 
		//Helper.driver.findElementById(Locators.edit_address_layout).
		//findElements(By.id(Locators.edit_address_edit_text));
		int size = 0;
		int j = 0;
		
		List<WebElement> enabled_elements = new ArrayList<WebElement>();
		size += elements.size();
		
		for(int i=0; i<size; i++){
			//console_print(elements.get(i).getText());
			if(elements.get(i).isEnabled()){
				enabled_elements.add(j,elements.get(i));
				Helper.console_print(enabled_elements.get(j).getText());
				j++;
			}
		}
	
		Helper.console_print("value will be returned");
		return enabled_elements.get(index); // 0 for emirate, 1 for area, 2 for details
	}
}
