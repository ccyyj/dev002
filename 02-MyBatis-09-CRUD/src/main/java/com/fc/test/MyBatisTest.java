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
//    public void testGetIncrement() {
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
//            student.setName("小茂");
//            student.setAge((byte) 30);
//            student.setGender("男");
//            student.setInfo("未完待续...");
//
//            int affectedRows = studentDao.getIncrement(student);
//
//            System.out.println("是否成功：" + affectedRows);
//            System.out.println("获取自增长的id：" + student.getId());
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//}



//    @Test
//    public void testGetIncrement(){
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
//            student.setName("杨洋");
//            student.setAge((byte)32);
//            student.setGender("男");
//            student.setInfo("《你是我的荣耀》");
//
//            int affectedRows = studentDao.getIncrement(student);
//
//            System.out.println("是否成功："+affectedRows);
//            System.out.println("是否自增长："+student.getId());
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


@Test
public void testGetIncrement(){
    try {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession session = factory.openSession();

        StudentDao studentDao = session.getMapper(StudentDao.class);

        Student student = new Student();

        student.setName("迪丽热巴");
        student.setAge((byte)28);
        student.setGender("女");
        student.setInfo("《你是我的荣耀》");

        int affectedRows = studentDao.getIncrement(student);

        System.out.println("受影响的行数："+affectedRows);
        System.out.println("后否自增长："+student.getId());

        session.commit();
        session.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}













//    @Test
//    public void testFindByKeyword() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByKeyword("士");
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
//    public void testFindByKeyword(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByKeyword("小");
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
//    public void testFindByKeyword(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findByKeyword("张");
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
    public void testFindByKeyword(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findByKeyword("小");

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
//            Student student = studentDao.findById(8);
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
//    public void  testFindById(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findById(16);
//
//            System.out.println(student);
//
//            session.commit();
//
//            session.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void  testFindById(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            Student student = studentDao.findById(24);
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
    public void  testFindById(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = studentDao.findById(30);

            System.out.println(student);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }













//    @Test
//    public void testFindAll() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findAll();
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
//    public void testFindAll(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findAll();
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
//    public void testFindAll(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            List<Student> students = studentDao.findAll();
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
    public void testFindAll(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            List<Student> students = studentDao.findAll();

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
//    public void testUpdateInfo() {
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
//            student.setInfo("睡在我下铺的兄弟");
//            student.setId(8);
//
//            int affectedRows = studentDao.update(student);
//
//            System.out.println("受影响的行数：" + affectedRows);
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testUpdateInfo(){
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
//            student.setId(36);
//            student.setInfo("《旋风少女》");
//
//            int affectRows = studentDao.update(student);
//
//            System.out.println("受影响的行数："+affectRows);
//
//            session.commit();
//
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testUpdateInfo(){
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
//            student.setId(37);
//            student.setInfo("《克拉恋人》");
//
//            int affectedRows = studentDao.update(student);
//
//            System.out.println("受影响的行数："+affectedRows);
//
//            session.commit();
//            session.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testUpdateInfo(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            Student student = new Student();
            student.setId(31);
            student.setInfo("《楚乔传》");

            int affectedRows = studentDao.update(student);

            System.out.println("受影响的行数："+affectedRows);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

















//    @Test
//    public void testDelete() {
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            int affectedRows = studentDao.delete(3);
//
//            System.out.println("受影响的行数：" + affectedRows);
//            session.commit();
//            session.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    @Test
//    public void testDelete(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            int affectedRows = studentDao.delete(23);
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
//    public void testDelete(){
//        try {
//            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//
//            SqlSession session = factory.openSession();
//
//            StudentDao studentDao = session.getMapper(StudentDao.class);
//
//            int affectedRows = studentDao.delete(13);
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
    public void testDelete(){
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

            SqlSession session = factory.openSession();

            StudentDao studentDao = session.getMapper(StudentDao.class);

            int affectedRows = studentDao.delete(19);

            System.out.println("受影响的行数："+affectedRows);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




























//    @Test
//    public void testInsert() {
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
//            student.setName("谭松韵");
//            student.setAge((byte) 34);
//            student.setGender("女");
//            student.setInfo("《锦衣之下》");
//
//            int affectedRows = studentDao.insert(student);
//
//            System.out.println("受影响的行数：" + affectedRows);
//            session.commit();
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
//            Student student = new Student();
//            student.setName("任嘉伦");
//            student.setAge((byte)32);
//            student.setGender("男");
//            student.setInfo("《周生如故》");
//
//            int affectedRows = studentDao.insert(student);
//
//            System.out.println("受影响行数："+affectedRows);
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

            Student student = new Student();

            student.setName("白鹿");
            student.setAge((byte)26);
            student.setGender("女");
            student.setInfo("《招摇》");

            int affectedRows = studentDao.insert(student);

            System.out.println("受影响的行数："+affectedRows);

            session.commit();

            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
