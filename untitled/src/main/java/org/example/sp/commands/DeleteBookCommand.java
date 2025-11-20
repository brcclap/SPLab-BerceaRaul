package org.example.sp.commands;

import org.example.sp.BooksService;
import org.example.sp.Command;

public class DeleteBookCommand implements Command<Void> {
    private final BooksService service;
    private final Long id;

    public DeleteBookCommand(BooksService service, Long id) {
        this.service = service;
        this.id = id;
    }

    @Override
    public Void execute() {
        service.delete(id);
        return null;
    }
}