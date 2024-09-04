package by.itacademy.melniksergey.onliner;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;

public class OnlinerBaseTest {

    public static String BASE_URL = "";

    @BeforeEach
    public void setBaseUrl(){
        RestAssured.baseURI = "https://www.onliner.by";
    }


}
