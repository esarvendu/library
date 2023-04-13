package com.test.firstsprinapp;


import org.springframework.beans.factory.annotation.Autowired;

@RestController
@Restmapping
public class BookController {

    @Autowired


    BookService bookService;

    @postMapping("/add-book")
    public String addBook(@RequestBodyBook book) {

        return bookService.addBook();
    }

    @PutMapping("/update-book")
    public String updateBookByPage(@RequestParam String name, @RequestPram int page) {
        return bookService.addPage((name, page));
    }


    @GetMapping("/get-author")
    public Author getAuthorByPages() {
        return bookService.getAuthorByPage();
    }

}




}
