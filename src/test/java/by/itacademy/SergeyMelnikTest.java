package by.itacademy;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

public class SergeyMelnikTest {

    @Test
    public void testGetDemoqaStatusCode() {
        when().
                get("https://demoqa.com/BookStore/v1/Books").
                then().
                //log().all().
                statusCode(200).
                //body("books[0].title", equalTo("Git Pocket Guide"));
                body("books.title", hasItem(containsStringIgnoringCase("git")));
    }

    @Test
    public void testGetRestfulBookerStatusCode() {
        when().
                get("https://restful-booker.herokuapp.com/booking").
                then().
                //log().body().
                statusCode(200).assertThat().body("bookingid", hasItem(515));

    }


    @Test
    public void testGetApiOceanDriversCodeStatus() {
        when().
                get("http://api.oceandrivers.com/v1.0/getWebCams/").
                then().
                //log().all().
                assertThat().
                statusCode(200).body("name", hasItem(containsStringIgnoringCase("Cala Agulla")));
    }


    @Test
    public void testGetHandWrytten() {
        when().
                get("https://api.handwrytten.com/v1/cards/list").
                then().
                //log().body().
                assertThat().
                statusCode(200).
                //body("cards.name", hasItem(containsStringIgnoringCase("Flat 5x7 Card")));
                body("cards.find{it.name=='Flat 5x7 Card'}.name", equalTo("Flat 5x7 Card"));

    }

}
