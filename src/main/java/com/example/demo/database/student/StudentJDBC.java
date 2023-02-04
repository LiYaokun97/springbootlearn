package com.example.demo.database.student;


import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("studentJDBC")
public class StudentJDBC {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    //根据id查找文章
    public Student findById(Long id) {
        //queryForObject用于查询单条记录返回结果
        return (Student) jdbcTemplate.queryForObject("SELECT * FROM student WHERE id=?",
                new Object[]{id},new BeanPropertyRowMapper<>(Student.class));
    }


    //保存文章
    public void save(Student student) {
        //jdbcTemplate.update适合于insert 、update和delete操作；
        jdbcTemplate.update("INSERT INTO student(id, name, age, sex, description) values(?, ?, ?, ?, ?)",
                student.getStudentId(),
                student.getName(),
                student.getAge(),
                student.getSex(),
                student.getDescription());
    }

    //删除文章
    public void deleteById(Long id) {
        //jdbcTemplate.update适合于insert 、update和delete操作；
        jdbcTemplate.update("DELETE FROM student WHERE id = ?",id);

    }

    //更新文章
    public void updateById(Student student) {
        //jdbcTemplate.update适合于insert 、update和delete操作；
        jdbcTemplate.update("UPDATE student SET id = ?, name = ? ,age = ?,sex = ?, description =?  WHERE id = ?",
                student.getStudentId(),
                student.getName(),
                student.getAge(),
                student.getSex(),
                student.getDescription());
    }

    //查询所有
    public List<Student> findAll(){
        //query用于查询结果列表
        return (List<Student>) jdbcTemplate.query("SELECT * FROM student ",  new BeanPropertyRowMapper<>(Student.class));
    }

}
