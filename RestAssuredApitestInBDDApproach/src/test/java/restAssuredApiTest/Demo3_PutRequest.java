package restAssuredApiTest;

import java.util.HashMap;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo3_PutRequest {
	
	public static HashMap map=new HashMap();
	int empId=20;
	String empName=Restutils.empName();
	String empSal=Restutils.empSal();
	String empAge=Restutils.empAge();
	@BeforeClass
	public void putData() {
		map.put("name",empName);
		map.put("salary",empSal);
		map.put("age",empAge);
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/update/"+empId;
	}
	@Test
	public void testPutRequest() {
		given()
		.contentType("application/json")
		.body(map)
	   .when()
	   .put()
		.then()
		.statusCode(200)
		.log().all();
		
		
	}

}
