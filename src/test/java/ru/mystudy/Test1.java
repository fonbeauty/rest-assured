package ru.mystudy;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test1 {
    @Test
    public void test1() {

        RestAssured.baseURI = "https://swapi.co/";

        RequestSpecification requestSpecification = new RequestSpecBuilder()
//                .setBaseUri("https://swapi.co/")
                .log(LogDetail.ALL)
                .build();


        ResponseSpecification responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200).build();

        RestAssured.responseSpecification = responseSpecification;

        given().spec(requestSpecification)
            .when().get("api/people/1");
//            .then().log().all().statusCode(200);



    }

}
