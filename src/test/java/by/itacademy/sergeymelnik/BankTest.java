package by.itacademy.sergeymelnik;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.hasItem;

public class BankTest {

    @Test
    public void testCurrencies() throws JsonProcessingException {
        when().
                get("https://api.nbrb.by/exrates/currencies")
              //  get("https://api.nbrb.by/exrates/rates?periodicity=0")
                .then()
             //   .log()
               // .body()
//                .all();
                .statusCode(200)
                .body("Cur_ID", hasItem(440));
        List<Integer> integerList = when().get("https://api.nbrb.by/exrates/currencies").body().jsonPath().getList("Cur_ID");
       // System.out.println(integerList);
        Response response = RestAssured.given().baseUri("https://api.nbrb.by").when().get("/exrates/currencies");
        JsonPath jsonPath = response.jsonPath();
        List<String> strings = jsonPath.getList("Cur_DateEnd");

        List<Map<String, Object>> maps = response.jsonPath().getList("$");
        JSONObject jsonObject = new JSONObject(maps);
        String orgJsonData = jsonObject.toString();

       // Assertions.assertEquals(orgJsonData, jsonPath);
        String stringMap = "";
        ObjectMapper objectMapper = new ObjectMapper();
        for (Map<String, Object> map : maps){
            stringMap = objectMapper.writeValueAsString(map);
        }


          JSONArray jsonArray = new JSONArray(stringMap);
           System.out.println(jsonArray.get(1));
       // JSONObject jsonObject1 = JsonParser.parseString







//        System.out.println(maps);
//        List<String> listCurrensies = new ArrayList<>();
//
//        for (Map<String, Object> map1 : maps){
//            String intCurrency = (String) map1.get("Cur_Code");
//            listCurrensies.add(intCurrency);
//        }
//        System.out.println(listCurrensies);
//
//        for (Map<String, Object> map : maps){
//            String str =  (String) map.get("Cur_Name");
//            System.out.println("Cur name   " + str);
//        }
//        System.out.println(strings);
//        List<String> stringList = when().get("https://api.nbrb.by/exrates/currencies").body().jsonPath().getList("Cur_Name");
//        System.out.println(stringList);
//        List<String> dateList = when().get("https://api.nbrb.by/exrates/currencies").body().jsonPath().getList("Cur_DateStart");
//        System.out.println(dateList);
//
//        List<Date> dataList = RestAssured
//                .given()
//                .baseUri("https://api.nbrb.by")
//                .when()
//                .get("/exrates/currencies")
//                .then().extract().jsonPath().getList("Cur_DateStart");
//        System.out.println(dataList);
//
//        List<Integer> curIDs = RestAssured
//                .given()
//                .baseUri("https://api.nbrb.by")
//                .when()
//                .get("/exrates/currencies")
//                .then().extract().jsonPath().getList("Cur_ID");
//        System.out.println(curIDs);



    }
}
