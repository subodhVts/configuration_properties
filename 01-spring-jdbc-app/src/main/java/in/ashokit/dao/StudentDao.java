package in.ashokit.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Student;
import in.ashokit.mapper.StudentMapper;

@Repository
public class StudentDao {
	private JdbcTemplate jt;

	public StudentDao(JdbcTemplate jt) {
		
		this.jt = jt;
	}
	
	public int save(Student st) {
		
		String sql = "insert into studentt (id,name,city) values(?,?,?)";
		int update = jt.update(sql,st.getId(),st.getName(),st.getCity());
		return update ;
	}
	
	public List<Student> findAll(){
		
		String sql = "select * from studentt";
		List<Student> list = jt.query(sql, new StudentMapper());
		return list;
		
	}

}
