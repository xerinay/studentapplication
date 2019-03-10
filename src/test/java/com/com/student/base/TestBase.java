package com.com.student.base;

import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {
    @BeforeClass
    public static void init(){
        //http://localhost:8080/student/list
        //set the serverName
        RestAssured.baseURI="http://localhost";
        RestAssured.port=8080;
        RestAssured.basePath="/student";
    }
}
