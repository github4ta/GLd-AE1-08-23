package by.itacademy.melniksergey.onliner;

import io.restassured.RestAssured;

import java.util.HashMap;
import java.util.Map;

public class OnlinerLoginPage {

    public static final String SERVICE_LOGIN = "/sdapi/user.api/login";
    public static String getBody(){
        String body = "{\"login\":\"asdfasd\",\"password\":\"fdsfssdfasdf\"}";
        return body;
    }
    public static String getBody(String login, String password){
        String body = "{\"login\":\""+login+"\",\"password\":\""+password+"\"}";
        String body2= String.format("{\"login\":\"%s\",\"password\":\"%s\"}", login, password);
        System.out.println(body2);
        return body2;
    }



    public static Map<String, String> hetHeaders(){
        Map<String, String> headers =new HashMap<>();
        headers.put("Content-Type", "application/json;charset=UTF-8");
        headers.put("Accept", "application/json, text/plain, */*");
        return headers;
    }


}
