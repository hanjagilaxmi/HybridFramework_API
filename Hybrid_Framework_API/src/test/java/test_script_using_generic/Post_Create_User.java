package test_script_using_generic;

import static io.restassured.RestAssured.given;

import generic.Post_Reqres;
import generic.Reqres_Builder;
import io.restassured.response.Response;															

public class Post_Create_User {
	public static void main(String[] args) {
		Response res = given().spec(Post_Reqres.req_spec()).when().post("/api/users")
		.then().spec(Post_Reqres.res_spec(201)).extract().response();
		System.out.println(res.asString());
	}
}
