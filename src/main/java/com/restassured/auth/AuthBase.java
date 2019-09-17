package com.restassured.auth;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class AuthBase {
	@BeforeClass
	public void setUp(){
		RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI ="http://restapi.demoqa.com/authentication/CheckForAuthentication";
	}
}
