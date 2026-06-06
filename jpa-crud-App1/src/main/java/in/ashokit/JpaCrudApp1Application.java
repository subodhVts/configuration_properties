package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.UserInfo;
import in.ashokit.service.UserService;

@SpringBootApplication
public class JpaCrudApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =	SpringApplication.run(JpaCrudApp1Application.class, args);
        UserService bean = context.getBean(UserService.class);
        UserInfo u = new UserInfo();
		u.setName("Cathy");
		u.setGender("Fe-Male");
		u.setCountry("CANADA");
		u.setAge(45);
        UserInfo saveUser = bean.saveUser(u);
        System.out.println("user saved =="+saveUser);

		// bean.getUserById(102);

		// bean.getAllUsers();

	}

}
