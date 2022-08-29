package assignment.testleaf.week3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class BaseRestApi {

public static String issue_id;
public static RequestSpecification inputrequest;
public static Response response;
public static ValidatableResponse validatableresponse;
@BeforeSuite
public void SetPreconfig() {
	RestAssured.baseURI ="https://testleafjune2022.atlassian.net/rest/api/2/issue/";
	inputrequest = RestAssured
			.given()
			.log()
			.all()
			.auth()
			.preemptive()
			.basic("testleafjune2022@gmail.com", "gM2LBaQ6MVxkOp7V8oAE7584");
}
@AfterMethod
public void setPostConfig() {
	validatableresponse.log().all();
}
}
