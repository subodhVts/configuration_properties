package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Products;

public interface IproductService {
	
	public String upsert(Products product);
	public Products getProductsById(Integer pid );
	public List<Products> getAllProducts();
	public String deleteById(Integer pid );

}
