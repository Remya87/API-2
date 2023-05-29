package Testscenarios;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import Maincode.APIHelper;
import Maincode.APIRequest;
import Maincode.APIResponse;
import Maincode.Jsonprocessor;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.ReadContext;

public class TestAPIHelper {


	 @Test
	    public void testPostpetstore() {
	        String method = "POST";
	        String url = "https://petstore.swagger.io/v2/pet";
	        String requestBody = "{\"id\":0,\"category\":{\"id\":0,\"name\":\"panda\"},\"status\":\"available\"}";
	        
	        

			Jsonprocessor jsonProccessor = new Jsonprocessor();
			JSONObject jss2 = jsonProccessor.convertStringToJson(requestBody);
	        
	        
	        APIRequest request = new APIRequest(method, url, jss2);
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

	    @Test
	    public void testGetavailablepets() {
	        String method = "GET";
	        String url = "https://petstore.swagger.io/v2/pet/findByStatus?status=available";
	        JSONObject requestBody = null;  // No request body for GET method
            
	       
	        APIRequest request = new APIRequest(method, url, requestBody);
	        APIResponse apiresponse = APIHelper.hitAPI(request);
	        
			//Jsonprocessor jsonProccessor = new Jsonprocessor();
			//String jss = jsonProccessor.convertJsonToString(apiresponse.getResponseBody());
			
			

	        Assert.assertEquals(apiresponse.getStatusCode(), 200);
	        Assert.assertNotNull(apiresponse.getResponseBody());
	        Assert.assertTrue(apiresponse.getResponseTime() <= 5000, "Response time Validation Failed");
	       
	        JsonPath jsonPath = JsonPath.from(apiresponse.getResponseBody());
            //String name123 = jsonPath.getString("name");
	        
	        
	        Assert.assertTrue(true, jsonPath.getString("id"));
	        Assert.assertTrue(true, jsonPath.getString("category"));
	        Assert.assertTrue(true, jsonPath.getString("name")); 
	        
	       
	        
	    }
	    
	    @Test
	    public void testGetPendingpets() {
	        String method = "GET";
	        String url = "https://petstore.swagger.io/v2/pet/findByStatus?status=pending";
	        JSONObject requestBody = null;  // No request body for GET method
            
	       
	        APIRequest request = new APIRequest(method, url, requestBody);
	        APIResponse apiresponse = APIHelper.hitAPI(request);
	        
			//Jsonprocessor jsonProccessor = new Jsonprocessor();
			//String jss = jsonProccessor.convertJsonToString(apiresponse.getResponseBody());
			
			

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
	

//	

	       

	


