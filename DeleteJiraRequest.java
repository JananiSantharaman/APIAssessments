package assignment.testleaf.week3;

import org.testng.annotations.Test;

public class DeleteJiraRequest extends BaseRestApi{
@Test
public void deleterequest() {
	validatableresponse = inputrequest.when().delete(issue_id).then();
	validatableresponse.assertThat().statusCode(204);
}
}