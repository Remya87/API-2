package Maincode;

import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.response.ResponseBody;

public class APIResponse {
    private int statusCode;
    private String responseBody;
    private long responseTime;

    public APIResponse(int statusCode,String responseBody,long responseTime) {
        this.statusCode = statusCode;
        this.responseBody = responseBody;
        this.responseTime= responseTime;
        
    }

	public int getStatusCode() {
        return statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }
    
    public long getResponseTime() {
        return responseTime;
    }


}


