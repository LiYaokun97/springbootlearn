package com.example.demo.controller;


import com.example.demo.entity.BraveResponse;
import com.example.demo.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class StudentServiceController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public BraveResponse getDefaultStudent() {
        Student student = Student.builder()
                .name("雪莉")
                .studentId(1)
                .age(25)
                .sex("female")
                .description("the most beautiful women in the world.")
                .build();
        return BraveResponse.success(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public BraveResponse getStudentById(@PathVariable("id") long id) {
        // todo 从数据库中根据id读取
        Student student = Student.builder()
                .name("雪莉")
                .studentId(1)
                .age(25)
                .sex("female")
                .description("the most beautiful women in the world.")
                .build();
        return BraveResponse.success(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.POST)
    public BraveResponse addStudentById(@PathVariable("id") long id, @RequestBody Student student) {
        // todo update 数据库中的信息
        log.info("add student info by id " + id + " successfully, student:" + student);
        return BraveResponse.success(student);
    }

    @RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
    public BraveResponse updateStudentById(@PathVariable("id") long id, @RequestBody Student student ) {
        // todo update 数据库中的信息
        log.info("update student info by id " + id + " successfully, student:" + student);
        return BraveResponse.success();
    }


    @RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public BraveResponse deleteStudentById(@PathVariable("id") long id) {
        // todo update 数据库中的信息
        log.info("delete student info by id " + id + " successfully");
        return BraveResponse.success();
    }


    @RequestMapping(value = "/student/test")
    public String studentTest() {
        // todo 从数据库中根据id读取
        return Student.builder()
                .name("雪莉")
                .studentId(1)
                .age(25)
                .sex("female")
                .description("the most beautiful women in the world.")
                .build().toString();
    }



}
