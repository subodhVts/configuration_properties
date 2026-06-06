package in.ashokit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.bean.Student;
import in.ashokit.config.AppConfig;
import in.ashokit.service.StudentService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService bean = ctx.getBean(StudentService.class);
		Student st = new Student(2,"rinku","baddopur");
		bean.save(st);
	}

}
