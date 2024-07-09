package praveen;
import org.openqa.selenium.remote.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RedirectSpecification;
import io.restassured.specification.RequestSpecification;



public class Prav_Api {
@Test
	public void getApp() {
RestAssured.baseURI= "https://petstore.swagger.io/v2";
RequestSpecification rec = RestAssured.given();
io.restassured.response.Response response = rec.get("/pet/findByStatus?status=available&status=available");
ResponseBody body = response.getBody();
System.out.println("response body is:"+ body.asString());
System.out.println("json format is"+response.prettyPrint());

int statuscode =response.getStatusCode();
System.out.println("status code is : "+statuscode);
Assert.assertEquals(statuscode, 200);
}



	
	
	
	


}
