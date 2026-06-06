package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bean.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee emp ) {
		System.out.println("Employee saved");
		return emp;
		
	}
	
	@GetMapping("/getEmpByName")
	public String getEmployeeByName(@RequestParam String fname,@RequestParam String lname ) {
		System.out.println("getEmployee");
		return "Hi "+ fname+" "+lname;
		
	}
	
	
	@GetMapping("/getEmpByLname/{id}/{name}")
	public String getEmployeeById(@PathVariable String id,@PathVariable String name ) {
		System.out.println("getEmployeeById fname="+id+" lname "+name);
		return "Hi "+ id+" "+name;
		
	}
	
	@GetMapping("/getEmp")
	public Employee getEmployee( ) {
		System.out.println("Line 40");
		return new Employee(100,"subodh","India");
		
		
	}


}
