package org.example.sp.commands;

import org.example.sp.Book;
import org.example.sp.BooksService;
import org.example.sp.Command;

public class GetBookByIdCommand implements Command<Book> {
    private final BooksService service;
    private final Long id;

    public GetBookByIdCommand(BooksService service, Long id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public Book execute() {
        return service.findById(id);
    }
}