package restAssuredApiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;


/*
Perform Basic Validations JSON
1.Test Status code
2.Log response
3.Verifying single content in response body
4.Verifying Multiple contents in response body
5.Setting parameters and headers


*/
public class Demo5_BasicValidations_Json {

	//1.Test Status code
	@Test(priority=1)
	public void testStatusCode() {
		given()
		
		.when()
		.get("https://reqres.in/api/users")
		
		.then()
		.statusCode(200);
	}

	//2.Log Response
	@Test(priority=2)
	public void testLogging() {
		given()
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	//3.Verifying single content in Response Body
	@Test(priority=3)
	public void verifySingleContent() {
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.body("data.first_name",equalTo("Janet"));	
}
	
	//4.Verifying Multiple contents in Response Body
	@Test(priority=4)
	public void verifymultipleContents() {
		given()
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
		.statusCode(200)
		.body("data.employee_name",hasItems("Cedric Kelly","Colleen Hurst","Paul Byrd"));	
	}
//5.Setting parameters and headers
	@Test(priority=5)
	public void setParametersAndHeaders() {
		given()
		.param("MyName", "Arti")
		.header("MyHeader","SelfLearning")
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
		.statusCode(200);
	}

}

