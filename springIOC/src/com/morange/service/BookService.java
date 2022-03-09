package com.morange.service;

import com.morange.bean.Book;
import com.morange.dao.BaseDao;
import com.morange.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BaseService<Book>{
/*    @Autowired
    private BookDao bookDao;

    public void save(){
        System.out.println("bookservice正在调用dao帮你保存图书");
        bookDao.save();
    }*/



}
