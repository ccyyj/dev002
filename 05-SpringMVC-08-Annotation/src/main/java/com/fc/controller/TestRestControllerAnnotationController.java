package com.fc.controller;

import com.fc.entity.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("controller")
public class TestRestControllerAnnotationController {
    @RequestMapping("getPerson")
    public Person testUser() {
        return new Person("易烊千玺", 22, "男",  "四个字");
    }
}
