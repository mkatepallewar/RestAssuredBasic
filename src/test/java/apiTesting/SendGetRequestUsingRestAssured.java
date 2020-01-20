package apiTesting;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matcher.*;



public class SendGetRequestUsingRestAssured {
	/*
	 * set authentication : stripe api - basic auth, bearer using headers
	 * request --> set of request specification 
	 * response --> validate
	 * content type:
	 * 1. using contentType()
	 * 2. adding the content type on headers
	 * 
	 */
	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  Response response= given().param("limit",1).auth().basic("sk_test_3CtsRvSgzv8f0sf5PZghJcOK00PHHjhqAe","").get("https://api.stripe.com/v1/customers"); 
	  // response.prettyPrint();
	  
	  String jsonResponse= response.asString(); System.out.println(jsonResponse);
	  
	  System.out.println("Response Code: " + response.statusCode());
	  
	  // given().contentType("application/json"); //
//	  given().contentType(ContentType.JSON); // given().header("content-type","application/json").auth().basic(userName, password);
	  
	  }
	 
//	public static void main(String[] args) {
//		Response response= given().header("Authorization", "Bearer sk_test_3CtsRvSgzv8f0sf5PZghJcOK00PHHjhqAe").get("https://api.stripe.com/v1/customers/cus_GXr35JDoMv48tu");
//		response.prettyPrint();
//	}
}
