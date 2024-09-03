package by.itacademy.zinkoanton;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Bank2Test {

    @Test
    public void testGetCurrencies() {
        List<Integer> curIDs = RestAssured
                .given()
                .baseUri("https://api.nbrb.by")
                .when()
                .get("/exrates/currencies").then().extract().jsonPath().getList("Cur_ID");
        System.out.println(curIDs);
    }
}
