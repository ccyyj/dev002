package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class CacheTest {
//    @Test
//    public void testTwo() {
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            System.out.println("第一次查询");
//            studentDao.findById(1);
//
//            session.commit();
//
//            System.out.println("第二次查询");
//            studentDao.findById(1);
//
//            Student student = new Student();
//            student.setId(2);
//            student.setInfo("测试缓存");
//
//            studentDao.update(student);
//            session.commit();
//
//            SqlSession session1 = factory.openSession();
//
//            StudentDao studentDao1 = session1.getMapper(StudentDao.class);
//
//            System.out.println("第三次查询");
//            studentDao1.findById(1);
//            session1.commit();
//
//            System.out.println("第四次查询");
//            studentDao1.findById(1);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//@Test
//public void testTwo(){
//    try {
//        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//        SqlSession session = factory.openSession();
//
//        StudentDao studentDao = session.getMapper(StudentDao.class);
//
//        System.out.println("第一次查询");
//        studentDao.findById(3);
//
//        session.commit();
//
//        System.out.println("第二次查询");
//        studentDao.findById(3);
//
//        Student student = new Student();
//        student.setId(1);
//        student.setInfo("测试缓存");
//
//        studentDao.update(student);
//
//        session.commit();
//
//        SqlSession session1 = factory.openSession();
//
//        StudentDao mapper = session1.getMapper(StudentDao.class);
//
//        System.out.println("第三次查询");
//        mapper.findById(3);
//        session1.commit();
//
//        System.out.println("第四次查询");
//        mapper.findById(3);
//
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}

//    @Test
//    public void testTwo(){
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            System.out.println("第一次查询");
//            studentDao.findById(1);
//            session.commit();
//
//            System.out.println("第二次查询");
//            studentDao.findById(1);
//
//            Student student = new Student();
//            student.setId(2);
//            student.setInfo("测试缓存");
//
//            studentDao.update(student);
//            session.commit();
//
//            SqlSession session1 = factory.openSession();
//
//            StudentDao studentDao1 = session1.getMapper(StudentDao.class);
//
//            System.out.println("第三次查询");
//            studentDao1.findById(1);
//            session1.commit();
//
//            System.out.println("第四次查询");
//            studentDao1.findById(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    @Test
    public void testTwo(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            System.out.println("第一次查询");
            studentDao.findById(1);

            session.commit();

            System.out.println("第二次查询");
            studentDao.findById(1);

            Student student = new Student();

            student.setId(2);
            student.setInfo("测试缓存");

            studentDao.update(student);
            session.commit();

            SqlSession session1 = factory.openSession();

            StudentDao studentDao1 = session1.getMapper(StudentDao.class);

            System.out.println("第三次查询");
            studentDao1.findById(1);
            session1.commit();

            System.out.println("第四次查询");
            studentDao1.findById(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

















//    @Test
//    public void testClearCache() {
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student1 = studentDao.findById(1);
//
//            // 修改操作
//            Student student = new Student();
//            student.setId(2);
//            student.setInfo("30");
//            studentDao.update(student);
//
//            Student student2 = studentDao.findById(1);
//
//            System.out.println(student1 == student2);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testClearCache(){
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student1 = studentDao.findById(3);
//
//            Student student = new Student();
//            student.setId(3);
//            student.setInfo("呜哈哈哈~~~");
//            studentDao.update(student);
//
//            Student student2 = studentDao.findById(3);
//
//            System.out.println(student1 == student2);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testClearCache(){
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student1 = studentDao.findById(4);
//
//            Student student = new Student();
//            student.setId(1);
//            student.setInfo("你好哇，胖头鱼");
//            studentDao.update(student);
//
//            Student student2 = studentDao.findById(4);
//
//            System.out.println(student1 == student2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testClearCache(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student1 = studentDao.findById(5);

            Student student = new Student();
            student.setId(1);
            student.setInfo("法外狂徒");
            studentDao.update(student);

            Student student2 = studentDao.findById(5);

            System.out.println(student1 == student2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }















//    @Test
//    public void testOne() {
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session1 = factory.openSession();
//            SqlSession session2 = factory.openSession();
//
//            StudentDao studentDao1 = session1.getMapper(StudentDao.class);
//            StudentDao studentDao2 = session2.getMapper(StudentDao.class);
//
//            Student student1 = studentDao1.findById(1);
//
//            // 清空缓存
//            //session.clearCache();
//
//            Student student2 = studentDao2.findById(1);
//
//            System.out.println(student1 == student2);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//    @Test
//    public void testOne(){
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session1 = factory.openSession();
//            SqlSession session2 = factory.openSession();
//
//            StudentDao studentDao1 = session1.getMapper(StudentDao.class);
//            StudentDao studentDao2 = session2.getMapper(StudentDao.class);
//
//            Student student1 = studentDao1.findById(3);
//
//            Student student2 = studentDao2.findById(3);
//
//            System.out.println(student1 == student2);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testOne(){
//        try {
//            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
//
//            SqlSession session1 = factory.openSession();
//            SqlSession session2 = factory.openSession();
//
//            StudentDao studentDao1 = session1.getMapper(StudentDao.class);
//            StudentDao studentDao2 = session2.getMapper(StudentDao.class);
//
//            Student student1 = studentDao1.findById(5);
//            Student student2 = studentDao2.findById(5);
//
//            System.out.println(student1 == student2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    @Test
    public void testOne(){
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session1 = factory.openSession();
            SqlSession session2 = factory.openSession();

            StudentDao studentDao1 = session1.getMapper(StudentDao.class);
            StudentDao studentDao2 = session2.getMapper(StudentDao.class);

            Student student1 = studentDao1.findById(7);
            Student student2 = studentDao2.findById(7);

            System.out.println(student1 == student2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
