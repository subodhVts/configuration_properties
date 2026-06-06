package in.ashokit.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
public class AppConfig {

	

		
	@Bean
	public DataSource datasource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		//ds.setDriverClassName("com.mysqj.cj.jdbc.Driver");
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // SI
		System.out.println("Line22");
		ds.setUrl("jdbc:mysql://localhost:3306/subodh");
		ds.setUsername("root");
		ds.setPassword("password");
		System.out.println("hello");
		return ds;
	}
	
	@Bean
	public JdbcTemplate m1(DataSource ds) {
		return new JdbcTemplate(ds);
	}
	

}
