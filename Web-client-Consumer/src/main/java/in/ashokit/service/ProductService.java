package in.ashokit.service;

import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.binding.Data;
import in.ashokit.binding.Product;
import reactor.core.publisher.Mono;

@Service
public class ProductService {
	
	private String apiUrl = "https://api.restful-api.dev/objects/{id}";
	private String addProductUrl = "https://api.restful-api.dev/objects";
	WebClient client = WebClient.create();
	
	public void getProductById(int id) {
		
		WebClient client = WebClient.create();
		Mono<String> bodyToMono = client.get().uri(apiUrl,id).retrieve().bodyToMono(String.class);
		String block = bodyToMono.block();
		System.out.println(block);
		
		
		
	}
	
public void getProductByIdObject(int id) {
		WebClient client = WebClient.create();
	    Product product = client.get().uri(apiUrl,id).retrieve().bodyToMono(Product.class).block();
		System.out.println(product);
			}

public void getProductByIdObjectAsync(int id) {
	
	client.get().uri(apiUrl,id).retrieve().bodyToMono(Product.class).subscribe(res->handleResponse(res));
	System.out.println("Line 37 Async call");
		}


public void handleResponse(Product p) {
	System.out.println("Line 42 = "+p);
	
}

public void addProduct() {
	Data d = new Data();
	d.setColor("");
	d.setCapacity("");
	Product p = new Product();
	p.setData(d);
	p.setName("Google Pixel 6 Pro");
	@Nullable
	String string = client.post().uri(addProductUrl).body(BodyInserters.fromValue(p)).retrieve().bodyToMono(String.class).block();
	System.out.println("Line 56 "+string);
	
	
}








}
