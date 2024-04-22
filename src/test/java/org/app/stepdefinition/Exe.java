package org.app.stepdefinition;

import java.util.List;
import java.util.Map;

import org.app.pageexe.Pageexe;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Exe extends Pageexe{
	@Given("Open the webpage {string}")
	public void open_the_webpage(String url) {
	    browserlaunch(url);
	}
	@When("Enter the below details")
	public void enter_the_below_details(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>>lm=dataTable.asMaps(); 
		String first =lm.get(0).get("firstname");
		firstname(first);
		String last =lm.get(0).get("lastname");
		lastname(last);
		String num =lm.get(0).get("phoneumber");
		phonenumber(num);
		String id =lm.get(0).get("mailID");
		mailid(id);
		String ad =lm.get(0).get("address");
		address(ad);
		String sub =lm.get(0).get("Subject");
		subject(sub);
	}
	@When("Click the gender")
	public void click_the_gender() {
	    gender();
	}

	@When("click the hobbie")
	public void click_the_hobbie() {
	    hobbies();
	}
	
	@When("enter the month {string} and year {string}")
	public void enter_the_month_and_year_and_date(String month, String year) {
	    month(month,year);
	}
	@When("select the state")
	public void select_the_state() {
		state();
	}
	@When("select the city")
	public void select_the_city() {
	    city();
	}
	
	@When("upload a picture {string}")
	public void upload_a_picture(String pic) {
	   picture(pic);
	}
	@When("click submit button")
	public void click_submit_button() {
	   submit();
	}

	@Then("Validation done")
	public void validation_done() {
	   System.out.println("done");
	}


}
