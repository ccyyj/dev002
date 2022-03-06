package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
//    @Test
//    public void testGreaterThan() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findGreaterThanAge(3);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
  //  }







//@Test
//public void testGreaterThan(){
//    try {
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession session = factory.openSession();
//
//        StudentDao studentDao = session.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findByLessThanAge(20);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        session.commit();
//
//        session.close();
//
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}







//    @Test
//    public void testGreaterThan(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findGreaterThanAge(30);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//
//
//        }
//    }









//    @Test
//    public void testGreaterThan(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession sqlSession = factory.openSession();
//
//            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findGreaterThanAge(35);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            sqlSession.commit();
//
//            sqlSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }







//    @Test
//    public void testGreaterThan(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession sqlSession = factory.openSession();
//
//            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findGreaterThanAge(40);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            sqlSession.commit();
//
//            sqlSession.close();
//
//        } catch (IOException e) {
//
//        }
//    }
//








//   @Test
//   public void testGreaterThan(){
//       try {
//           InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//           SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//           SqlSession sqlSession = factory.openSession();
//
//           StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//
//           List<Student> students = studentDao.findGreaterThanAge(35);
//
//           for (Student student : students) {
//               System.out.println(student);
//           }
//
//           sqlSession.commit();
//
//           sqlSession.close();
//       } catch (IOException e) {
//           e.printStackTrace();
//       }
//   }







    @Test
    public void testGreaterThan(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession sqlSession = factory.openSession();

            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);

            List<Student> students = studentDao.findGreaterThanAge(60);

            for (Student student : students) {
                System.out.println(student);
            }

            sqlSession.commit();

            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }










//    @Test
//    public void testLessThan() {
//        // 读取配置文件
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            // 构建会话工厂
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            // 获取会话连接
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByLessThanAge(3);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }




//    @Test
//    public void testLessThan(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession sqlSession = factory.openSession();
//
//            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByLessThanAge(31);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//            sqlSession.commit();
//
//            sqlSession.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }






//    @Test
//    public void testLessThan(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession sqlSession = sessionFactory.openSession();
//
//            StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//
//
//            List<Student> students = studentDao.findByLessThanAge(20);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            sqlSession.commit();
//
//            sqlSession.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }






//    @Test
//    public void testLessThan(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByLessThanAge(15);
//
//            for (Student student : students) {
//                System.out.println(student);
//            }
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }



//@Test
//    public void testLessThan(){
//    try {
//        //依赖
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
////会话工厂
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
////连接
//        SqlSession sqlSession = factory.openSession();
////映射
//        StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findByLessThanAge(90);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//        sqlSession.commit();
//
//        sqlSession.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//}





    @Test
    public void testLessThan(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findByLessThanAge(54);

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
