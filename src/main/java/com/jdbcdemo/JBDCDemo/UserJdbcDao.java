package com.jdbcdemo.JBDCDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	public List <Users> findAllUsers() {
		return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Users>(Users.class));

	}

	public int addUser(String name, String email, String phone) {
		String addQuery = "insert into users(name, email, phone) values(?,?,?)";
		return jdbcTemplate.update(addQuery, name, email, phone);
	}
	
	
	
}
