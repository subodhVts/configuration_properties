package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.bean.Motor;
import in.ashokit.config.AppConfig;

public class mainApp {

	public static void main(String[] args) {
	ApplicationContext ctx =	new AnnotationConfigApplicationContext(AppConfig.class);
	Motor bean1 = ctx.getBean(Motor.class);
//	Motor bean2 = ctx.getBean(Motor.class);
//	Motor bean3 = ctx.getBean(Motor.class);
//	System.out.println(bean1.hashCode()+"==="+bean2.hashCode()+"=="+bean3.hashCode());
//	
//	ConfigurableApplicationContext ctxx = (ConfigurableApplicationContext)ctx;
//	ctxx.close();
	
	
	
	}
	
}
