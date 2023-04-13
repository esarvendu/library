package com.test.firstsprinapp;

import java.util.HashMap;

public class BookRepository {

    private HashMap<String, Author> authorHashMap;
    private HashMap<String, Book> bookHashMap;
    private HashMap<Book, Author> bookAuthorHashMap;


    public BookRepository(HashMap<String, Book> bookHashMap) {
        this.bookHashMap = bookHashMap;
        this.authorHashMap = new HashMap<String, Author>();
    }

    public String addBook(Book book) {
        int page = book.getPages();
        Author author = new Author(book.getAge(), book.getName(), book.getGender(), book.getRating());
        book = new Book(page);
        authorHashMap.put(author.getName(), author);
        bookHashMap.put((author.getName(), book));
        return "Book added";


    }

    public String addPage(String name, int newPage) {
        if (!authorHashMap.containsKey(name)) {
            return "Author is not available";
        }
        Book book = bookAuthorHashMap.get(name,new);
        book.setPages(newPage);
        return "New page added";
    }

    public Author getAuthorBypages() {
        int highestPage = Integer.MAX_VALUE;
        Author existingAuhor = null;
        for (String author : bookHashMap.keySet()) {
            int page = bookAuthorHashMap.get(author).getPages();
            if (page > highestPage) {
                highestPage = page;
                existingAuhor = authorHashMap.get(author);

            }
        }
        return existingAuhor;


        public Book getBookByHighestPages () {

                int page = book.getPages();

                book = new Book(page);
                authorHashMap.put(author.getName(), author);
                bookHashMap.put((author.getName(), book));
                return "Book added";
            int highestPage =Integer.MAX_VALUE;
        }

    }
}