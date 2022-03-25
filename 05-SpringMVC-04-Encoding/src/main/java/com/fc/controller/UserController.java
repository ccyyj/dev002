package com.fc.controller;

import com.fc.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//
//@Controller
//@RequestMapping("user")
//public class UserController {
//    @RequestMapping("getUser")
//    public void getUser(Person user) {
//        System.out.println(user);
//    }
//}

//@Controller
//@RequestMapping("user")
//public class UserController {
//    @RequestMapping("getUser")
//    public void getUser(Person user){
//        System.out.println(user);
//    }
//}


//@Controller
//@RequestMapping("user")
//public class UserController {
//    @RequestMapping("getUser")
//    public void getUser(Person user){
//        System.out.println(user);
//    }
//}


@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("getUser")
    public void getUser(Person user){
        System.out.println(user);
    }
}
