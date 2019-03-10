package com.students.app;

import com.com.student.base.TestBase;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.student.model.Student;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static com.jayway.restassured.RestAssured.given;

public class StudentPostTest extends TestBase {

@Test
    public void createNewStudent(){
    ArrayList<String>courses=new ArrayList<String>();
    courses.add("java");
    courses.add("selenium");

    Student student=new Student();
    student.setFirstName("tei");
    student.setLastname("hegde");
    student.setEmail("test@gmail.com");
    student.setProgramme("Computer Sceince");
    student.setCourses(courses);

    given()
            .contentType(ContentType.JSON)
            .when()
            .body(student)
            .post()
            .then()
            .statusCode(500 );
}
}
