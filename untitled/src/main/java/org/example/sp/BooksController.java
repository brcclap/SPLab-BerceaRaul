package org.example.sp;

import org.example.sp.commands.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final BooksService booksService;
    private final CommandExecutor commandExecutor;

    @Autowired
    public BooksController(BooksService booksService, CommandExecutor commandExecutor) {
        this.booksService = booksService;
        this.commandExecutor = commandExecutor;
    }

    @GetMapping
    public List<Book> getBooks() {
        Command<List<Book>> cmd = new GetAllBooksCommand(booksService);
        return commandExecutor.execute(cmd);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        Command<Book> cmd = new GetBookByIdCommand(booksService, id);
        return commandExecutor.execute(cmd);
    }

    @PostMapping
    public ResponseEntity<String> createBook(@RequestBody Book book) {
        Command<Book> cmd = new CreateBookCommand(booksService, book);

        commandExecutor.executeAsync(cmd);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Book creation queued.");
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        Command<Book> cmd = new UpdateBookCommand(booksService, id, book);
        return commandExecutor.execute(cmd);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        Command<Void> cmd = new DeleteBookCommand(booksService, id);
        commandExecutor.execute(cmd);
        return ResponseEntity.ok().build();
    }
}