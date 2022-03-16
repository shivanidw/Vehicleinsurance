package Steps;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Productdata {

	@Given("We have filled insurant data and click on next")
	public void we_have_filled_insurant_data_and_click_on_next() {
		System.out.println("Step 1: CLick on Next button on Enter Insurant data page ");
	}
	@When("I Click on the Next button of insurant page")
	public void i_click_on_the_next_button_of_insurant_page() {
		System.out.println("Step 2: I am on Enter Product Data page ");
	}
	@Then("Navigate to enter product data page and provide following Details")
	public void navigate_to_enter_product_data_page_and_provide_following_details(io.cucumber.datatable.DataTable table) {
	   
		System.out.println("Step 3: Provide Following Details");
        Map<String, String> data =  table.asMap(String.class,String.class);
for (String key : data.keySet()) {
	
	System.out.println(String.format("   %s  : %s", key, data.get(key)));
 
}
	}

}
