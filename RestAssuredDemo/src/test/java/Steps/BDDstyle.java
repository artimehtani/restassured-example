package Steps;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class BDDstyle {
    public static void simpleGetMethod(String idNumber) {
        Response response = given().contentType(ContentType.JSON)
                .when().get(String.format("https://reqres.in/api/users/%s", idNumber));
        response.then().body("data.first_name", is("George"));
    }

    public static void performContainCollection() {
        Response response = given().contentType(ContentType.JSON)
                .when().get(String.format("https://reqres.in/api/users"));
        System.out.println(response.getBody());
        response.then().statusCode(200);
    }
}
