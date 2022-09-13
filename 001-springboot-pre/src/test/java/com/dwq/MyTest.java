package com.dwq;

import com.dwq.config.SpringConfig;
import com.dwq.vo.Cat;
import com.dwq.vo.Student;
import com.dwq.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void MyTest01(){
    String config = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ctx.getBean("MyStudent");
        System.out.println("输出容器中的对象"+student);
    }
@Test
    public void MyTest02(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("CreatStudent");
        System.out.println("使用javaconfig输出创建的bean对象"+student);
    }

    @Test
    public void MyTest03(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("xiaodai");
        System.out.println("使用javaconfig输出创建的bean对象"+student);
    }

    @Test
    public void MyTest04(){
        String config = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Cat cat = (Cat) ctx.getBean("myCat");
        System.out.println(cat);
    }

    @Test
    public void MyTest05(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat = (Cat) ctx.getBean("myCat");
        System.out.println(cat);
    }

    @Test
    public void MyTest06(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Tiger tiger = (Tiger) ctx.getBean("tiger");
        System.out.println(tiger);
    }
}
