package generic;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Petstore_Post {
 public static RequestSpecification req_spec()
 {
	 String obj="{\r\n"
	 		+ "  \"id\": 0,\r\n"
	 		+ "  \"username\": \"lax\",\r\n"
	 		+ "  \"firstName\": \"la\",\r\n"
	 		+ "  \"lastName\": \"lah\",\r\n"
	 		+ "  \"email\": \"lax@gmail.com\",\r\n"
	 		+ "  \"password\": \"lax@123\",\r\n"
	 		+ "  \"phone\": \"9632587412\",\r\n"
	 		+ "  \"userStatus\": 0\r\n"
	 		+ "}";
	 RequestSpecBuilder r=new RequestSpecBuilder();
	 RequestSpecification req = r.setBaseUri("https://petstore.swagger.io/").setBody(obj)
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
