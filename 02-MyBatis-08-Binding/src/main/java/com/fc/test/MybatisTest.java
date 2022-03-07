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
import java.util.HashMap;

public class MybatisTest {
//    @Test
//    public void testInsertOnObject(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = new Student();
//
//            student.setName("小白");
//            student.setAge((byte)30);
//            student.setGender("男");
//            student.setInfo("《开端》");
//
//            int affectedRows = studentDao.insertStudent(student);
//
//            System.out.println("受影响的行数："+affectedRows);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testInsertOnObject(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = new Student();
//
//            student.setName("赵金麦");
//            student.setAge((byte)20);
//            student.setGender("女");
//            student.setInfo("《少年派》");
//
//            int affectedRows = studentDao.insertStudent(student);
//
//            System.out.println("受影响的行数："+affectedRows);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testInsertOnObject(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = new Student();
//            student.setName("刘奕君");
//            student.setAge((byte)45);
//            student.setGender("男");
//            student.setInfo("《开端》");
//
//            int affectedRows = studentDao.insertStudent(student);
//
//            System.out.println("受影响的行数："+affectedRows);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    @Test
    public void testInsertOnObject(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = new Student();

            student.setName("小赵");
            student.setAge((byte)32);
            student.setGender("女");
            student.setInfo("《谁是凶手》");

            int affectedRows = studentDao.insertStudent(student);

            System.out.println("受影响的行数："+affectedRows);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }














//    @Test
//    public void testInsert(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            HashMap<Object, Object> hashMap = new HashMap<>();
//            hashMap.put("name","小冯");
//            hashMap.put("age",(byte)42);
//            hashMap.put("gender","男");
//            hashMap.put("info","《知否知否》");
//
//            int affectedRows = studentDao.insert(hashMap);
//
//            System.out.println("受影响的行数："+affectedRows);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testInsert(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            HashMap<Object, Object> map = new HashMap<>();
//
//            map.put("name","张佳宁");
//            map.put("age",(byte)32);
//            map.put("gender","女");
//            map.put("info","《一闪一闪亮星星》");
//
//            int affectedRows = studentDao.insert(map);
//
//            System.out.println("受影响的行数："+affectedRows);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testInsert(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            HashMap<Object, Object> map = new HashMap<>();

            map.put("name","张婧仪");
            map.put("age",(byte)25);
            map.put("gender","女");
            map.put("info","《我要我们在一起》");

            int affectedRows = studentDao.insert(map);

            System.out.println("受影响的行数："+affectedRows);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }












//    @Test
//    public void testFindByGenderAndName(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByGenderAndName("男", "小冯");
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testFindByGenderAndName(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByGenderAndName("女", "张精仪");
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testFindByGenderAndName(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByGenderAndName("女", "张佳宁");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }











//    @Test
//    public void testFindByAgeAndName(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByAgeAndName(100, "魔仙女王");
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testFindByAgeAndName(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByAgeAndName(20, "赵金麦");
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testFindByAgeAndName(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByAgeAndName(30, "小白");
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testFindByAgeAndName(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByAgeAndName(24, "小炸");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }














//    @Test
//    public void test(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndName(24, "张三");
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    //}

//    @Test
//    public void test(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findByIdAndName("25", "小蛤");
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void test(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findByAgeAndName(31, "小赵");

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
