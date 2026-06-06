package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Emplyee;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;
	
	public Emplyee save(Emplyee emp) {
		return repo.save(emp);
	}
	

}
