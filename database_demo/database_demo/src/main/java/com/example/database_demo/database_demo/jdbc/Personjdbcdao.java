package com.example.database_demo.database_demo.jdbc;

import com.example.database_demo.database_demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Personjdbcdao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person",new BeanPropertyRowMapper<Person>(Person.class));
    }
}
