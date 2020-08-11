package restAssuredApiTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class Demo2_PostRequest {
  public static HashMap map=new HashMap();
	
	
	@BeforeClass
	public void postData() {
		   
		map.put("FirstName", Restutils.getFirstName());
		map.put("LastName",Restutils.getLastName());
		map.put("UserName",Restutils.getUserName());
		map.put("Password",Restutils.getPassword());
		map.put("Email",Restutils.getEmail());
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
	}
	@Test
	public void testPost() {
		given()
		   .contentType("application/json")
		   .body(map)
		.when()
		    .post()
		.then()
		    .statusCode(201)
		    .and()
		    .body("SuccessCode",equalTo("OPERATION_SUCCESS"))
		    .and()
		    .body("Message", equalTo("Operation completed successfully"));
		
	}
	
}
