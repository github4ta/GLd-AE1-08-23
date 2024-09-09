package by.itacademy.zinkoanton;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OnlinerTest {

        @Test
        public void testLogin() {
            given()
                    .header("Content-Type", "application/json;charset=UTF-8")
                    .body("{\"login\":\"1\",\"password\":\"1\"}")
                    .when()
                    .post("https://www.onliner.by/sdapi/user.api/login")
                    .then()
                    .log().all();
        }
}
