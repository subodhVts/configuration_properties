package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.StudentInfo;
import in.ashokit.repo.StudentinforRepo;
@Service
public class StudentService {
	
	@Autowired
	private StudentinforRepo repo;
	
	public  StudentInfo saveStudentDetails(StudentInfo st) {
		StudentInfo save = repo.save(st);
		return save;
		
	}
	
	public  List<StudentInfo> saveAllStudentDetails(List<StudentInfo> st) {
		 List<StudentInfo> saveAll = repo.saveAll(st);
		return saveAll;
		
	}
	
	public  StudentInfo findStudentById(Integer id) {
	     Optional<StudentInfo> st = repo.findById(id);
	   if(st.isPresent()) {
			return st.get();
	   }
	   else {
		   return null;
	   }
		
	}
	public   List<StudentInfo>  findAllStudentById(List<Integer> id) {
	      List<StudentInfo> allById = repo.findAllById(id);
	        return allById;
	}
	public   void deleteStudentById(Integer id) {
		repo.deleteById(id);
	}
	public   void deleteStudent(StudentInfo st) {
		repo.delete(st);
	}
	
	public List<StudentInfo> m3(int age){
		List<StudentInfo> byAge = repo.m3(age);
		return byAge;
	}
	public List<StudentInfo> hql(String cntry){
		List<StudentInfo> byAge = repo.hql(cntry);
		return byAge;
		
	}
	
	public List<StudentInfo> findByCountryIn(List<String>cnts){
		return repo.findByCountryIn(cnts);
	}
	
	public void deleteStudent(int id ){
		 repo.deleteStudent(id);
	}
	
	
	
	
	
	

}
