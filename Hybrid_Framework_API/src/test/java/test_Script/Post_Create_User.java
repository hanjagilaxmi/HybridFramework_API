package test_Script;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Post_Create_User {
	public static void main(String[] args) {
		String obj="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		RestAssured.baseURI="https://reqres.in/";
		given().body(obj).when().post("/api/users").then().statusCode(201)
		.and().contentType(ContentType.JSON);
		System.out.println("done");
	}
}
