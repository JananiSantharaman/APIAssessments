package assignment.testleaf.week3;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Gettheissuedetails extends BaseRestApi {
@Test
	public void gettheissuedetails()
	{
		inputrequest			
		.accept(ContentType.JSON);
		response =inputrequest.when().get(issue_id);
		validatableresponse = response.then();
		//validate the response
		validatableresponse.assertThat().statusCode(200);
		validatableresponse.body("fields.description", Matchers.containsString("Janani"));
	}	
}
