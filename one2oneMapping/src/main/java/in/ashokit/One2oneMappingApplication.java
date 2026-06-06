package in.ashokit;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.PersonService;

@SpringBootApplication
public class One2oneMappingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(One2oneMappingApplication.class, args);
		PersonService bean = context.getBean(PersonService.class);
		bean.savePerson();
		System.out.println("Line 17 saved");
		
	}

}
