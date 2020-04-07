package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;
import com.dao.productDao;

@Controller
public class productController {
	
	@Autowired
	productDao pd;
	
	
	@PostMapping("/product")
	public ProductBean addProduct(ProductBean productBean)
	{
	  	pd.addProduct(productBean);		 
		return productBean;
	}

}
