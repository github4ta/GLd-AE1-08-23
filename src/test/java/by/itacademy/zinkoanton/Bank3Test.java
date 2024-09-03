package by.itacademy.zinkoanton;

import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.when;

public class Bank3Test {

    @Test
    public void testGetCurrencies() {
        List<Integer> integerList = when().get("https://api.nbrb.by/exrates/currencies").body().jsonPath().getList("Cur_ID");
    }
}
