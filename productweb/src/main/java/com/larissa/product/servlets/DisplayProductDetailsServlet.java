package com.larissa.product.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.larissa.product.bo.ProductBOImpl;
import com.larissa.product.dto.Product;

/**
 * Servlet implementation class DisplayProductDetailsServlet
 */
public class DisplayProductDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProductBOImpl bo = new ProductBOImpl();
		Product product = bo.findProduct(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter writer = response.getWriter();
		writer.println("Product Details");
		writer.println("Product ID: " + product.getId());
		writer.println("Product Name: " + product.getName());
		writer.println("Product Description: " + product.getDescription());
		writer.println("Product Price: " + product.getPrice());
	}
}
