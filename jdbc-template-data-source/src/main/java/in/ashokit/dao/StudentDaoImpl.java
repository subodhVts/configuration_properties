package in.ashokit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.ashokit.bean.Student;
import in.ashokit.bean.StudentRowIteratot;

@Repository
public class StudentDaoImpl {
	@Autowired
	private  JdbcTemplate jt;
	
	public List<Student> getAllStudent(){
		
		String query = "select * from studentt";
		List<Student> list = jt.query(query, new StudentRowIteratot());
		
		return list;
	}
	
	public int saveStudent(Student st) {
		
		String sql = "insert into studentt (id,name,city) values(?,?,?)";
		int update = jt.update(sql, st.getId(),st.getName(),st.getCity());
		return update;
		
	}

}
