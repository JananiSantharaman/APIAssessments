package assignment.testleaf.week3;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class CreateIssueInJira extends BaseRestApi {
	@Test
	public void createrequest() {
		inputrequest			
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "    \"project\":\r\n"
				+ "                {\r\n"
				+ "                    \"key\": \"AUG\"\r\n"
				+ "                },\r\n"
				+ "    \"summary\": \"To Test the API Using Postman and Jira\",\r\n"
				+ "    \"description\": \"\",\r\n"
				+ "    \"issuetype\": {\r\n"
				+ "                    \"name\": \"Bug\"\r\n"
				+ "                }\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "");
		//give the object rest assured
		response = inputrequest.post();
		validatableresponse = response.then();	
		//validate the response
		validatableresponse.assertThat().statusCode(201);
		 issue_id = response.jsonPath().get("id");
	System.out.println("Issue_Id " +issue_id);				
	}
}
