package org.example.sp.commands;

import org.example.sp.Book;
import org.example.sp.BooksService;
import org.example.sp.Command;
import java.util.List;

public class GetAllBooksCommand implements Command<List<Book>> {
    private final BooksService service;

    public GetAllBooksCommand(BooksService service) {
        this.service = service;
    }

    @Override
    public List<Book> execute() {
        return service.findAll();
    }
}