package stepdef;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import com.mongodb.DBObject;
import com.mongodb.util.JSON;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CurrencyCloudTechTest {

	

	URL url;
	String loginValue = "s.goodland@hotmail.co.uk";
	String apiValue = "ba9997230669a6d7a31a27a82bbbd31b8148ae4e7bd45928817079f34a86cbe4";
	String charset = "UTF-8";
	Map<String, String> loginDetails = new HashMap<>();

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
		loginDetails.put("login_id", loginValue);
		loginDetails.put("api_key", apiValue);
		
		// Starts the POST
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "multipart/form-data");

		//con.setUseCaches(false);
		con.setDoOutput(true);

		
		// Sends request
		try (DataOutputStream output = new DataOutputStream(con.getOutputStream())) {
			String parameters = String.format("login_id=%s&api_key=%s", loginDetails.get("login_id"), loginDetails.get("api_key"));
			output.write(parameters.getBytes(StandardCharsets.UTF_8));
		}
		String x = loginDetails.get("login_id");
		String y = loginDetails.get("api_key");
		System.out.println(x);
		System.out.println(y);
		System.out.println(loginValue);
		System.out.println(apiValue);
		
		

		// Get response
		try (DataInputStream response = new DataInputStream(con.getInputStream())) {
			System.out.println(response);
			System.out.println("Step 2 passed");
		} catch(IOException e) {
			BufferedReader response = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			String line;
			String result = "";
			while((line = response.readLine()) != null) {
				result += line;
			}
			DBObject object = (DBObject) JSON.parse(result);
			System.out.println(object);
			response.close();
		}
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

		// con.setRequestProperty("X-Auth-Token", "application/json");
		// String contentType = con.getHeaderField("X-Auth-Token");
	}

}
