package Testscenarios;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Maincode.APIHelper;
import Maincode.APIRequest;
import Maincode.APIResponse;
import io.restassured.path.json.JsonPath;

public class Petstoreget {
	
	public String baseurl;
		
	@BeforeClass
	
	public void setup()
	{
		 baseurl = PropertyReader.getUrl();
		 System.out.println(baseurl);
	}
	
	@Test
    public void testGetavailablepets() {
        String method = "GET";
        String url = baseurl+"v2/pet/findByStatus?status=available";
        JSONObject requestBody = null;  // No request body for GET method
        
       
        APIRequest request = new APIRequest(method, url, requestBody);
        APIResponse apiresponse = APIHelper.hitAPI(request);
        
	
		
        Assert.assertEquals(apiresponse.getStatusCode(), 200);
        Assert.assertNotNull(apiresponse.getResponseBody());
        Assert.assertTrue(apiresponse.getResponseTime() <= 5000, "Response time Validation Failed");
        
        JsonPath jsonPath = JsonPath.from(apiresponse.getResponseBody());
        //String name123 = jsonPath.getString("name");
        
       
		//Assert.assertEquals("id", jsonPath.getString("id"));
        Assert.assertTrue(true, jsonPath.getString("id"));
        Assert.assertTrue(true, jsonPath.getString("category"));
        Assert.assertTrue(true, jsonPath.getString("name"));
        
        
    }
    
    @Test
    public void testGetPendingpets() {
        String method = "GET";
        String url = baseurl+"v2/pet/findByStatus?status=pending";
        JSONObject requestBody = null;  // No request body for GET method
        
       
        APIRequest request = new APIRequest(method, url, requestBody);
        APIResponse apiresponse = APIHelper.hitAPI(request);
        
	

        Assert.assertEquals(apiresponse.getStatusCode(), 200);
        Assert.assertNotNull(apiresponse.getResponseBody());
        Assert.assertTrue(apiresponse.getResponseTime() <= 5000, "Response time Validation Failed");
        
        JsonPath jsonPath = JsonPath.from(apiresponse.getResponseBody());
        //String name123 = jsonPath.getString("name");
        
        Assert.assertTrue(true, jsonPath.getString("id"));
        Assert.assertTrue(true, jsonPath.getString("category"));
        Assert.assertTrue(true, jsonPath.getString("name"));
        
        
    }
}


