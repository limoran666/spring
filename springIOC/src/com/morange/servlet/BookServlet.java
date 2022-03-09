package com.morange.servlet;


import com.morange.dao.BookDao;
import com.morange.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/*属性的自动注入
*  @Autowired Spring会自动的为这个属性赋值;
* 一定是去容器中找到这个属性对应的组件
* */
@Controller
public class BookServlet {
    //自动装配 自动的为这个属性赋值
    @Qualifier("bookService")//指定一个名字作为id,让spring别使用变量名作为id
    @Autowired(required = false)//这样的话找不到也不会报错
    private BookService bookServiceExt;

    public void doGet(){
        bookServiceExt.save();
    }
//    方法上有@Autowired的话
    /*这个方法也会在bean创建的时候运行
    * 这个方法上的每一个参数都会自动注入
    * */
    @Autowired
    public void hh(BookDao bookDao,BookService bookService){
        System.out.println("spring运行了方法"+bookDao+bookService);

    }
}
