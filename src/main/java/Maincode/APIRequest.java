package Maincode;

import org.json.JSONObject;

public class APIRequest {
    private String method;
    private String url;
    private JSONObject requestBody;

    public APIRequest(String method, String url,JSONObject  requestBody) {
        this.method = method;
        this.url = url;
        this.requestBody = requestBody;
    }

   

	



	public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public JSONObject getRequestBody() {
        return requestBody;
    }
    
    @Override
    public String toString() {
        return method + "\n" + url + "\n" + requestBody;
    }
}