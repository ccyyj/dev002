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
import java.util.List;

public class MyBatisTest {
//    @Test
//    public void testFindById() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findById("1 or 1 = 1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



//    @Test
//    public void testFindById(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findById("3 or 1=1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



//    @Test
//    public void testFingById(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findById("8 or 1 = 1");
//
//            for (Student student : students) {
//                System.out.println(students);
//            }
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }




//    @Test
//    public void testByLessId(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findById("7 or 1 = 1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }




//    @Test
//    public void testByLessId(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findById("16 or 1 = 1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



    @Test
    public void testByLessId(){
        try {
            //依赖
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            //工厂
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            //连接
            SqlSession session = factory.openSession();

            //映射
            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findById("50 or 1 = 1");

            for (Student student : students) {
                System.out.println(student);
            }
            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }













//    @Test
//    public void testFindByAge() {
//        SqlSession session = null;
//
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByAge("30 or 1 = 1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            session.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//            session.rollback();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//    }



//    @Test
//    public void testFindByAge(){
//        SqlSession session = null;
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//           session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByAge("50 or 1= 1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



//    @Test
//    public void testFindByAge(){
//        SqlSession session = null;
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//           session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByAge("10 or 1 = 1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



//    @Test
//    public void testFindByAge(){
//        SqlSession session = null;
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//           session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByAge("20 or 1 = 1");
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    @Test
    public void testFindByAge(){
        SqlSession session = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

           session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findByAge("80 or 1 = 1");

            for (Student student : students) {
                System.out.println(student);
            }
            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

