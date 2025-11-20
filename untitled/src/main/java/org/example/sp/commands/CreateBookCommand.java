package org.example.sp.commands;

import org.example.sp.Book;
import org.example.sp.BooksService;
import org.example.sp.Command;

public class CreateBookCommand implements Command<Book> {
    private final BooksService service;
    private final Book bookToCreate;

    public CreateBookCommand(BooksService service, Book book) {
        this.service = service;
        this.bookToCreate = book;
    }

    @Override
    public Book execute() {
        return service.save(bookToCreate);
    }
}