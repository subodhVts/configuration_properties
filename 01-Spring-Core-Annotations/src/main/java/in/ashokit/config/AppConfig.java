package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.security.AppSecurity;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig::constructor");
	}
	
	
	@Bean
	public AppSecurity m2() {
		System.out.println("m2 method called");
		AppSecurity sec = new AppSecurity();
		sec.secureApp();
		return sec;
	}
	
	

}
