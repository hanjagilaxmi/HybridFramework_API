package test_Script;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get_List_resource {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		given().when().get("/api/unknown").then().statusCode(200);
		System.out.println("DONE");
	}
}
