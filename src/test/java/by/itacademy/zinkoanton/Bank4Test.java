package by.itacademy.zinkoanton;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Bank4Test {

    @Test
    public void testCurrencies() {
        Response response = RestAssured
                .given()
                .baseUri("https://api.nbrb.by/")
                .when()
                .get("/exrates/currencies");
        List<Integer> bankItemList = response.then().extract().jsonPath().getList("Cur_ID");
        System.out.println(bankItemList);
    }
}
