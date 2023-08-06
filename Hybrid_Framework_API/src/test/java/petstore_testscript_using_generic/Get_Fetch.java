package petstore_testscript_using_generic;

import static io.restassured.RestAssured.given;

import generic.Petstore_Get;
import io.restassured.response.Response;

public class Get_Fetch {
	public static void main(String[] args) {
		Response res = given().spec(Petstore_Get.req_spec()).when().get("/v2/user/lax")
		.then().spec(Petstore_Get.res_spec(200)).extract().response();
		System.out.println(res);
		System.out.println(res.asString());
	}
}
