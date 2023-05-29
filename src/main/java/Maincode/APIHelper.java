package Maincode;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import Maincode.APIRequest;

public class APIHelper {
    public static APIResponse hitAPI(APIRequest request) {
        String method = request.getMethod();
        String url = request.getUrl();
        JSONObject requestBody = request.getRequestBody();

        Response response;
        if (method.equalsIgnoreCase("GET")) {
            response = RestAssured.get(url);
        } else if (method.equalsIgnoreCase("POST")) {
            response = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                    .post(url);
        } else {
            throw new IllegalArgumentException("Invalid HTTP method: " + method);
        }

        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();
        long responseTime = response.getTime();

        APIResponse apiResponse = new APIResponse(statusCode, responseBody, responseTime);
        return apiResponse;
    }
}