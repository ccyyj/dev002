package com.fc.test;

import com.fc.dao.impl.JDBCTemplateDaoImpl;
import com.fc.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {
//    @Test
//    public void testDelete() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = jdbcTemplateDao.delete(1);
//
//        System.out.println(affectedRows);
//    }


//    @Test
//    public void testDelete(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = templateDao.delete(4);
//
//        System.out.println(affectedRows);
//    }


//    @Test
//    public void testDelete(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = jdbcTemplateDao.delete(5);
//
//        System.out.println(affectedRows);
//    }


    @Test
    public void testDelete(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int affectedRows = jdbcTemplateDao.delete(6);

        System.out.println(affectedRows);
    }
























//    @Test
//    public void testUpdate() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = jdbcTemplateDao.update(new User(2, null, "888"));
//
//        System.out.println(affectedRows);
//    }


//    @Test
//    public void testUpdate(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = jdbcTemplateDao.update(new User(6, null, "0000"));
//
//        System.out.println(affectedRows);
//    }


//    @Test
//    public void testUpdate(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = jdbcTemplateDao.update(new User(5, null, "5555"));
//
//        System.out.println(affectedRows);
//    }


    @Test
    public void testUpdate(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int affectedRows = jdbcTemplateDao.update(new User(4, null, "4444"));

        System.out.println(affectedRows);
    }

















//    @Test
//    public void testInsert() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = jdbcTemplateDao.insert(new User(null, "老坛酸菜", "666"));
//
//        System.out.println(affectedRows);
//    }


//    @Test
//    public void testInsert(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int affectedRows = jdbcTemplateDao.insert(new User(null, "01001", "00000"));
//
//        System.out.println(affectedRows);
//    }


    @Test
    public void testInsert(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int affectedRows = jdbcTemplateDao.insert(new User(null, "01002", "00000"));

        System.out.println(affectedRows);
    }
















//    @Test
//    public void testFindCount() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int count = templateDao.findCount();
//
//        System.out.println(count);
//    }


//    @Test
//    public void testFindCount(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int count = templateDao.findCount();
//
//        System.out.println(count);
//    }


//    @Test
//    public void testFindCount(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int count = templateDao.findCount();
//
//        System.out.println(count);
//    }


//    @Test
//    public void testFindCount(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        int count = templateDao.findCount();
//
//        System.out.println(count);
//    }


    @Test
    public void testFindCount(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl templateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        int count = templateDao.findCount();

        System.out.println(count);
    }











//    @Test
//    public void testFindById() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        User user = jdbcTemplateDao.findById(2);
//
//        System.out.println(user);
//    }


//    @Test
//    public void testFindById(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        User user = jdbcTemplateDao.findById(3);
//
//        System.out.println(user);
//    }


//    @Test
//    public void testFindById(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        User user = jdbcTemplateDao.findById(4);
//
//        System.out.println(user);
//    }


    @Test
    public void testFindById(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        User user = jdbcTemplateDao.findById(5);

        System.out.println(user);
    }













//    @Test
//    public void testFindAll() {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl userDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        List<User> users = userDao.findAll();
//
//        System.out.println(users);
//    }


//    @Test
//    public void testFindAll(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        List<User> users = jdbcTemplateDao.findAll();
//
//        System.out.println(users);
//    }


//    @Test
//    public void testFindAll(){
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);
//
//        List<User> users = jdbcTemplateDao.findAll();
//
//        System.out.println(users);
//    }


    @Test
    public void testFindAll(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCTemplateDaoImpl jdbcTemplateDao = applicationContext.getBean(JDBCTemplateDaoImpl.class);

        List<User> users = jdbcTemplateDao.findAll();

        System.out.println(users);
    }


}
