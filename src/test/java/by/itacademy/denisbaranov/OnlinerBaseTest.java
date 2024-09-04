package by.itacademy.denisbaranov;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class OnlinerBaseTest {

    @BeforeEach
    public void setUpBaseURL() {
        RestAssured.baseURI= "https://www.onliner.by/sdapi/user.api";
    }
}
