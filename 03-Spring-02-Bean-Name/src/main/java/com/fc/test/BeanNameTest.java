package com.fc.test;

import com.fc.entity.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanNameTest {
//    @Test
//    public void testId() {
//        // 获取容器
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Student student =(Student) applicationContext.getBean("嗨");
//
//
//        System.out.println(student);
//    }


//    @Test
//    public void testId(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Student student = (Student) applicationContext.getBean("student2");
//
//        System.out.println(student);
//    }


//    @Test
//    public void testId(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Student student =(Student) applicationContext.getBean("小绿");
//
//        System.out.println(student);
//    }

    @Test
    public void testId(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

      Student student=(Student)  applicationContext.getBean("嗨");

        System.out.println(student);
    }
}
