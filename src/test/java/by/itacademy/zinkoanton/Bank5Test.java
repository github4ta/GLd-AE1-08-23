package by.itacademy.zinkoanton;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.when;

public class Bank5Test {

    @Test
    public void testGetCurrencies() {
        Response response = when().get("https://api.nbrb.by/exrates/currencies").then().extract().response();
        List<Map<String, Object>> currencies = response.jsonPath().getList("$");
        List<Integer> listOfCurrenci = new ArrayList<>();
        for (Map<String, Object> currency : currencies) {
            Integer curId = (Integer) currency.get("Cur_ID");
            listOfCurrenci.add(curId);
        }
        System.out.println(listOfCurrenci);
    }
}
