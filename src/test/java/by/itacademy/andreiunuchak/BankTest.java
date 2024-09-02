package by.itacademy.andreiunuchak;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.when;

public class BankTest {
    @Test
    public void testCurrenciesWithRestAssured() {
        Response response = RestAssured
                .given()
                .baseUri("https://api.nbrb.by")
                .when()
                .get("/exrates/currencies");
        List<Integer> curIDs = response
                .body()
                .jsonPath()
                .getList("Cur_ID");
        System.out.println(curIDs);
    }

    @Test
    public void testCurrenciesWithGson(){
        Response response = when().get("https://api.nbrb.by/exrates/currencies");
        String body = response.body().asString();
        List<JsonElement> list = JsonParser.parseString(body).getAsJsonArray().asList();

        List<String> curId = list.stream()
                .map(jsonElement -> jsonElement.getAsJsonObject().get("Cur_ID").toString())
                .collect(Collectors.toList());

        System.out.println(curId);
    }
}
