package com.morange.service;

import com.morange.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceExt extends BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("bookServiceExt");
    }
}
