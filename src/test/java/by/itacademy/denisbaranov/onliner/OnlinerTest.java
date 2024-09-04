package by.itacademy.denisbaranov.onliner;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OnlinerTest extends OnlinerBaseTest {
    @Test
    public void testLogin() {

        given().
                headers(OnlinerLoginPage.getHeaders()).
                body(OnlinerLoginPage.getBody()).
                when().
                post(OnlinerLoginPage.SERVICE_LOGIN).
        then().log().all();
    }
}
