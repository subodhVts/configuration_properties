package in.ashokit.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Motor {

	public Motor() {
		System.out.println("Motor constructor");
	}
	
	@PostConstruct
	public void start() {
		System.out.println(" post construct Motor started ");
	}
	
	public void dowork() {
		System.out.println("Motor working ");
	}
	@PreDestroy
	public void stop() {
		System.out.println(" pre destroy Motor stopped ");
	}

}
