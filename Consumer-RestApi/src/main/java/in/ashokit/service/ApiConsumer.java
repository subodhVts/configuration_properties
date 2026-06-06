package in.ashokit.service;

import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.binding.Product;

@Service
public class ApiConsumer {
	
	RestTemplate rt = new RestTemplate();
	
	public void callApi(int id) {
		String url ="https://api.restful-api.dev/objects/{id}";
		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class,id);
		System.out.println("Line no 12="+forEntity.getBody());
		
	}
	
	public void callApi_2(int id) {
		String url ="https://api.restful-api.dev/objects/{id}";
		 ResponseEntity<Product> forEntity = rt.getForEntity(url, Product.class,id);
		 Product p = forEntity.getBody();
		 System.out.println(p);
		
		
	}
	

}
