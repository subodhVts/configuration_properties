package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.bean.Car;

public class App {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext or FileSystemXmlApplicationContext any one u can use 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
		Car bean = ctx.getBean(Car.class);
		boolean drive = bean.drive();
		System.out.println("Line 16 "+drive);

	}

}
