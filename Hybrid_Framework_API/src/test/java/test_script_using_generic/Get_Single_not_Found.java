package test_script_using_generic;

import static io.restassured.RestAssured.given;

import generic.Reqres_Builder;
import io.restassured.response.Response;

public class Get_Single_not_Found {
	public static void main(String[] args) {
		Response res = given().spec(Reqres_Builder.req_spec()).when().get("/api/users/23")
		.then().spec(Reqres_Builder.res_spec(404)).extract().response();
		System.out.println(res.asString());
	}
}
