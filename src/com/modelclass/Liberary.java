package com.modelclass;

import java.util.List;

public class Liberary {
    public List<Book> books;

    public boolean AddBook(Book book){
        books.add(book);
        return true;

    }
}
