package assignment.testleaf.week3;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class EditJiraIssue extends BaseRestApi{
@Test
	public void EdittheIssueDetails() {
		
		inputrequest			
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
.body("{"
		+ "    \"fields\": {"
		+ ""
		+ "        \"description\": \"Bug creation Using REST API for testing - Janani\""
		+ "    }"
		+ "}"
		+ "");
//give the object rest assured
response = inputrequest.when().put(issue_id);
validatableresponse = response.then();	
	
	}
}