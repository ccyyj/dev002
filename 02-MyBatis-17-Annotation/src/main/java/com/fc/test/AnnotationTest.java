package com.fc.test;

import com.fc.dao.StudentDao;
import com.fc.entity.Student;
import com.fc.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class AnnotationTest {
//    @Test
//    public void testDelete() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        studentDao.delete(12);
//
//        MyBatisUtil.commit();
//    }


//    @Test
//    public void testDelete(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        studentDao.delete(16);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testDelete(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        studentDao.delete(11);
//
//        MyBatisUtil.commit();
//    }

    @Test
    public void testDelete(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        studentDao.delete(12);

        MyBatisUtil.commit();
    }











//    @Test
//    public void testUpdate() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(15);
//        student.setInfo("人人都说好");
//
//        studentDao.update(student);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testUpdate(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(22);
//        student.setInfo("嗨嗨嗨");
//
//        studentDao.update(student);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testUpdate(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(3);
//        student.setInfo("呜呼呼");
//
//        studentDao.update(student);
//
//        MyBatisUtil.commit();
//    }


    @Test
    public void testUpdate(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(4);
        student.setInfo("你好哇，我是胖头鱼");

        studentDao.update(student);

        MyBatisUtil.commit();
    }
















//    @Test
//    public void testInsert() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setName("老八");
//        student.setAge((byte) 25);
//        student.setGender("男");
//        student.setInfo("秘制小汉堡");
//
//        studentDao.insert(student);
//
//        MyBatisUtil.commit();
//    }


//    @Test
//    public void testInsert(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(41);
//        student.setName("草莓熊");
//        student.setAge((byte)5);
//        student.setGender("女");
//        student.setInfo("粉粉的草莓熊哇");
//
//        studentDao.insert(student);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testInsert(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = new Student();
//        student.setId(42);
//        student.setName("玉桂狗");
//        student.setAge((byte) 4);
//        student.setGender("男");
//        student.setInfo("放大镜玉桂狗");
//
//        studentDao.insert(student);
//
//        MyBatisUtil.commit();
//    }


    @Test
    public void testInsert(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        Student student = new Student();
        student.setId(43);
        student.setName("星黛露");
        student.setAge((byte) 8);
        student.setGender("女");
        student.setInfo("紫色的星黛露");

        studentDao.insert(student);

        MyBatisUtil.commit();
    }





















//    @Test
//    public void testFindById() {
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = studentDao.findById(1);
//
//        System.out.println(student);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testFindById(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = studentDao.findById(3);
//
//        System.out.println(student);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testFindById(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = studentDao.findById(5);
//
//        System.out.println(student);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testFindById(){
//        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);
//
//        Student student = studentDao.findById(35);
//
//        System.out.println(student);
//
//        MyBatisUtil.commit();
//    }

    @Test
    public void testFindById(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        Student student = studentDao.findById(28);

        System.out.println(student);

        MyBatisUtil.commit();
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
//
//        MyBatisUtil.commit();
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
//        MyBatisUtil.commit();
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
//        MyBatisUtil.commit();
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
//        MyBatisUtil.commit();
//    }

    @Test
    public void testFindAll(){
        StudentDao studentDao = MyBatisUtil.getMapper(StudentDao.class);

        List<Student> students = studentDao.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
        MyBatisUtil.commit();
    }

}
