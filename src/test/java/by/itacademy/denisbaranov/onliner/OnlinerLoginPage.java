package by.itacademy.denisbaranov.onliner;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class OnlinerLoginPage {



    public static final String SERVICE_LOGIN = "/login";

    public static String getBody() {
        return getBody("qweqwe", "123");
    }

    public static String getBody(String login, String password) {
        String body = "{\n" +
                "    \"login\": \"" + login + "\",\n" +
                "    \"password\": \"" + password + "\"\n" +
                "}";
        String body2 = String.format("{\"login\":\"%s\",\"password\":\"%s\"}", login, password);
        //String body3 = ...;
        return body;
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=UTF-8");
        headers.put("Accept", "application/json, text/plain, */*");
        return headers;
    }

}
