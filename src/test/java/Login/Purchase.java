package Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Purchase {
	// public static WebDriver driver;

	@When("I enter usernmae")
	public void i_enter_usernmae() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I enter password")
	public void i_enter_password() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("Home page is appeared")
	public void home_page_is_appeared() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I click on logoutButton")
	public void i_click_on_logoutButton() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I Navigate to {string}")
	public void i_Navigate_to(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}

	@When("I Go to All {string}")
	public void i_Go_to_All_Categories(String x) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(x);
	}

	@When("I Navigate to Electronics")
	public void i_Navigate_to_Electronics() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Electronics");
	}

	@When("Click on HeadPhones and Add to Cart")
	public void click_on_HeadPhones_and_Add_to_Cart() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Cart");
	}

	@Then("the payment page is appeared")
	public void the_payment_page_is_appeared() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("payment");
	}

	@Given("User enters the url")
	public void user_enters_the_url() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}

	@Given("enters{string} and{string}")
	public void enters_and(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		
	}

	@When("He clicks on login button")
	public void he_clicks_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}

	@Then("Home is displayed")
	public void home_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
	}
}
