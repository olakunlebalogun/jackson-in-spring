package com.olakunle.jacksoninspring.route;


import com.olakunle.jacksoninspring.model.Book;
import com.olakunle.jacksoninspring.model.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/route")
@Slf4j
public class DemoController {

    @GetMapping
    public ResponseEntity<Student> getStudent() {
        return new ResponseEntity<>(new Student("1", "Olakunle", "Electromagnetic","2345","ola247", "Unilorin"), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student request) {
        log.info("Reference Object: {}", request);
        return new ResponseEntity<>(request, HttpStatus.OK);
    }

}
