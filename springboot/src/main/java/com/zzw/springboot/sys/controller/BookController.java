package com.zzw.springboot.sys.controller;

import com.zzw.springboot.sys.entity.Book;
import com.zzw.springboot.sys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class BookController {

    @Autowired
    private  BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/book")
    public Map<String,String> addBook(@RequestBody Book book){
        bookService.addBook(book);
        Map<String,String> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }

    @GetMapping("/book/search")
    public SearchHits<Book> search(String key){
        return bookService.searchBook1(key);
    }
}

