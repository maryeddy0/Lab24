package com.jdbcdemo.JBDCDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ItemsJdbcDao {
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	public List <Items> findAllItems() {
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));

	}

	public int addItems(String name, String email, String phone) {
		String addQuery = "insert into items(name, email, phone) values(?,?,?)";
		return jdbcTemplate.update(addQuery, name, email, phone);
	}
	
	
	
	
	

}

