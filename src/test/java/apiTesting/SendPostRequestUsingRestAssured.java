package apiTesting;
import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matcher.*;

public class SendPostRequestUsingRestAssured {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Response response=
	 * given().auth().basic("sk_test_3CtsRvSgzv8f0sf5PZghJcOK00PHHjhqAe","")
	 * .formParam("name", "manishK").formParam("email",
	 * "k@gmail.com").formParam("description",
	 * "This is new post request from rest assured")
	 * .post("https://api.stripe.com/v1/customers");
	 * 
	 * response.prettyPrint(); }
	 */
	
	public static void main(String[] args) {
//		String bodyString= "{\"email\": \"eve.holt@reqres.in\",\"password\": \"pistol\"}";
		
		/*
		 * HashMap<String, String> map=new HashMap<String, String>(); map.put("email",
		 * "manishtest@gmail.com"); map.put("firstName", "manishtest");
		 * map.put("lastName", "testmanish");
		 */
//		Response response= given().contentType(ContentType.JSON).body(map).post("http://localhost:8080/api/users");
//		response.prettyPrint();
//		System.out.println(response.getStatusCode());
		
		Response response= given().contentType(ContentType.JSON).body(new File("./users.json")).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
//		response= given().contentType(ContentType.JSON).get("http://localhost:8080/api/users");
//		response.prettyPrint();
//		System.out.println(response.getStatusCode());
	}
}
