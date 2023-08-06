package petstore_testscript_using_generic;

import static io.restassured.RestAssured.given;

import generic.Petstore_Post;
import io.restassured.response.Response;

public class Post_Create_User {
	public static void main(String[] args) {
		Response res = given().spec(Petstore_Post.req_spec()).when().post("/v2/user")
		.then().spec(Petstore_Post.res_spec(200)).extract().response();
		System.out.println(res.asString());
	}
}
