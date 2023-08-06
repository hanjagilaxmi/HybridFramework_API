package test_Script;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get_Single_Res_Not_Found {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		given().when().get("/api/unknown/23").then().statusCode(404);
		System.out.println("DONE");
	}
}
