package com.zun.springin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(
                new Book(1, "Mastering Spring 5.0", "Ranga Karana")
        );
    }

}
