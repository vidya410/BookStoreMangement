package com.bookStore.Service;

import com.bookStore.Bean.Book;
import com.bookStore.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> getBookAllBook() {
        List<Book> booklist = new ArrayList<Book>();
        repository.findAll().forEach(x -> booklist.add(x));
        return booklist;
    }

    public Book getBook(long bookid) {
        return repository.findById(bookid).get();
    }

    public Book addBook(Book book) {
        Book b = repository.save(book);
        return b;
    }

    public Book updateBook(Book book) {
        Book b = repository.save(book);
        return b;
    }

    public void deleteBook(long bookid) {
        repository.deleteById(bookid);
    }

}

