package apiTesting;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PassComplexJsonInBody {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map=new HashMap<String, Object>();
		map.put("email", "test1@gamil.com");
		map.put("firstName", "manish");
		map.put("lastName", "k");
		
		ArrayList<Integer> listOfMobileNos=new ArrayList<Integer>();
		listOfMobileNos.add(56656565);
		listOfMobileNos.add(7878787);
		
		map.put("mobile", listOfMobileNos);
		
		
		HashMap<String, String> address=new HashMap<String, String>();
		address.put("flatNo", "5656");
		address.put("city", "pune");
		address.put("state", "maha");
		address.put("country", "india");
		
		map.put("address", address);
		
		
		Response response= given().contentType(ContentType.JSON).body(map).log().all().post("http://localhost:8080/api/users");
		response.prettyPrint();
		System.out.println(response.getStatusCode());
	}

}
