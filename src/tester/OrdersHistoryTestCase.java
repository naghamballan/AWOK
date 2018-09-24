package tester;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import helper.Helper;
import helper.Locators;

public class OrdersHistoryTestCase {

	public static void test_case_luncher() throws InterruptedException
	{
		Helper.button_click_ui_id(Locators.ui_orders_history);// select my profile
		Helper.sleep();
	
		browsing_orders_history();//start browsing orders
	}
	
	
	
	private static void browsing_orders_history() throws InterruptedException
	{
		List<WebElement> tabs = Helper.get_elements_by_class(Locators.orders_history_tabs_layout,
															 Locators.orders_history_tabs_class_name);
		
		//open cancelled orders
		tabs.get(2).click();
		browse_cancelled_orders();
		
		//open pending orders
//		tabs.get(0).click();
//		browse_pending_orders();
//		
//		//open delivered orders
//		tabs.get(1).click();
//		browse_delivered_orders();
		
		Helper.sleep();
	}

	private static void open_order() throws InterruptedException
	{
		//bring all showed orders
		List<WebElement> orders = Helper.get_elements_by_class(Locators.orders_history_container_layout,
																		Locators.orders_history_order_class_name);
		//open the first  order
		orders.get(0).findElement(By.id("com.awok.store:id/order_number_text_view")).click(); 
		Helper.sleep();
	}
	


	
	private static void browse_pending_orders() throws InterruptedException
	{
		
		open_order();
	
		//try to cancel the pending order
		cancel_pending_order();
		
		Helper.sleep();
		
		Helper.navigate_back();
		
	}

	private static void cancel_pending_order() {
		
		//scroll to cancel button
		Helper.scroll_to_text("CANCEL");
		
		//press the button
		Helper.button_click_id(Locators.order_history_cancel_button);
		
		//cancel page
		
		//select reason type
		Helper.button_click_id(Locators.cancel_order_select_reason_type);//click to open the list and choose reason
		Helper.driver.findElementByName("Order was delayed").click();	//choose the type
		Helper.console_print("reason type is selected");
		
		//enter reason text
		Helper.sendkeys_id(Locators.cancel_order_write_reason, "too much time");
		Helper.hide_keyboard();
		Helper.console_print("reason text is inserted");
		
		//press  submit button
		Helper.button_click_id(Locators.cancel_order_submit_button);
		Helper.console_print("Order cancelled successfully");
		
	}

	
	
	
	private static void browse_cancelled_orders() throws InterruptedException
	{
		scrolling_orders_list();
		Helper.sleep();
		Helper.console_print("Browse all cancelled orders");
		Helper.navigate_back();
	}
	
	private static void scrolling_orders_list()
	{
    
		// Determine the current parameters of the listView. They can vary.
		WebElement listView = Helper.driver.findElement(By.id(Locators.orders_history_container_layout));
	      
		Point listPoint = listView.getLocation();
        Dimension listDim =  listView.getSize();

        int listlGap = (int) (listDim.getHeight() / 5);
        int listlDuration = listDim.getHeight();

        // Then calculate two points of scrolling
        Point pointFrom = new Point(
                (int)(listDim.getWidth() / 2) + listPoint.getX(),
                listDim.getHeight() - listlGap + listPoint.getY());

        Point pointTo = new Point(
                (int)(listDim.getWidth() / 2) + listPoint.getX(),
                listDim.getHeight() - (listlGap * 4) + listPoint.getY());
        
       
		List<WebElement> listItems = null;
        List<WebElement> orders_numbers = new ArrayList<WebElement>();
        
        int j =0;
        
        /*the problem here is just we cannot know when we reach the end  of list
         i put j integer just to identify the number of prders we want to read
         when we read 20 orders, test will be stopped */
        while (j < 20)
        {
        	listItems = listView.findElements(By.className(Locators.orders_history_ordernumber_class_name));
  
            for (WebElement listItem : listItems)
            {
                if(listItem.getAttribute("text").startsWith("#"))
                {

                			listItem.click();
                			Helper.navigate_back();
		                	orders_numbers.add(listItem);
		                	Helper.console_print(listItem.getAttribute("text"));
		                	j++;
                }
                	
            }

            Helper.driver.swipe(
		                            pointFrom.getX(), pointFrom.getY(),
		                            pointTo.getX(), pointTo.getY(),
		                            listlDuration
		            			);
         }
	}



	
	private static void browse_delivered_orders() throws InterruptedException
	{
		open_order();
		add_complaint_for_order();
	}

	private static void add_complaint_for_order() throws InterruptedException 
	{
		//press on add complaint button
		Helper.button_click_id(Locators.order_history_add_complaint_button);
		Helper.sleep();
		
		//address page, press next
		Helper.button_click_id(Locators.add_complaint_address_page_next_button);
		
		//products page, select products to claim against
		select_products_to_add_to_claim();
		
		//add claim reason and images
		add_claim_reason_images_submit();
		
		//track claim after added
		//go to success page and press track claim
	    track_claim_after_add();
	    
	    Helper.sleep();
	    Helper.navigate_back();
		
	}
	
	private static void select_products_to_add_to_claim() throws InterruptedException
	{
		
		//bring all showed products
		List<WebElement> products = Helper.get_elements_by_id(Locators.add_complaint_products_page_product_container,
																		Locators.add_complaint_products_page_select_button);
		//select first product
		products.get(1).findElement(By.id(Locators.add_complaint_products_page_select_text_view)).click(); 
		Helper.sleep();
		
		//select second product
//		products.get(1).findElement(By.id(Locators.add_complaint_products_page_select_text_view)).click(); 
//		Helper.sleep();
		
		//next
		Helper.button_click_id(Locators.add_complaint_products_page_next_button);
	
	}
	
	private static void add_claim_reason_images_submit() throws InterruptedException
	{
		//bring all showed products
		List<WebElement> products = Helper.get_elements_by_class(Locators.add_complaint_claims_page_claimed_products_container,
																		Locators.add_complaint_products_page_product_class_name);
		//select reason type for first product
		products.get(0).findElement(By.id(Locators.add_complaint_claims_page_reason_choose)).click();
		Helper.sleep();
		Helper.driver.findElement(By.name("Warranty Claim")).click();
		Helper.sleep();
		products.get(0).findElement(By.id(Locators.add_complaint_claims_page_reason_text)).sendKeys("No Warranty");
		Helper.hide_keyboard();
		Helper.sleep();
		
		//Helper.sleep();
		
		//second product
		
		//press submit
		Helper.button_click_id(Locators.add_complaint_claims_page_submit_button);
	    Helper.console_print("claim is submitted");
	    Helper.sleep();
	    Helper.sleep();
	    
	}
	
	private static void track_claim_after_add()
	{
		Helper.button_click_id(Locators.add_complaint_success_page_track_claim_button);
		Helper.navigate_back();
	}
}
