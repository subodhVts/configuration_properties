package in.ashokit.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

public class StudentRowIteratot implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student st =null;
		while(rs.next()) {
			 st = new Student(rs.getInt("id"),rs.getNString("name"),rs.getNString("city"));
		}
		return st;
	}

	
}
