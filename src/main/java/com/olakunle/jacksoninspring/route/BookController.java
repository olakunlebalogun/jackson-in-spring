package com.olakunle.jacksoninspring.route;

import com.olakunle.jacksoninspring.model.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/books")
@Slf4j
public class BookController {

    @PostMapping
    public ResponseEntity<Book> addStudent(@RequestBody Book request) {
        log.info("Reference Object: {}", request);
        return new ResponseEntity<>(request, HttpStatus.OK);
    }
}
