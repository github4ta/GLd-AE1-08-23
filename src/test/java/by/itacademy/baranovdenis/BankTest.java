package by.itacademy.baranovdenis;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.when;


public class BankTest {
    @Test
    public void testGetCurrencies() {

        Response response = RestAssured.
                when().get("https://api.nbrb.by/exrates/currencies")
                .then().extract().response();
        //String body = response.body().prettyPrint();
        //List<JsonElement> list = JsonParser.parseString(body).getAsJsonArray().asList();

        String body = response.body().asString();

        JsonObject jsonObject = JsonParser.parseString(body).getAsJsonObject();
        System.out.println(jsonObject);

    }
}
