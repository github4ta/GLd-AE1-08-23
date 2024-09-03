package by.itacademy.zinkoanton;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;
import org.json.JSONArray;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.when;

public class Bank6Test {

    @Test
    public void testCurrencies() {
        Response response = when().get("https://api.nbrb.by/exrates/currencies").then().extract().response();
        List<Map<String, Object>> currencies = response.jsonPath().getList("$");

        /*for (Map<String, Object> currency : currencies) {
            Integer curId = (Integer) currency.get("Cur_ID");
            System.out.println("Cur_ID: " + curId);
        }*/

        String jsonResult = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            jsonResult = objectMapper.writeValueAsString(currencies);
            System.out.println("JSON result: " + jsonResult);
        } catch(JsonProcessingException e) {
            e.printStackTrace();
        }

        JSONArray jsonArray = new JSONArray(jsonResult);
        jsonArray.get(1).toString();
        System.out.println(jsonArray.get(1).toString());
    }
}
