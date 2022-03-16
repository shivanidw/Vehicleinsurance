package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Priceoption {

	
	@Given("We have filled Product data and click on next")
	public void we_have_filled_product_data_and_click_on_next() {
		System.out.println("Step 1: Click on Next button on Enter Product data page ");
	}

	@When("I Click on the Next button of Product page")
	public void i_click_on_the_next_button_of_product_page() {
		System.out.println("Step 2: I am on Select Price Option page ");
	}

	@Then("Navigate to enter Option page and select {string} as Price Option")
	public void navigate_to_enter_option_page_and_select_as_price_option(String PriceOption) {
		System.out.println("Step 3: Navigate to enter Option page and select Option as : "+ PriceOption +"");
	}
}
