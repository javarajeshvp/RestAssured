package com.restassured.req;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post {

	static String postUrl = "http://localhost:8080/messenger/webapi/messages";
	public static void main(String[] args) {

		RequestSpecification request = RestAssured.given();
		request.contentType("application/json");
		JSONObject json = new JSONObject();
		json.put("id", "2001");
		json.put("message", "Welcome to Restassured");
		json.put("author", "VPR");
		request.body(json.toJSONString());
		Response response = request.post(postUrl);
		
	}

}
