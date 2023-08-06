package test_Script;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class Delete {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		given().when().delete("/api/users/2").then().statusCode(204);
		System.out.println("Done");
	}
}
