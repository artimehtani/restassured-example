package Feature;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import restAssuredApiTest.Demo1_GetRequest;

public class StepDemo {
	@Given("I perform the Get operation")
	public void i_perform_the_Get_operation(){
	   given().accept(ContentType.JSON);
	}

	@When("I perform Get operation on city Delhi")
	public void i_perform_Get_operation_on_employees() {
		
	
	    when().get("http://dummy.restapiexample.com/api/v1/employees")
		    .then().statusCode(200)
		    .assertThat().body("data[0].employee_name", equalTo("Tiger Nixon"))
		    .statusLine("HTTP/1.1 200 OK");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
      
	
	}

}
