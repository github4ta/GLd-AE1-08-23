package by.itacademy;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

public class PavelYatsevichTest {

    @Test
    public void testAPI_1() {
        baseURI = "https://demoqa.com/BookStore/v1/";
        when()
                .get("Books")
                .then()
                .statusCode(200)
                .body(containsString("Git"));
    }

    @Test
    public void testAPI_2() {
        baseURI = "https://restful-booker.herokuapp.com/";
        when()
                .get("booking")
                .then()
                .statusCode(200)
                .body("bookingid", hasItem(equalTo(1168)));
    }

    @Test
    public void testAPI_3() {
        baseURI = "http://api.oceandrivers.com/v1.0/";
        when()
                .get("getWebCams/")
                .then()
                .statusCode(200)
                .body("name", hasItem(equalTo("Cala Agulla")));
    }

    @Test
    public void testAPI_4() {
        baseURI = "https://api.reverb.com/api/";
        when()
                .get("articles")
                .then()
                .statusCode(403)
                .body("Error", equalTo("Reverb does not currently support transactions from your location."));
    }

    @Test
    public void testAPI_5() {
        baseURI = "https://api.handwrytten.com/v1/";
        when()
                .get("cards/list/")
                .then()
                .statusCode(200)
                .body("cards.name", hasItem(equalTo("Flat 5x7 Card")));
    }
}
