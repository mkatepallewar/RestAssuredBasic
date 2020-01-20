package apiTesting;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassJSONUsingPOJO {
	
	public static void main(String[] args) {
		User user=new User("mka@gmail.com", "man", "k","303","pune","maha","india");
		
		user.setMobile(12121,45454,7878778);
		
		Response response= given().contentType(ContentType.JSON).body(user).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}

}
