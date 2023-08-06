package test_Script;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Get_Delay_Responce {
	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		given().when().get("/api/users?delay=2").then().statusCode(200);
		System.out.println("DONE");
	}
}
