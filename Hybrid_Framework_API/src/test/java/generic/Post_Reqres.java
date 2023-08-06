package generic;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Post_Reqres {
	public static RequestSpecification req_spec()
	{
		String obj="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		RequestSpecBuilder r=new RequestSpecBuilder();
		RequestSpecification req = r.setBaseUri("https://reqres.in/").setBody(obj)
				.setContentType(ContentType.JSON).build();
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
