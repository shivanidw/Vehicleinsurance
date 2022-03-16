package Steps;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Insurantdata {

	
	@Given("We have filled Vehicle data and click on next")
	public void we_have_filled_vehicle_data_and_click_on_next() {
		  System.out.println("Step 1: CLick on Next button on Enter Vehicle data page ");
	}

	@When("I Click on the Next button")
	public void i_click_on_the_next_button() {
		System.out.println("Step 2: I am on Enter Insurant Data page ");
	}

	@Then("Navigate to enter Insurant data page and provide following Details")
	public void navigate_to_enter_insurant_data_page_and_provide_following_details(io.cucumber.datatable.DataTable table) {
	    
		System.out.println("Step 3: Provide Following Details");
        Map<String, String> data =  table.asMap(String.class,String.class);
for (String key : data.keySet()) {
	
	System.out.println(String.format("   %s  : %s", key, data.get(key)));
 
}
	}

}
