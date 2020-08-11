package restAssuredApiTest;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

/*Given()
set cookies,add auth,add param,set headers info etc
*When()
get,post,put,delete
*Then()
validate status code,extract response,extract headers cookies and response

*/


public class Demo1_GetRequest {
	
	
	@Test
	public void getWeatherDetails() {
	 given()
	.when()
	        .get("http://restapi.demoqa.com/utilities/weather/city/Delhi")
	 .then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City",equalTo("Delhi"))
		.header("Content-Type", "application/json");
		
	}

}
