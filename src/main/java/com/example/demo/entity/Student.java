package com.example.demo.entity;


import lombok.Builder;
import lombok.Data;


//@Builder为我们提供了通过对象属性的链式赋值构建对象的方法，下文中代码会有详细介绍。
//@Data注解帮我们定义了一系列常用方法，如：getters、setters、hashcode、equals等
@Builder
@Data
public class Student {
    private String name;
    private long studentId;
    private String sex;
    private int age;
    private String description;
}
