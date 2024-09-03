package by.itacademy.zinkoanton;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;

public class BankTest {

    @Test
    public void testGetCurrencies() {
        when().get("https://api.nbrb.by/exrates/currencies")
                .then().log().all();
    }
}
