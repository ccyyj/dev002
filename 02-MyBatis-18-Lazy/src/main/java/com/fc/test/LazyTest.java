package com.fc.test;

import com.fc.dao.DepartmentDao;
import com.fc.dao.EmployeeDao;
import com.fc.entity.Department;
import com.fc.entity.Employee;
import com.fc.util.MyBatisUtil;
import org.junit.Test;

import java.util.List;

public class LazyTest {
//    @Test
//    public void testDepartment() {
//        DepartmentDao departmentDao = MyBatisUtil.getMapper(DepartmentDao.class);
//        Department department = departmentDao.findById(4);
//
//        System.out.println(department.getName());
//    }

//    @Test
//    public void testDepartment(){
//        DepartmentDao departmentDao = MyBatisUtil.getMapper(DepartmentDao.class);
//
//        Department department = departmentDao.findById(2);
//
//        System.out.println(department.getName());
//    }

//    @Test
//    public void testDepartment(){
//        DepartmentDao departmentDao = MyBatisUtil.getMapper(DepartmentDao.class);
//
//        Department department = departmentDao.findById(1);
//
//        System.out.println(department.getName());
//    }

//    @Test
//    public void testDepartment(){
//        DepartmentDao departmentDao = MyBatisUtil.getMapper(DepartmentDao.class);
//
//        Department department = departmentDao.findById(3);
//
//        System.out.println(department.getName());
//    }

    @Test
    public void testDepartment(){
        DepartmentDao departmentDao = MyBatisUtil.getMapper(DepartmentDao.class);

        Department department = departmentDao.findById(5);

        System.out.println(department.getName());
    }






















//    @Test
//    public void testEmployee() {
//        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);
//
//        List<Employee> employees = employeeDao.findById(4);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testEmployee(){
//        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);
//
//        List<Employee> employees = employeeDao.findById(1);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testEmployee(){
//        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);
//
//        List<Employee> employees = employeeDao.findById(2);
//
//        MyBatisUtil.commit();
//    }

//    @Test
//    public void testEmployee(){
//        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);
//
//        List<Employee> employees = employeeDao.findById(3);
//
//        MyBatisUtil.commit();
//    }

    @Test
    public void testEmployee(){
        EmployeeDao employeeDao = MyBatisUtil.getMapper(EmployeeDao.class);

        List<Employee> employees = employeeDao.findById(5);

        MyBatisUtil.commit();
    }
}
