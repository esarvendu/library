package com.test.firstsprinapp;

public class Book  extends Author{
    private int pages;

    public Book(int age, String name, String gender, double rating, int pages) {
        super(age, name, gender, rating);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
