package Login;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class USer {
	@Given("I want to create an account")
	public void i_want_to_create_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Account creatin");
		
	}

	@When("I enter my data")
	public void i_enter_my_data(io.cucumber.datatable.DataTable dataTable) {
	    
		List<Map<String, String>> list= dataTable.asMaps(String.class,String.class);
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).get("name"));
			System.out.println(list.get(i).get("password"));
		}
	}
}


	
