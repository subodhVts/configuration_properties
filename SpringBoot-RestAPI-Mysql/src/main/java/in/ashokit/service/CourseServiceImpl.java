package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Course;
import in.ashokit.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepo repo;

	@Override
	public String upsert(Course course) {
		Course save = repo.save(course);
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> course = repo.findById(cid);
		if(course.isPresent()) {
			return course.get();
		}
		else {
			return null;
		}
		
	}

	@Override
	public List<Course> getAllCourses() {
		
	return repo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if(repo.existsById(cid)) {
			repo.deleteById(cid);
			return "deleted";
		}
		return "record not found";
	}

}
