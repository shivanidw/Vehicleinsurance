package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Vehicledata {

	@Given("We have Site available {string}")
	public void we_have_site_available(String string) {
	   System.out.println("Step 1: I Have URL of Vehicle Insurance ");
	   
	}

	@When("I Click on the URL")
	public void i_click_on_the_url() {
		 System.out.println("Step 2: I am on Enter Vehicle Data page ");
	}

	@Then("Navigate to enter vehicle data page and provide following Details")
	public void navigate_to_enter_vehicle_data_page_and_provide_following_details(DataTable table) throws Throwable{
	/*{
		List<List<String>> data = table.asLists();
		for (List<String> str : data) {
			for (String str1 :str) {
				System.out.println("Data : " + str1);
			}
		}*/
		System.out.println("Step 3: Provide Following Details");
	          Map<String, String> data =  table.asMap(String.class,String.class);
	for (String key : data.keySet()) {
		
		System.out.println(String.format("   %s  : %s", key, data.get(key)));
	   
	}
}}
