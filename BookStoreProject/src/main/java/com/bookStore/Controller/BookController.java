package com.bookStore.Controller;

import com.bookStore.Bean.Book;
import com.bookStore.Repository.BookRepository;
import com.bookStore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RequestMapping(path = "Books")
@RestController
public class BookController {

    @Autowired
    BookService bookService;
    private byte[] bytes;

    @GetMapping("/getallbooks")
    List<Book> getBookAllBook() {
        List<Book> bookList = bookService.getBookAllBook();
        return bookList;
    }
    @PostMapping("/upload")
    public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
        this.bytes = file.getBytes();
    }

    @PostMapping("/addbook")
    Book addBook(@RequestBody Book book){

        return bookService.addBook(book);
    }

    @DeleteMapping("/deletebook/{bookid}")
    void deleteBook(@PathVariable("bookid") long bookid)  {
        bookService.deleteBook(bookid);
    }

    @PutMapping("/updatebook")
    Book updateBook(@RequestBody Book book) {

        return bookService.updateBook(book);
    }}