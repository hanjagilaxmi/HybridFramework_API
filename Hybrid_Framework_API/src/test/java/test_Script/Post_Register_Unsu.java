package test_Script;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Post_Register_Unsu {
	public static void main(String[] args) {
		String obj="{\r\n"
				+ "    \"email\": \"sydney@fife\"\r\n"
				+ "}";
		RestAssured.baseURI="https://reqres.in/";
		given().body(obj).when().post("/api/register").then().statusCode(400)
		.and().contentType(ContentType.JSON);
		System.out.println("Done");
	}
}
