package Maincode;

	import org.json.JSONArray;
		import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

		public class Jsonprocessor 
		{
			
			
			public static String convertJsonToString(String requestBody) {
			        return requestBody.toString();
			    }


			public static JSONObject convertStringToJson(String jsonString) {
				JSONObject json = null;
				try {
		           json = new JSONObject(jsonString);
		            //System.out.println("printing json2"+json);
		        } 
				catch (Exception e)
				{
		            
		                System.out.println("Invalid JSON string");
		            }
		        
				
				return json;
			}
			
//			public static String convertJsonarrayTostring(JSONArray js)
//			
//			{
//				Response response=RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
//
//		        // Get the response body as a string
//		        String responseBody = response.getBody().asString();
//
//		        // Convert the response body to a JSON array
//		        JSONArray jsonArray = new JSONArray(responseBody);
//
//		       // String js1 = jsonArray;
//		        // Print the JSON array
//		        
////		        System.out.println(js1);	
////		        return js1;
		//	}
			
			public static JSONArray convertJsonStringToJsonarray(String js)
			
			{
				

		        JSONArray json = null;
				try {
		           json = new JSONArray(js);
		            //System.out.println("printing json2"+json);
		        } 
				catch (Exception e)
				{
		            
		                System.out.println("Invalid JSON string");
		            }
		        
				
				return json;
			}
			}
			
		
	  
	
	


