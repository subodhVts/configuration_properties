package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.dao.StudentDao;

@SpringBootApplication
public class BootFirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootFirstProjectApplication.class, args);
		StudentDao bean = run.getBean(StudentDao.class);
		System.out.println("Line 15 ======"+bean.hashCode());
	}

}
