package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.StudentSerive;

@SpringBootApplication
public class JpaCrudAppPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaCrudAppPracticeApplication.class, args);
		StudentSerive studentSerive = context.getBean(StudentSerive.class);
		studentSerive.saveStudent();
		
	}

}
