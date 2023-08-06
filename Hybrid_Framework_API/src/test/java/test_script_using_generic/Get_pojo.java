package test_script_using_generic;

import static io.restassured.RestAssured.given;

import generic.Reqres_Builder;
import io.restassured.response.Response;
import pojo.Data;
import pojo.Single_User;

public class Get_pojo {
	public static void main(String[] args) {
		Response res = given().spec(Reqres_Builder.req_spec()).when().get("/api/users/2")
		.then().spec(Reqres_Builder.res_spec(200)).extract().response();
		Single_User s = res.as(Single_User.class);
		Data d = s.getData();
		System.out.println(d.getLast_name());
	}
}
