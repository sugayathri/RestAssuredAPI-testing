package restassuredHttpMethods;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class HttpMethodsPractice {
	@Test
	public void getMethod() {
		//equalTo() should import from hamcrestMatchers and is to be static
		//given() import from restassured and to be static
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]", equalTo(7));
	}
	

}
