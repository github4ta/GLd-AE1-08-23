package by.itacademy.statuscode;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class StatusCodeTest {

    @Test
    public void testDemoqa() {
        given().
                when().
                get("https://demoqa.com/BookStore/v1/Books").
                then().
                statusCode(200).
                body("books.title", hasItem(containsString("Git")));
    }

    @Test
    public void testApiOceandrivers() {
        given().
                when().
                get("http://api.oceandrivers.com/v1.0/getWebCams/").
                then().
                statusCode(200).
                body("name", hasItem(containsString("Cala Agulla")));
    }

    @Test
    public void testApiHandwrytten() {
        given().
                when().
                get("https://api.handwrytten.com/v1/cards/list").
                then().
                statusCode(200).
                body("cards.name", hasItem(containsString("Flat 5x7 Card")));
    }

    @Test
    public void testRestfulBookerHerokuapp() {
        given().
                when().
                get("https://restful-booker.herokuapp.com/booking").
                then().
                statusCode(200).
                body("bookingid", hasItem(168));
    }
}
