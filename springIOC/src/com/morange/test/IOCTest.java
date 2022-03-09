package com.morange.test;

import com.morange.service.BaseService;
import com.morange.service.BookService;
import com.morange.service.UserService;
import com.morange.servlet.BookServlet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*使用spring的单元测试
* @ContextConfiguration(locations="classpath:")
* @RunWith()指定用哪种驱动进行单元测试 默认是junit
* @RunWith(SpringJUnit4ClassRunner.class)
* 使用spring的测试驱动来测试
* 好处：我们不用ioc.getBean获取组件了 直接Autowired组件 Spring 为我们自动装配
* */
/*@ContextConfiguration(locations="classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)*/
public class IOCTest {
    ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
   // ApplicationContext ioc=null;
/*    @Autowired
    BookServlet bookServlet;
    @Autowired
    BookService bookService;
    @Autowired
    BaseService BaseService;*/
/*使用注解加入到容器中的组件，和使用配置加入到容器中的组件行为都是默认一样的
* 1.组件的id 默认就是组件的类名首字母小写
* 2.组件的作用域,默认单例的
* @Repository("bookdaohaha")
public class BookDao {
}
@Scope(value="prototype")//变成多实例
public class BookDao {
}
*
* */
//    @Test
//    public void test6(){
//        System.out.println(bookServlet);
//
//    }
    @Test
    public void test(){
        Object bookDao = ioc.getBean("bookdaohaha");
        Object bookDao2 = ioc.getBean("bookdaohaha");
        System.out.println(bookDao==bookDao2);//true

    }
    @Test
    public void test1(){
        BookServlet bookServlet = ioc.getBean(BookServlet.class);
        bookServlet.doGet();
    }
    @Test
    public void test2(){
        BookService bookService = ioc.getBean(BookService.class);
        UserService userService = ioc.getBean(UserService.class);
        //父类的类型 com.morange.service.BaseService
        //带泛型的父类 com.morange.service.BaseService<com.morange.bean.Book>
        //spring中可以带父类类型来确定这个子类的类型
        bookService.save();
        userService.save();
        System.out.println(bookService.getClass().getGenericSuperclass());
    }
}
