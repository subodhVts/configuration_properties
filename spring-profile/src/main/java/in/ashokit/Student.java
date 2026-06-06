package in.ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
    private Environment environment;

	public Student() {
		
		String port = environment.getProperty("server.port");
        System.out.println("Current Port: " + port);
	}
	
	

}
