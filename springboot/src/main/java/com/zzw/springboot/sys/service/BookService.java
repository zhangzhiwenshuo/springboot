package com.zzw.springboot.sys.service;

import com.zzw.springboot.sys.entity.Book;
import com.zzw.springboot.sys.mapper.ESBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Slf4j
@Service
public class BookService {

    @Autowired
    private  ESBookRepository esBookRepository;
    @Autowired
    private  TransactionTemplate transactionTemplate;


    public void addBook(Book book) {
        final Book saveBook = transactionTemplate.execute((status) ->
                esBookRepository.save(book)
        );
        final Book esBook = new Book();
        assert saveBook != null;
        BeanUtils.copyProperties(saveBook, esBook);
        esBook.setId(saveBook.getId() + "");
        try {
            esBookRepository.save(esBook);
        }catch (Exception e){
            log.error(String.format("保存ES错误！%s", e.getMessage()));
        }
    }

    public List<Book> searchBook(String keyword){
        return esBookRepository.findByTitleOrAuthor(keyword, keyword);
    }

    public SearchHits<Book> searchBook1(String keyword){
        return esBookRepository.find(keyword);
    }
}