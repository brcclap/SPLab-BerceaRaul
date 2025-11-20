package org.example.sp.commands;

import org.example.sp.Book;
import org.example.sp.BooksService;
import org.example.sp.Command;

public class UpdateBookCommand implements Command<Book> {
    private final BooksService service;
    private final Long id;
    private final Book bookToUpdate;

    public UpdateBookCommand(BooksService service, Long id, Book book) {
        this.service = service;
        this.id = id;
        this.bookToUpdate = book;
    }

    @Override
    public Book execute() {
        return service.update(id, bookToUpdate);
    }
}