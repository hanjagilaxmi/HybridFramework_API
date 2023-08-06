package test_Script;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Put_Update {
	public static void main(String[] args) {
		String obj="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		RestAssured.baseURI="https://reqres.in/";
		given().body(obj).when().put("/api/users/2").then().statusCode(200)
		.and().contentType(ContentType.JSON);
		System.out.println("Done");
	}
}
