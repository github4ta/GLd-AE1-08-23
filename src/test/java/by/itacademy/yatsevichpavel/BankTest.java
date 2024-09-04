package by.itacademy.yatsevichpavel;

import com.google.gson.*;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.*;

public class BankTest {
    @Test
    public void testCurrencies() {
        Response response = (Response) when()
                .get("https://api.nbrb.by/exrates/currencies").
                then().extract();
        String body = response.body().asString();
        List<JsonElement> list = JsonParser.parseString(body).getAsJsonArray().asList();

        List<Integer> curId = list.stream()
                .map(jsonElement -> jsonElement.getAsJsonObject()
                        .get("Cur_ID")
                        .getAsInt())
                .collect(Collectors.toList());

        System.out.println(curId);
    }
}
