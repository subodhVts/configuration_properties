package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Products;
import in.ashokit.repo.ProductRepo;
@Service
public class productServiceImpl implements IproductService {
	
	@Autowired
    private  ProductRepo repo;
	@Override
	public String upsert(Products product) {
		Products save = repo.save(product);
		return "success";
	}

	@Override
	public Products getProductsById(Integer pid) {
		
	   Optional<Products> optional = repo.findById(pid);
	   if(optional.isPresent()) {
		   return optional.get();
	   }
	   
	   else {
		   return null;
	   }
	}

	@Override
	public List<Products> getAllProducts() {
		List<Products> list = repo.findAll();
		return list;
	}

	@Override
	public String deleteById(Integer pid) {
		if(repo.existsById(pid)) {
			repo.deleteById(pid);
			return "success";
			
		}
		else {
			return "no record found";
		}
			}

}
