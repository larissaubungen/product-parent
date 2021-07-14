package com.larissa.product.bo;

import com.larissa.product.dao.ProductDAO;
import com.larissa.product.dao.ProductDAOImpl;
import com.larissa.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}
}