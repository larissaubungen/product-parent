package com.larissa.product.dao;

import com.larissa.product.dto.Product;

public interface ProductDAO {
	void create(Product product);
	
	Product read(int id);

}
