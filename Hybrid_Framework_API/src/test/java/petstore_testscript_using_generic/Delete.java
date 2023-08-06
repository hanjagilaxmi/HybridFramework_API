package petstore_testscript_using_generic;

import static io.restassured.RestAssured.given;

import generic.Petstore_Dlete;
import io.restassured.response.Response;

public class Delete {
	public static void main(String[] args) {
		Response res = given().spec(Petstore_Dlete.req_spec()).when().delete("/v2/user/lax")
		.then().spec(Petstore_Dlete.res_spec(200)).extract().response();
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
	}	
}
