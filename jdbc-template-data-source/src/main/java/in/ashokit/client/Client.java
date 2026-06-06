package in.ashokit.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.bean.Student;
import in.ashokit.config.AppConfig;
import in.ashokit.dao.StudentDaoImpl;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDaoImpl bean = ctx.getBean(StudentDaoImpl.class);
		List<Student> allStudent = bean.getAllStudent();
		System.out.println(allStudent);
		Student st = new Student(5,"sks","lucknow");
		int insert = bean.saveStudent(st);
		System.out.println(insert);

	}

}
