package com.fc.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("hello")
    public String hello() {
        return "蛋白棒、无糖豆浆、八宝粥";
    }
}
