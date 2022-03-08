package com.morange.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/*id默认就是类名首字母小写*/
@Repository()
//@Scope(value="prototype")//变成多实例
public class BookDao {
/*
    @Autowired
    private DataSource dataSource;
*/


    public void saveBook(){
       // dataSource.getConnection();
        System.out.println("图书已经保存...");
    }

}
