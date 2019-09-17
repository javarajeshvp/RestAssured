package com.restassured.req;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get {

	public static void testResponseCode() {
		Response response = get("http://localhost:8080/messenger/webapi/messages");
		int statusCd = response.getStatusCode();

		System.out.println(response.asString());
		System.out.println(response.getTime());
		// Assert.assertEquals(200, statusCd);

	}
 
	public static void main(String arg[]) {
		testResponseCode();
	}

}
