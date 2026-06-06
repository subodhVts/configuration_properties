package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.StudentInfo;
import in.ashokit.service.StudentService;

@SpringBootApplication
public class JpaCrudAppPractice3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaCrudAppPractice3Application.class, args);
		StudentService studentService = context.getBean(StudentService.class);
		
//		StudentInfo st = new StudentInfo("rekha","Female","India",20);
//		StudentInfo saveStudentDetails = studentService.saveStudentDetails(st);
//		System.out.println("saved obj= "+saveStudentDetails);
//		StudentInfo studentById = studentService.findStudentById(1);
//		System.out.println("find obj= "+studentById);
//		 List<StudentInfo> allStudentById = studentService.findAllStudentById(List.of(1,2));
//		System.out.println("find All obj= "+allStudentById);
//		studentService.deleteStudentById(5);
//		List<StudentInfo> m3 = studentService.m3(20);
//		System.out.println("m3= "+m3);
//		List<StudentInfo> m3 = studentService.hql("India");
//		 System.out.println("m3= "+m3);
		
//		List<StudentInfo> byCountryIn = studentService.findByCountryIn(List.of("India","Japan"));
//		System.out.println("byCountryIn= "+byCountryIn);
		
		studentService.deleteStudent(52);
         
		
		
	}

}
