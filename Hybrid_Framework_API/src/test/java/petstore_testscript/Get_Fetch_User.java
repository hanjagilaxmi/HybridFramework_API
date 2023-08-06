package petstore_testscript;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class Get_Fetch_User {
	public static void main(String[] args) {
		RestAssured.baseURI="https://petstore.swagger.io/";
		given().when().get("/v2/user/laxmi").then().statusCode(200);
		System.out.println("Done");
	}
}
