package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Emplyee;
import in.ashokit.service.ProductService;
import in.ashokit.service.StudentService;

@SpringBootApplication
public class DatajpaTimestampingApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DatajpaTimestampingApplication.class, args);
		ProductService productService = context.getBean(ProductService.class);
	//	Product p = new Product();
 //     p.setProductId(101);
//		p.setProductName("laptop");
//		p.setProductPrice(500.00);
//      productService.save(p); // auto-commit
		
		StudentService studentService = context.getBean(StudentService.class);
		Emplyee emp = new Emplyee();
		emp.setName("suresh");
		emp.setCountry("Bhutan");
		Emplyee save = studentService.save(emp);
		System.out.println("line 29 ="+save);
		
	}

}
