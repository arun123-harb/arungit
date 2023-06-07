package api_automation;





import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Basic_api {
	
	
	@Test
	
	public static void get_Request() {
		RestAssured.baseURI ="https://www.instagram.com/";
		RequestSpecification given = RestAssured.given();
		Response request = given.request(Method.GET);
		int statuscode = request.getStatusCode();
		System.out.println(statuscode);
		String asPrettyString=request.asPrettyString();
		System.out.println(asPrettyString);
		
	}

 //private void post_Request() {
//	RestAssured.baseURI =" http://localhost:3000";
//	RestAssured.given()
	//.header("Content-Type" , "application/json")
//	.accept(ContentType.JSON)
	//.body("{\r\n"
	
}


//}