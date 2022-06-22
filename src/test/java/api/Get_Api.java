package api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_Api {

	@Test
	public void get() {

		Response response = RestAssured.get("https://reqres.in/api/users?page=1").then().extract().response();

		int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		String responseBody = response.getBody().toString();
		System.out.println(responseBody);

		// Validate the GetallAPIMethod
		Assert.assertEquals(statuscode, 200, "Response Received Successfully");

	}

}
