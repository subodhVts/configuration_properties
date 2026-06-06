package in.ashokit.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.bean.Student;

@Repository
@Transactional
public class StudentDao {
	
@Autowired
private	HibernateTemplate template ;

public String saveStudent(Student st) {
	Serializable save = template.save(st);
	return "saved";
}
public List<Student> getAll(Student st) {
	 List<Student> all = template.loadAll(Student.class);
	return all;
}



}
