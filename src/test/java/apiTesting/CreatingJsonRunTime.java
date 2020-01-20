package apiTesting;

import static io.restassured.RestAssured.given;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreatingJsonRunTime {
	
	public static void main(String[] args) {
		
		JSONObject jsonObject=new JSONObject();
		
		jsonObject.put("email", "mkatepallewar@yahoo.com");
		jsonObject.put("firstName", "manishK");
		jsonObject.put("lastName", "MK");
		
		JSONArray listOfMobiles=new JSONArray();
		listOfMobiles.put(45444554);
		listOfMobiles.put(78787877);
		
		jsonObject.put("mobile", listOfMobiles);
		
		JSONObject address=new JSONObject();
		address.put("flatNo", "5656");
		address.put("city", "pune");
		address.put("state", "maha");
		address.put("country", "india");
		
		jsonObject.put("address", address);
		
		Response response= given().contentType(ContentType.JSON).body(jsonObject.toString()).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}
}
