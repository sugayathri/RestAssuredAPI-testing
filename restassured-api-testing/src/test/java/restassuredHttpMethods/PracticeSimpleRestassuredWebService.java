package restassuredHttpMethods;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
public class PracticeSimpleRestassuredWebService {
	@Test
	public void getMethod() {
		Response  res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("statuscode:" +res.getStatusCode());
		System.out.println("statusline:" +res.getStatusLine());
		System.out.println("Content type:" +res.contentType());
		System.out.println("convert as string type:" +res.asString());
		System.out.println("header:" +res.getHeader("content-type"));
		System.out.println("time:" +res.getTime());
		System.out.println("body:" +res.getBody().asString());
		//validations
		int statusCode=res.getStatusCode();
		Assert.assertEquals(200, statusCode);
	}
}
