package com.larissa.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.larissa.product.dto.Product;

public class ProductDAOImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDAO dao = new ProductDAOImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName("iPhone");
		product.setDescription("Awesome");
		product.setPrice(800);
		dao.create(product);
		
		//Call read method to test 
		Product result = dao.read(1);
		assertNotNull(result);
		assertEquals("iPhone", result.getName());
	}

}
