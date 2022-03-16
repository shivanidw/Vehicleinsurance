package Steps;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendQuote {

	@Given("We have selected Price Option and click on send Quote button")
	public void we_have_selected_price_option_and_click_on_send_quote_button() {
		System.out.println("Step 1: CLick on send Quote button on Price Option page ");
	}

	@When("I Click on the send Quote button")
	public void i_click_on_the_send_quote_button() {
		System.out.println("Step 2: I am on Send Quote page ");
	}

	@Then("Navigate to send quote page and need to provide following Details and click send email")
	public void navigate_to_send_quote_page_and_need_to_provide_following_details_and_click_send_email
	(io.cucumber.datatable.DataTable table) {
		System.out.println("Step 3: Fill the User details and click on Send Email");
        Map<String, String> data =  table.asMap(String.class,String.class);
for (String key : data.keySet()) {
	
	System.out.println(String.format("   %s  : %s", key, data.get(key)));
 
}
	}
}
