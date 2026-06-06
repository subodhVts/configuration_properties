package in.ashokit.restController;

import java.util.List;

import org.springframework.boot.jackson.autoconfigure.JacksonProperties.Json;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bean.Customer;

@RestController
@RequestMapping("/FirstRestApi")
public class StudentController {
	
	@GetMapping(value="getCustomer",produces = "application/json")
	public ResponseEntity<Customer>getCustomerDetail(){
		Customer c = new Customer(100,"subodh","India");
	    return	new ResponseEntity<Customer>(c,HttpStatus.OK);
		
	}
	
	@GetMapping(value="getCustomers",produces = "application/json")
	public ResponseEntity<List<Customer>>getCustomerDetails(){
		Customer c1 = new Customer(100,"subodh","India");
		Customer c2 = new Customer(101,"subodh1","china");
		List<Customer> list = List.of(c1,c2);
	    return	new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
		
	}
	
	
	
	
	
	
	@GetMapping(value="/greet2",produces = "text/plain")
	public ResponseEntity<String> greetmsg(){
		String msg ="welcome to another greet msg";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	
	@GetMapping("/welcome/{name}")
	public String welcomeMessage(@PathVariable String name) {
		System.out.println("Line 51 name= "+name);
		return "welcome to rest api";
		
	}
	@GetMapping("/greet")
	public ResponseEntity<String> greetMessage(@RequestParam String name,@RequestParam String surname ){
		System.out.println("Line 55 name= "+name+" "+surname);
		String msg = "welcome to greet msg handler";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@PostMapping( value="/save",produces = "application/json",consumes = "application/json")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer c){
		System.out.println("Line 66 c = "+c);
		return new ResponseEntity<Customer>(c,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/deleteCustomer")
	public ResponseEntity<String> deleteCustomer(@RequestBody Customer c){
		System.out.println("line 74 c= "+c);
		
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
		
		
	}
	
	
	
	

}
