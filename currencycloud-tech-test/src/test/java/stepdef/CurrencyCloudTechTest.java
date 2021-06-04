package stepdef;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.runtime.snippets.Concatenator;
import cucumber.api.java.en.Then;

public class CurrencyCloudTechTest {
	
	
	
	
	//parameters.put("s.goodland@hotmail.co.uk", "1257b7f731c5bd4e8cda2de05279415da5ee90855d230db37624c3350fe10462");

	URL url;
	String login_value = "s.goodland@hotmail.co.uk";
	String api_value = "ba9997230669a6d7a31a27a82bbbd31b8148ae4e7bd45928817079f34a86cbe4";
	String charset = "UTF-8";
	Map<String, String> login = new HashMap<>();
    Map<String, String> api = new HashMap<>();
    
    
    
   
	
    
	@Given("^the correct web address$")
	public void the_correct_web_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		url = new URL("https://devapi.currencycloud.com/v2/authenticate/api");
		System.out.println("Step 1 passed");
	}

	@When("^I submit a Login ID and API key$")
	public void i_submit_a_Login_ID_and_API_key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		//Starts the POST
		con.setRequestMethod("POST");	
		con.setRequestProperty("Content-Type", 
	            "application/x-www-form-urlencoded");
		
	    con.setRequestProperty("Content-Language", "en-US");
	    
	    con.setUseCaches(false);
	    con.setDoOutput(true);

	    // Sends request
	    DataOutputStream output = new DataOutputStream (
	            con.getOutputStream());
	        
	        output.close();
	        
		// Get response 
	     
	    
	   // login.put("login_id", login_value);
	   // api.put("api_key", api_value);
	    
	    InputStream response = con.getInputStream();
	    System.out.println(response);
		System.out.println("Step 2 passed");

	    
	    
		
	}

	@Then("^I will be returned an authentication token\\.$")
	public void i_will_be_returned_an_authentication_token() throws Throwable {
		System.out.println("Test4");

	    
	    
	    
	}

	@Given("^A successful login authentication$")
	public void a_successful_login_authentication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I create a quote for selling GBP and buying USD with the sell side$")
	public void i_create_a_quote_for_selling_GBP_and_buying_USD_with_the_sell_side() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^I can verify the buy amount is correct to the rate$")
	public void i_can_verify_the_buy_amount_is_correct_to_the_rate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Given("^a successful login authentication$")
	public void another_successful_login_authentication() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("^I create a new quote for selling GBP and buying USD with the sell side$")
	public void i_create_a_new_quote_for_selling_GBP_and_buying_USD_with_the_sell_side() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@Then("^I can verify the buy amount does not match the rate and end the API session$")
	public void i_can_verify_the_buy_amount_does_not_match_the_rate_and_end_the_API_session() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		
		//con.setRequestProperty("X-Auth-Token", "application/json");
		//String contentType = con.getHeaderField("X-Auth-Token");
	}
	
}
