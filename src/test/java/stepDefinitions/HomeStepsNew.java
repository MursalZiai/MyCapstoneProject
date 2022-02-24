package stepDefinitions;


import java.io.IOException;
import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomeNew;
import io.cucumber.java.en.Given;
	
	
	public class HomeStepsNew extends Base {

		HomeNew home = new HomeNew();
		
		@Given("User is on Retail website")
		public void user_is_on_retail_website() throws IOException {
			home.homePageValidate();
			logger.info("Retail page validate successfully!");  
		}

		@When("User click on Currency")
		public void user_click_on_currency() {
			
			home.clickOnCurrencyButton();
			logger.info("User click on currency button successfully");

		}

		@When("User Chose Euro from dropdown")
		public void user_chose_euro_from_dropdown() {
			home.clickOnEuro();
			logger.info("User chose Euro successfully from dropdown");
		}

		@Then("currency value should change to Euro")
		public void currency_value_should_change_to_euro() throws IOException {
			home.verifyEuro();
			logger.info("Euro sign successfuly verifed");

		}

		@When("User click on shopping cart")
		public void user_click_on_shopping_cart() {
			home.clickOnshoppingcart();
			logger.info("User click on shopping cart succesfully");

		}

		@Then("“Your shopping cart is empty!” message should display")
		public void your_shopping_cart_is_empty_message_should_display() throws IOException {
			home.displyEmptyShoppingCartMessage();
			logger.info("Shopping empty message displyed successfully");

		}
	}


