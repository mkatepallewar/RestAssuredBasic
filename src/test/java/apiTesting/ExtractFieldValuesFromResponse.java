package apiTesting;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class ExtractFieldValuesFromResponse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response response=  given().auth().basic("sk_test_3CtsRvSgzv8f0sf5PZghJcOK00PHHjhqAe", "")
		.formParam("name", "Mnaishk").formParam("email", "manis@gmail.com")
		.formParam("address[line1]", "3434")
		.formParam("preferred_locales[0]", "english")
		.post("https://api.stripe.com/v1/customers");
		
		response.prettyPrint();
		
		/*
		 * JsonPath json= response.jsonPath();
		 * 
		 * System.out.println(json.get("id"));
		 */
		
		System.out.println(response.jsonPath().get("id"));
		System.out.println(response.jsonPath().get("name"));
		System.out.println(response.jsonPath().get("address.line1"));
		System.out.println(response.jsonPath().get("preferred_locales[0]"));
		
		
		System.out.println(response.jsonPath().getMap("$").size());
		
		System.out.println(response.jsonPath().getMap("address").size());
		
		System.out.println(response.jsonPath().getList("preferred_locales").size());
	}

}
