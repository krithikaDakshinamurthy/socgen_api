package com.api.stepdefinition;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.json.JSONObject;
import org.junit.Assert;

import com.api.utils.TestContext;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matcher.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

public class CreateUserStepdefinition {

	private TestContext context;
	private static final Logger LOG = LogManager.getLogger(CreateUserStepdefinition.class);
	
	public CreateUserStepdefinition(TestContext context) {
		this.context = context;
	}


	@Given("user has access to endpoint {string}")
	public void userHasAccessToEndpoint(String endpoint) {
		context.session.put("endpoint", endpoint);
	}

	@When("Pet store user detail is created using POST request")
	public void Create_user_details_using_POST_request(DataTable dataTable) {

		Map<String, String> createUserData = dataTable.asMaps().get(0);
		JSONObject creatingUser = new JSONObject();
		creatingUser.put("id", createUserData.get("id"));
		creatingUser.put("username", createUserData.get("username"));
		creatingUser.put("firstname", createUserData.get("firstname"));
		creatingUser.put("lastname", createUserData.get("lastname"));
		creatingUser.put("email", createUserData.get("email"));
		creatingUser.put("password", createUserData.get("password"));
		creatingUser.put("phone", createUserData.get("phone"));
		creatingUser.put("userStatus", createUserData.get("userStatus"));

		given().contentType("application/json").body(creatingUser.toString()).when()
				.post("https://petstore.swagger.io/v2/user").then().assertThat().statusCode(200)
				.body("id", equalTo("10")).body("username", equalTo("NewCusotmer")).body("firstname", equalTo("New"))
				.body("lastname", equalTo("Customer")).body("email", equalTo("NewCustomer@gmail.com"))
				.body("password", equalTo("password")).body("phone", equalTo("phone")).body("userStatus", equalTo("0"))
				.log().all().extract().response().asString();

	}

	@Then("user details is validated using GET request")
	public void Then_userdetails_is_validated_using_GET_request() {

		given().contentType("application/json").when().get("https://petstore.swagger.io/v2/user/NewCustomer").then()
				.assertThat().statusCode(200).body("username", equalTo("NewCustomer")).log().all();

	}

	@And("Updated the user name of the pest store using PUT request")
	public void Updated_the_user_name_of_the_pest_store_using_PUT_request() {
		HashMap<String, String> updateUser = new HashMap<String, String>();
//		JSONObject updateUser = new JSONObject();
		updateUser.put("id", "10");
		updateUser.put("username", "UpdatedNewCustomer");
		updateUser.put("firstname", "UpdatedNew");
		updateUser.put("lastname", "Customer");
		updateUser.put("email", "updatedNewCustomer");
		updateUser.put("password", "password");
		updateUser.put("phone", "phone");
		updateUser.put("userStatus", "0");

		given().contentType("application/json").when().put("https://petstore.swagger.io/v2/user/UpdatedNewCustomer")
				.then().assertThat().statusCode(200).body("username", equalTo("NewCustomer")).log().all();

	}
	
	@When("user placed a new order for a pet using POST request")
	public void user_placed_a_new_order_for_a_pet_using_POST_request(DataTable dataTable) {

		Map<String, String> placeNewOrder = dataTable.asMaps().get(0);
		JSONObject newOrder = new JSONObject();
		newOrder.put("id", Integer.valueOf(placeNewOrder.get("id")));
		newOrder.put("petid", Integer.valueOf(placeNewOrder.get("petid")));
		newOrder.put("quantity", Integer.valueOf(placeNewOrder.get("quantity")));
		newOrder.put("shipdate", placeNewOrder.get("lastname"));
		newOrder.put("status", placeNewOrder.get("status"));
		newOrder.put("completed", placeNewOrder.get("completed"));
	

		given().contentType("application/json").body(newOrder.toString()).when()
				.post("https://petstore.swagger.io/v2/store/order").then().assertThat().statusCode(200)
				.body("id", equalTo("10")).
				body("petid", equalTo("10")).body("quantity", equalTo("10"))
				.body("shipdate", equalTo("2025-28-04")).body("status", equalTo("placed"))
				.body("completed", equalTo("true"))
				.log().all().extract().response().asString();

	}
	
	@Then("get the order details and validate the order id using GET request")
	public void get_the_order_details_and_validate_the_order_id_using_GET_request() {

		given().contentType("application/json").when().get("https://petstore.swagger.io/v2/store/order/10").then()
				.assertThat().statusCode(200).body("petId", equalTo("1234")).log().all();

	}
	
	@And("delete the placed order using DELETE request")
	public void delete_the_placed_order_using_DELETE_request() {

		given().contentType("application/json").when().delete("https://petstore.swagger.io/v2/store/order/10").then()
				.assertThat().statusCode(200).log().all();

	}
	
	@Then("get the order details of the deleted order id using GET request")
	public void get_the_order_details_of_the_deleted_order_id_using_GET_request() {

		given().contentType("application/json").when().get("https://petstore.swagger.io/v2/store/order/10").then()
		.assertThat().statusCode(200).body("petId", equalTo("1234")).log().all();

	}
	
	
}
