package by.itacademy.denisbaranov.onliner;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class OnlinerLoginPage {
    public static final String SERVICE_LOGIN = "/login";

    public static String getBody() {
        String body = "{\n" +
                "    \"login\": \"123@yandex.by\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        return body;
    }

    public static String getBody(String login, String password) {
        String body = "{\n" +
                "    \"login\": \"123@yandex.by\",\n" +
                "    \"password\": \"123456\"\n" +
                "}";
        String body2 = String.format("{\"login\":\"%s\",\"password\":\"%s\"}", login, password);
        return body;
    }

    public static Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json;charset=UTF-8");
        headers.put("Accept", "application/json, text/plain, */*");
        return headers;
    }

}
