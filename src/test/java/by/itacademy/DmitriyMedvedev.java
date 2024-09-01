package by.itacademy;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class DmitriyMedvedev {

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
                .body("bookingid", hasItem(124));
    }

    @Test
    public void testOceanRiversApi() {
        given()
                .when()
                .get("http://api.oceandrivers.com/v1.0/getWebCams/")
                .then()
                .statusCode(200)
                .body("name", hasItem(containsString("Cala Agulla")));
    }

    @Test
    public void testHandwryttenApi() {
        given()
                .when()
                .get("https://api.handwrytten.com/v1/cards/list")
                .then()
                .statusCode(200)
                .body("cards.name", hasItem(containsString("Llama Party")));
    }
}
