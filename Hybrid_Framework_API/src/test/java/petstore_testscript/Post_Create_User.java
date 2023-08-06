package petstore_testscript;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class Post_Create_User {
	public static void main(String[] args) {
		String  obj="{\r\n"
				+ "  \"id\": 856,\r\n"
				+ "  \"username\": \"laxmi\",\r\n"
				+ "  \"firstName\": \"lax\",\r\n"
				+ "  \"lastName\": \"ha\",\r\n"
				+ "  \"email\": \"lax@gmail.com\",\r\n"
				+ "  \"password\": \"98746lj\",\r\n"
				+ "  \"phone\": \"9632587412\",\r\n"
				+ "  \"userStatus\": 0\r\n"
				+ "}";
		RestAssured.baseURI="https://petstore.swagger.io/";
		given().body(obj).contentType(ContentType.JSON).when().post("/v2/user").then().statusCode(200)
		.and().contentType(ContentType.JSON);
		System.out.println("done");
	}
}
