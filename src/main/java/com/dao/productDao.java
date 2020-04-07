package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;

@Repository
public class productDao {
	
	@Autowired
	JdbcTemplate stmt;

	public void addProduct(ProductBean productBean) {
		String sql="insert into product(pid,name,price) values(?,?,?)";
		stmt.update(sql, productBean.getPid(),productBean.getName(),productBean.getPrice());
		
	}
	
	

}
