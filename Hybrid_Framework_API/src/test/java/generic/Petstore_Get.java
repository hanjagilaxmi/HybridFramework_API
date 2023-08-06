package generic;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Petstore_Get {
	public static RequestSpecification req_spec()
	{
		RequestSpecBuilder r=new RequestSpecBuilder();
		RequestSpecification req = r.setBaseUri("https://petstore.swagger.io/").setContentType(ContentType.JSON).build();
		return req;
	}
	public static ResponseSpecification res_spec(int code)
	{
		ResponseSpecBuilder r=new ResponseSpecBuilder();
		ResponseSpecification res = r.expectStatusCode(code)
		.expectContentType(ContentType.JSON).build();
		return res;
	}
}
