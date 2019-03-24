package ru.mystudy;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test1 {
    @Test
    public void test1() {
        given().baseUri("https://swapi.co/")
            .when().get("api/people/1")
            .then().statusCode(200);



    }

}
