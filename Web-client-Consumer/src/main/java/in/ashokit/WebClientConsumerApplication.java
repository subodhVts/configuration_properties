package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.ProductService;

@SpringBootApplication
public class WebClientConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WebClientConsumerApplication.class, args);
		ProductService productService = context.getBean(ProductService.class);
		//productService.getProductById(1);
		//productService.getProductByIdObject(1);
		//productService.getProductByIdObjectAsync(1);
		productService.addProduct();
		
		
	}

}
