package in.ashokit;

import in.ashokit.service.ApiConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConsumerRestApiApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConsumerRestApiApplication.class, args);
		ApiConsumer bean = context.getBean(ApiConsumer.class);
		bean.callApi_2(1);
		
	}

}
