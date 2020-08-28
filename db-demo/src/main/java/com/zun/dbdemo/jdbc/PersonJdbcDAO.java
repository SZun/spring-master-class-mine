package com.zun.dbdemo.jdbc;

import com.zun.dbdemo.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDAO {

    @Autowired
    private JdbcTemplate template;

    public List<Person> findAll() {
        return template.query("SELECT * FROM Person",
                new PersonRowMapper());
    }

    public Person findById(int id) {
        return template.queryForObject("SELECT * FROM Person WHERE id = ?",
                new Object[]{id},
                new PersonRowMapper());
    }

    public int deleteById(int id) {
        return template.update("DELETE FROM Person WHERE id = ?", id);
    }

    public int insert(Person person){
        return template.update(
                "insert into person (id, name, location, birth_date) " +
                "values(?,?,?,?)",
                new Object[]{
                        person.getId(),
                        person.getName(),
                        person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime())
                }
        );
    }

    public int update(Person person){
        return template.update(
                "update person set name = ?, location = ?, birth_date = ? " +
                        "where id = ?",
                new Object[]{
                        person.getName(),
                        person.getLocation(),
                        new Timestamp(person.getBirthDate().getTime()),
                        person.getId()
                }
        );
    }

    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            return new Person(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("location"),
                    resultSet.getTimestamp("birth_date")
            );
        }
    }

}
