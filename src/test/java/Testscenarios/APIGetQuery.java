package Testscenarios;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import Maincode.APIHelper;
import Maincode.APIRequest;
import Maincode.APIResponse;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class APIGetQuery {
	
@Test

public void testQueryparams() {
	
	
	 JSONObject requestBody=null;
	 String method="GET";
	 String url="https://postman-echo.com/get";
	 
	 
	APIRequest request = new APIRequest(method, url, requestBody);
     APIResponse apiresponse = APIHelper.hitAPI(request);
     
     Assert.assertEquals(apiresponse.getStatusCode(), 200);
     Assert.assertTrue(apiresponse.getResponseTime()<=5000);
     Assert.assertNotNull(apiresponse.getResponseBody());
     
     DocumentContext jsonPath = JsonPath.parse(apiresponse.getResponseBody());
     
     String xforwardedprotoValue = jsonPath.read("$headers");
     System.out.println(xforwardedprotoValue);
		
     //Assert.assertEquals(xforwardedprotoValue,"https");
		//Assert.assertEquals(jsonpath.);
     
	
}


}
