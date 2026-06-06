package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bean.Student;
import in.ashokit.dao.StudentDao;
@Service
public class StudentService {
	@Autowired
	private StudentDao dao;
	public  String save(Student st) {
		String string = dao.saveStudent(st);
		return string;
	}

}
