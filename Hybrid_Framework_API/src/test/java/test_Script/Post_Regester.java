package test_Script;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Post_Regester {
	public static void main(String[] args) {
		String obj="{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"pistol\"\r\n"
				+ "}";
		RestAssured.baseURI="https://reqres.in/";
		given().body(obj).when().post("/api/register").then().statusCode(200)
		.and().contentType(ContentType.JSON);
		System.out.println("Done");
	}
}
