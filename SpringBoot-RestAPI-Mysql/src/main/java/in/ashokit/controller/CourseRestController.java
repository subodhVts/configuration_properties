package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Course;
import in.ashokit.service.CourseService;

@RestController
public class CourseRestController {
 @Autowired
  private CourseService courseService;
 
 @PostMapping("/saveCourse")
 public ResponseEntity<String> createCourse(@RequestBody Course course){
	 String upsert = courseService.upsert(course);
	 
	 return new  ResponseEntity<String>(upsert,HttpStatus.CREATED);
	 
 }
 
 
 @GetMapping("/getcourse/{cid}")
 public ResponseEntity<Course> getCourseByid(@PathVariable Integer cid){
	 Course course = courseService.getById(cid); 
	 return new ResponseEntity<>(course,HttpStatus.OK);
}
 
 @GetMapping("/Courses")
 public ResponseEntity<List<Course>> getAll(){
	 List<Course> allCourses = courseService.getAllCourses();
	 return new ResponseEntity<List<Course>>(allCourses,HttpStatus.OK);
 }
 
 
 @PutMapping("/Course")
 public ResponseEntity<String>updateCourse(@RequestBody Course course){
	 String upsert = courseService.upsert(course);
	 return new ResponseEntity<>(upsert,HttpStatus.OK);
 }
 @DeleteMapping("/getcourse/{cid}")
 public ResponseEntity<String> deleteCourseByid(@PathVariable Integer cid){
	 String deleteById = courseService.deleteById(cid); 
	 return new ResponseEntity<String>(deleteById,HttpStatus.OK);
}

}
