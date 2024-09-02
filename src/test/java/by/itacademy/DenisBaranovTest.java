package by.itacademy;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class DenisBaranovTest {

    @Test
    public void testBookStoreApi() {
            given()
                .when()
                .get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .statusCode(200)
                .body("books.title", hasItem(containsString("Git")));
    }
    @Test
    public void testRestfulBookerApi() {
        given()
                .when()
                .get("https://restful-booker.herokuapp.com/booking")
                .then()
                .statusCode(200)
                .body("bookingid", hasItem(2460));
    }
    @Test
    public void testOceanDriversApi() {
        given()
                .when()
                .get("http://api.oceandrivers.com/v1.0/getWebCams/")
                .then()
                .statusCode(200)
                .body("name", hasItem(containsString("Cala Ratjada - Port")));
    }
    @Test
    public void testHandWrittenApi() {
        given()
                .when()
                .get("https://api.handwrytten.com/v1/cards/list")
                .then()
                .statusCode(200)
                .body("cards.name", hasItem(containsString("Full Bleed Flat 5x7")));
    }
}
