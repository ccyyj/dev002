package com.fc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


@Data
public class Person {
    private String name;
    private Integer age;
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private Date createDateTime;
}
