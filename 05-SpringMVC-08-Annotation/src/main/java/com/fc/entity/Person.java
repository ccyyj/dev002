package com.fc.entity;

//import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
    private String gender;
    //    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    private Date birthday;
    private String info;
}
