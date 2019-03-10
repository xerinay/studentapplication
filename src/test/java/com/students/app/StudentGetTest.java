package com.students.app;

import com.com.student.base.TestBase;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class StudentGetTest extends TestBase {

    @Test

    public void getAllStudentInformation() {
        /*
         * given()
         * .when()- all the actions done after the when method like post,put,patch,delete
         * .then()-validate status code
         */
        Response response =given()
                .when()
                .get("/list");

        //to get the body
        System.out.println(response.body().prettyPrint());
        //validate the status code
        given()

                .when()
                .get("/list")
                .then()
                .statusCode(200);
    }
    @Test
    public void getStudentInfo(){
        Response response=given()
         .when()
         .get("/1");
       // System.out.println(response.body().prettyPrint());
        given()
        .when()
                .get("/1")
                .then()
                .statusCode(200);
    }
    @Test
    public void getStudentsFromFA(){
       Response response2= given()
                .when()
                .get("/list?programme=Financial Analysis&limit=2");
       // System.out.println(response.body().prettyPrint());
        given()
        .param("programme", "Financial Analysis")
                .param("limit",2)
                .when()
                .get("/list");
         System.out.println(response2.body().prettyPrint());

    }
}

