package com.larissa.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.larissa.product.dto.Product;

public class ProductDAOImpl implements ProductDAO {
	
	Map<Integer,Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);
	}

	@Override
	public Product read(int id) {
		return products.get(id);
	}
}
