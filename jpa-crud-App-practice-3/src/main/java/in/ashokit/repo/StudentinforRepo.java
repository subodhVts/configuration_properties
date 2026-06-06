package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.StudentInfo;
import java.util.List;


public interface StudentinforRepo extends JpaRepository<StudentInfo, Integer> {
	
	public List<StudentInfo> findByCountry(String country);
	public List<StudentInfo> findByAge(Integer age);
	public List<StudentInfo> findByAgeGreaterThanEqual(Integer age);
	public List<StudentInfo> findByCountryAndAgeGreaterThanEqual(String cntry,int age);
	@Query(value="select * from students_details where age=:age",nativeQuery = true)
	public List<StudentInfo>m3(int age);
	public List<StudentInfo> findByGender(String gender);
	@Query(value="from StudentInfo where country=:cntry")
	public List<StudentInfo> hql(String cntry);
	public List<StudentInfo> findByCountryIn(List<String>cnts);
	
	@Modifying
	@Transactional
	@Query(value="delete from students_details where id=:id",nativeQuery = true)
	public void deleteStudent(Integer id);
	
	

}
