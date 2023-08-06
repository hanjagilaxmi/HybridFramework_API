package test_Script;

import static io.restassured.RestAssured.given;

import generic.Reqres_Builder;
import io.restassured.response.Response;


public class Get_Single_Us {
	public static void main(String[] args) {
		Response res = given().spec(Reqres_Builder.req_spec()).when().get("/api/users/2")
		.then().spec(Reqres_Builder.res_spec(200)).extract().response();
		res.prettyPrint();
	}
}
