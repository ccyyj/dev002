package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import com.fc.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class DynamicSQLTest {
//    @Test
//    public void testUpdate() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(5);
//        student.setAge((byte) 100);
//        student.setInfo("逢魔时王");
//
//        int affectedRows = studentDao.update(student);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testUpdate(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(22);
//        student.setAge((byte) 25);
//        student.setInfo("你好哇！");
//
//        int affectedRows = studentDao.update(student);
//
//       MyBatisUtil.commit();
//    }

//    @Test
//    public void testUpdate(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(12);
//        student.setAge((byte) 14);
//        student.setInfo("小海");
//
//        int affectedRows = studentDao.update(student);
//
//        MyBatisUtil.commit();
//    }

    @Test
    public void testUpdate(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(24);
        student.setAge((byte) 43);
        student.setInfo("法外狂徒");

        int affectedRows = studentDao.update(student);

        MyBatisUtil.commit();
    }













//    @Test
//    public void testFindStudent() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setGender("男");
//        student.setAge((byte) 20);
//        student.setId(6);
//
//        List<Student> students = studentDao.findByStudent(student);
//
//        for (Student temp : students) {
//            System.out.println(temp);
//        }
//    }

//    @Test
//    public void testFindStudent(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setGender("女");
//        student.setAge((byte) 21);
//        student.setId(27);
//
//        List<Student> students = studentDao.findByStudent(student);
//
//        for (Student student1 : students) {
//            System.out.println(student1);
//        }
//    }


//    @Test
//    public void testFindStudent(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setGender("女");
//        student.setAge((byte) 21);
//        student.setId(22);
//
//        List<Student> students = studentDao.findByStudent(student);
//
//        for (Student s : students) {
//            System.out.println(s);
//        }
//    }

@Test
public void testFindStudent(){
    StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

    Student student = new Student();

    student.setGender("男");
    student.setAge((byte) 15);
    student.setId(25);

    List<Student> students = studentDao.findByStudent(student);

    for (Student student1 : students) {
        System.out.println(student1);
    }
}











//    @Test
//    public void testFindKeyword() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findByKeyword("%士%", 20);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

//    @Test
//    public void testFindKeyword(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findByKeyword("小%", 20);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

//    @Test
//    public void testFindKeyword(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findByKeyword("小%", 30);
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

    @Test
    public void testFindKeyword(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findByKeyword("小%", 32);

        for (Student student : students) {
            System.out.println(student);
        }
    }
















//    @Test
//    public void testFindAll() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findAll();
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

//    @Test
//    public void testFindAll(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findAll();
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

//    @Test
//    public void testFindAll(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        List<Student> students = studentDao.findAll();
//
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

    @Test
    public void testFindAll(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> all = studentDao.findAll();

        for (Student student : all) {
            System.out.println(student);
        }
    }
}
