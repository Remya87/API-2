package Maincode;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;

public class PetStoreStringtoJson {
	static JSONArray js ;

    public static void main(String[] args) {
        
    	Response response=RestAssured.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");

        // Get the response body as a string
        String responseBody = response.getBody().asString();

        // Convert the response body to a JSON array
        JSONArray jsonArray = new JSONArray(responseBody);

        js = jsonArray;
        // Print the JSON array
        
        System.out.println(js);
    }
}