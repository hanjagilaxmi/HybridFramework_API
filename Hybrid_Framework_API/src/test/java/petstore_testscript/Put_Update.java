package petstore_testscript;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Put_Update {
	public static void main(String[] args) {
		String obj="{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"username\": \"laxmi\",\r\n"
				+ "  \"firstName\": \"lax\",\r\n"
				+ "  \"lastName\": \"h\",\r\n"
				+ "  \"email\": \"lax@gmail.com\",\r\n"
				+ "  \"password\": \"98746lj\",\r\n"
				+ "  \"phone\": \"9632587412\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}";
		RestAssured.baseURI="https://reqres.in/";
		given().body(obj).contentType(ContentType.JSON).when().put("/v2/user/laxmi").then()
		.statusCode(200);
		System.out.println("Done");
	}
}
