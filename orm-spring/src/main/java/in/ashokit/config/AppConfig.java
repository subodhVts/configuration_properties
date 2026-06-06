package in.ashokit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan(basePackages = "in.ashokit")
@EnableTransactionManagement
public class AppConfig {
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/subodh");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
	}
	
	
	
	@Bean
	public LocalSessionFactoryBean  localSessionFactoryBean() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(dataSource());
		factory.setPackagesToScan("in.ashokit.bean");
		Properties ps = new Properties();
		ps.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		ps.put("hibernate.hbm2ddl.auto", "update");
		ps.put("hibernate.show_sql", "true");
		ps.put("hibernate.format_sql", "true");
		factory.setHibernateProperties(ps);
		return factory;
	}
	

	@Bean
	public HibernateTransactionManager HibernateTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(localSessionFactoryBean().getObject());
		return transactionManager;
		
	}
	@Bean
	public HibernateTemplate template(SessionFactory sf) {
         return new HibernateTemplate(sf);
	}
	
	
}
