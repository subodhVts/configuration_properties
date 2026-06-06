package in.ashokit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.ashokit")
public class AppConfig {

	
	public AppConfig() {
		System.out.println("AppConfig::constructor");
	}
	
	

}
