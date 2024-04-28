package com.olakunle.jacksoninspring.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Student implements Serializable {

    // Note: Using the @JsonProperty as such, the Response the student_id instead of id
//        Also, the Request, if id or student_id is passed as the JSON property key, the internal entity will have id as its property name;
//            check the log in the controller ln:24
    @JsonProperty(value = "student_id")
    private String id;
    private String name;
// Note: Say for instance you want to ignore a property as both a request and response, use @JsonIgnore
//     And say you have a lot of these properties, use the class-level annotation @JsonIgnoreProperties
    @JsonIgnore
    private String favoriteCourse;
//    private String lastname;
//    private String username;
// Note: The property here (randomNumber) is supposed to be set internally. Therefore, irrespective of the value set
//    in the request, it will be when logged. This property can on be returned as a response, hence READ_ONLY.
//    So since it wasn't see, it returns a NULL value.
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String randomNumber;
// Note: The property here is set to WRITE_ONLY, such that it can only be written to or set from the request,
//    but will not be read as response. Therefore that property will be missing from the response
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String school;
}
