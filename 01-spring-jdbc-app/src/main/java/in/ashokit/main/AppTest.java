package in.ashokit.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.dao.StudentDao;
import in.ashokit.entity.Student;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDao bean = ctx.getBean(StudentDao.class);
//		Student st = new Student(2,"umesh","mumbai");
//		int save = bean.save(st);
//		System.out.println(save);
		
		List<Student> list = bean.findAll();
		System.out.println(list);
		

	}

}
