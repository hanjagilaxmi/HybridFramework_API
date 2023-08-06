package petstore_testscript_using_generic;

import static io.restassured.RestAssured.given;

import generic.Petstore_Put;
import io.restassured.response.Response;

public class Put_Update {
	public static void main(String[] args) {
		Response res = given().spec(Petstore_Put.req_spec()).when().put("/v2/user/lax")
		.then().spec(Petstore_Put.res_spec(200)).extract().response();
		System.out.println(res.asString());
	}
}
