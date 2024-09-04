package by.itacademy.melniksergey.onliner;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class OnlinerTest extends OnlinerBaseTest{


    @Test
    public void testLogin(){
//        String body = "{\"login\":\"asdfasd\",\"password\":\"fdsfssdfasdf\"}";
//     //   RestAssured.baseURI = "https://www.onliner.by";
//        Map<String, String> headers =new HashMap<>();
//        headers.put("Content-Type", "application/json;charset=UTF-8");
//        headers.put("Accept", "application/json, text/plain, */*");
        given()
                .headers(OnlinerLoginPage.hetHeaders())
//                .header("Content-Type", "application/json;charset=UTF-8")
//                .header("Accept", "application/json, text/plain, */*")
                //.body(OnlinerLoginPage.getBody())
                .body(OnlinerLoginPage.getBody("sFFFdf", "vaFFFlue"))
//                .body("{\n" +
//                        "    \"login\": \"dsfdsf\",\n" +
//                        "    \"password\": \"\"\n" +
//                        "}")
        .when()
                //.post("https://www.onliner.by/sdapi/user.api/login")
                //.post("/sdapi/user.api/login")
                .post(OnlinerLoginPage.SERVICE_LOGIN)
        .then()
                .log().all();
    }
}
