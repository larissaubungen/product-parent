package com.larissa.product.bo;

import com.larissa.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	
	Product findProduct(int id);
}
