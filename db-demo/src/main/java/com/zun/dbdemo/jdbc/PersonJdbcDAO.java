package com.zun.dbdemo.jdbc;

import com.zun.dbdemo.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDAO {

    @Autowired
    private JdbcTemplate template;

    public List<Person> findAll(){
       return template.query("SELECT * FROM Person",
                new BeanPropertyRowMapper(Person.class));
    }

}
