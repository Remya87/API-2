package Testscenarios;

import org.json.JSONObject;
import org.testng.Assert;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Maincode.Jsonprocessor;

//import org.junit.Assert;
//import org.junit.Test;


public class Testjsonprocessor {

    @Test
    
    public void testValidJsonString() {
    	
        String jsonString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        //String expectedJson = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}";
        JSONObject expectedJsonobject = new  JSONObject(jsonString);
        JSONObject actualJson = Jsonprocessor.convertStringToJson(jsonString);
        System.out.println("jsonString = "+jsonString);
        System.out.println("actualJson = "+actualJson);
        System.out.println("expectedJsonobject = "+expectedJsonobject);
      
        //Assert.assertEquals(expectedJsonobject,actualJson);
        Assert.assertEquals(expectedJsonobject.toString(), actualJson.toString());
    }
    
    @Test
    public void testInvalidJsonString() {
    	
        String jsonString = "{\"name\": \"John\",, \"age\",: 30, \"city\", \"New York\",,}";
        JSONObject expectedJsonobject = new  JSONObject(jsonString);
        JSONObject actualJson = Jsonprocessor.convertStringToJson(jsonString);
        System.out.println("jsonString = "+jsonString);
        System.out.println("actualJson = "+actualJson);
        System.out.println("expectedJsonobject = "+expectedJsonobject);
      
        Assert.assertEquals(expectedJsonobject.toString(), actualJson.toString());
    }
    
    @Test
    public void ConvertJsonToString() {
        JSONObject jsonObject = new JSONObject("{\"name\":\"Alice\",\"age\":25,\"isStudent\":true}");
        String expectedJsonString = "{\"name\":\"Alice\",\"age\":25,\"isStudent\":true}";
        String actualJsonString = Jsonprocessor.convertJsonToString(jsonObject);
       
        System.out.println("jsonobject = "+jsonObject);
        System.out.println("actualJson = "+actualJsonString);
        System.out.println("expectedJsonString = "+expectedJsonString);
        
        Assert.assertEquals(actualJsonString, expectedJsonString);
    }

    

    
}