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

    /**
     * curl -H "Content-Type:application/json" -XPOST http://localhost:8080/book -d
     * {
     *     "id":"1",
     *     "title":"富婆通讯录",
     *     "author":"耿小李",
     *     "price":9999.9,
     *     "createTime":"2020/12/21 12:00:00"
     * }
     * ————————————————
     * 版权声明：本文为CSDN博主「Cloud-Future」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/gybshen/article/details/111469217
     * @param book
     * @return
     */
    @PostMapping("/book")
    public Map<String,String> addBook(@RequestBody Book book){
        bookService.addBook(book);
        Map<String,String> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }

    /**
     * http://localhost:8080/book/search?key=%E5%AF%8C%E5%A9%86
     * @param key
     * @return
     */
    @GetMapping("/book/search")
    public SearchHits<Book> search(String key){
        return bookService.searchBook1(key);
    }
}

