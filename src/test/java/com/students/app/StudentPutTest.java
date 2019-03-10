package com.students.app;

import com.com.student.base.TestBase;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.student.model.Student;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static com.jayway.restassured.RestAssured.given;

public class StudentPutTest extends TestBase {

    @Test
    public void updateStudent(){
        ArrayList<String> courses=new ArrayList<String>();
        courses.add("java");
        courses.add("selenium");
courses.add("SQL");
        Student student=new Student();
        student.setFirstName("Mark");
        student.setLastname("Taylor");
        student.setEmail("test@gmail.com");
        student.setProgramme("Computer Sceince");
        student.setCourses(courses);

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(student)
                .put("/102")
                .then()
                .statusCode(200 );
    }
}
