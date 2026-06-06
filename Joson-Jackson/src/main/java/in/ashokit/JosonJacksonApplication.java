package in.ashokit;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ashokit.entity.Student;

@SpringBootApplication
public class JosonJacksonApplication {

	public static void main(String[] args) {
		SpringApplication.run(JosonJacksonApplication.class, args);
		try {
			convert2Json();
			convert2Student();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void convert2Json() throws StreamWriteException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Student st = new Student();
		st.setId(100);
		st.setName("subodh");
		st.setCountry("india");
		mapper.writeValue(new File("Student.json"), st);
		System.out.println("Line 38 json created");
	}
	public static void convert2Student() throws StreamWriteException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Student value = mapper.readValue(new File("Student.json"), Student.class);
		System.out.println("Line 43 obj created="+value);
	}

}
