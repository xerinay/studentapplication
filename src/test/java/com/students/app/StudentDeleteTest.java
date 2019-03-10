package com.students.app;

import com.com.student.base.TestBase;
import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {

    @Test
    public void deleteStudent(){
        given()
                .when()
                .delete("/102")
                .then()
                .statusCode(204);

    }
}
