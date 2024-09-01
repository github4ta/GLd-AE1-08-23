package by.itacademy;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.Matchers.*;

public class AndreiUnuchakTest {

    @Test
    public void testAPI1(){
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RestAssured
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .body("books.title", hasItem(containsStringIgnoringCase("git")));
    }

    @Test
    public void testAPI2(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        RestAssured
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .body("bookingid", hasItem(equalTo(getUniqueBookingID())));
    }

    @Test
    public void testAPI3(){
        RestAssured.baseURI = "http://api.oceandrivers.com/v1.0/getWebCams";
        RestAssured
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .body("name", hasItem(equalTo("Cala Agulla")));
    }

    @Test
    public void testAPI4(){
        RestAssured.baseURI = "https://api.reverb.com/api/articles";
        RestAssured
                .given()
                .header("accept-version", "3.0")
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .body("articles.author_name", hasItem(equalTo("Mark Brend")));
    }

    @Test
    public void testAPI5(){
        RestAssured.baseURI = "https://api.reverb.com/api/articles";
        RestAssured
                .when()
                .get("/")
                .then()
                .statusCode(400);
    }

    @Test
    public void testAPI6(){
        RestAssured.baseURI = "https://api.handwrytten.com/v1/cards/list";
        RestAssured
                .when()
                .get("/")
                .then()
                .statusCode(200)
                .body("cards.name", hasItem(equalTo("Flat 5x7 Card")));
    }

    private int getUniqueBookingID(){
        Response response = RestAssured
                .when()
                .get("/");
        List<Integer> bookingIDs = response.body().jsonPath().getList("bookingid");
        HashSet<Integer> uniqueBookingIDs = new HashSet<>();
        List<Integer> duplicatedBookingIDs = new ArrayList<>();
        bookingIDs.forEach(n -> {if(!uniqueBookingIDs.add(n)){
            duplicatedBookingIDs.add(n);
        }});
        int uniqueBookingID = -1;
        for(int bookingID: bookingIDs){
            if(!duplicatedBookingIDs.contains(bookingID)){
                uniqueBookingID=bookingID;
                break;
            }
        }
        return uniqueBookingID;
    }
}
