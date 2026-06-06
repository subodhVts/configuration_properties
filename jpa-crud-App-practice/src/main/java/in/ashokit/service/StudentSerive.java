package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.StudentInfo;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentSerive {

	@Autowired
	private StudentRepo repo;
	
	public void saveStudent() {
		StudentInfo info = new StudentInfo();
		info.setName("subodh");
		info.setCity("Mumbai");
		info.setAddres("navi Mumbai");
		repo.save(info);
	}
}
