package testers;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import Maincode.APIHelper;
import Maincode.APIRequest;
import Maincode.APIResponse;
import io.restassured.path.json.JsonPath;

public class PetstoreTester {
	  APIResponse apiresponse;
	
	  public void urlHit(String method, String url) {

	    JSONObject requestBody = null;  
	    APIRequest request = new APIRequest(method, url, requestBody);
	    apiresponse = APIHelper.hitAPI(request);	
	
	}
	
	public void the_response_status_code_should_be(Integer int1) 
	{
		 
		Assert.assertEquals(apiresponse.getStatusCode(), int1);
	}

	public void the_response_body_should_not_be_null() 
	{
		Assert.assertNotNull(apiresponse.getResponseBody());
	}
	
	
	public void the_response_time_should_be_less_than_or_equal_to_milliseconds(Integer int1)
	{
		 Assert.assertTrue(apiresponse.getResponseTime() <= 5000, "Response time Validation Failed");
	}

	public void the_response_body_should_contain(String findkey) {

		JsonPath jsonPath = JsonPath.from(apiresponse.getResponseBody());
		
		// Code for JSON array to JSON object
		
		JSONArray jsonArray = new JSONArray(apiresponse.getResponseBody());
		JSONObject jsonObject = jsonArray.getJSONObject(0);
		
		System.out.println(jsonObject);

		//JsonPath jsonPath = JsonPath.parse(jsonObject);
		
		Assert.assertNotNull(jsonObject.has(findkey));
		Assert.assertEquals(jsonObject.has(findkey),true);
		
		
		
		
		//Assert.assertNotNull(jsonPath.getList(findkey).get(0));
		
		//System.out.println(jsonPath.getString(findkey).length());
		

		// System.out.println(jsonPath.getString("category.name").contains(findkey));
	    
	}

	
		// TODO Auto-generated method stub
		
	


	
}
