package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Products;
import in.ashokit.service.productServiceImpl;

@RestController
public class ProductController {
	@Autowired
	private productServiceImpl service;
	@PostMapping("/saveProduct")
	public ResponseEntity<String> saveProduct(@RequestBody Products products ) {
		String upsert = service.upsert(products);
		return new ResponseEntity<String>(upsert,HttpStatus.CREATED);
		
		
	}

}
