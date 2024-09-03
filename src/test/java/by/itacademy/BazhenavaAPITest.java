package by.itacademy;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class BazhenavaAPITest {

    @Test
    public void testForDemoqa() {
        RestAssured.
                when().
                        get("https://demoqa.com/BookStore/v1/Books").
                then().
                        log().body().statusCode(200).
                body("books.title", hasItem(containsString("Git")));
    }

    @Test
    public void testForRestful() {
        RestAssured.
                when().
                        get("https://restful-booker.herokuapp.com/booking").
                then().
                        log().body().statusCode(200).
                body("bookingid", hasItem(equalTo(358)));
    }

    @Test
    public void testForOceandrivers() {
        RestAssured.
                when().
                        get("http://api.oceandrivers.com/v1.0/getWebCams").
                then().
                        log().body().statusCode(200).
                body("name", hasItem(equalTo("Cala Agulla")));
    }

    @Test
    public void testForHandwrytten() {
        RestAssured.
                when().
                        get("https://api.handwrytten.com/v1/cards/list").
                then().
                        log().body().statusCode(200).
                body("cards.name", hasItem(containsString("Flat 5x7 Card")));
    }
}
