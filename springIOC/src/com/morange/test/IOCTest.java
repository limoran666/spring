package com.morange.test;

import com.morange.servlet.BookServlet;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
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
}
