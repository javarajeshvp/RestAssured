package com.restassured.auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Authenticate extends AuthBase {

	@Test
	public void test() {
		int statusCd = RestAssured.given().auth().preemptive().basic("ToolsQA", "TestPassword").when()
				.get("http://restapi.demoqa.com/authentication/CheckForAuthentication").statusCode();

		System.out.print("statusCd : " + RestAssured.given().get().statusCode());

	}

}
