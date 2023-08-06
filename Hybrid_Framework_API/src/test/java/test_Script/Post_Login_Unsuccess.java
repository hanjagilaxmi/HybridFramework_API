package test_Script;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Post_Login_Unsuccess {
	public static void main(String[] args) {
		String obj="{\r\n"
				+ "    \"email\": \"peter@klaven\"\r\n"
				+ "}";
		RestAssured.baseURI="https://reqres.in/";
		given().body(obj).when().post("/api/login").then().statusCode(400)
		.and().contentType(ContentType.JSON);
		System.out.println("Done");
	}
}
