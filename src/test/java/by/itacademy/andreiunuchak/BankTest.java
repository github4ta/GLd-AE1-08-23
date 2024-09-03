package by.itacademy.andreiunuchak;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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

    @Test
    public void testCurrenciesWithGsonExample(){
        Response response = when().get("https://api.nbrb.by/exrates/currencies");
        String body = response.body().asString();

        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = jsonParser.parse(body).getAsJsonArray();

        List<Integer> curIds = new ArrayList<>();
        for (JsonElement element : jsonArray) {
            JsonElement curIdElement = element.getAsJsonObject().get("Cur_ID");
            if (curIdElement != null && curIdElement.isJsonPrimitive()) {
                curIds.add(curIdElement.getAsInt());
            }
        }

        System.out.println(curIds);
    }

    @Test
    public void testCurrennciesWithJackson(){
        Response response = when().get("https://api.nbrb.by/exrates/currencies");
        String jsonString = response.body().asString();
        ObjectMapper objectMapper = new ObjectMapper();
        List<Integer> curIds = new ArrayList<>();

        try {
            JsonNode rootNode = objectMapper.readTree(jsonString);
            if (rootNode.isArray()) {
                for (JsonNode node : rootNode) {
                    int curId = node.path("Cur_ID").asInt();
                    curIds.add(curId);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(curIds);
    }
}
