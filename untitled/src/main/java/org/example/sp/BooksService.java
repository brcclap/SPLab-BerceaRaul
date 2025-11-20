package org.example.sp;

import org.example.sp.persistence.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    public Book findById(Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    public Book save(Book book) {
        return booksRepository.save(book);
    }

    public Book update(Long id, Book bookToUpdate) {
        Book foundBook = booksRepository.findById(id).orElse(null);
        if (foundBook != null) {
            foundBook.setTitle(bookToUpdate.getTitle());
            return booksRepository.save(foundBook);
        }
        return null;
    }

    public void delete(Long id) {
        booksRepository.deleteById(id);
    }
}