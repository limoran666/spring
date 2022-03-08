package com.morange.servlet;


import com.morange.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
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
}
