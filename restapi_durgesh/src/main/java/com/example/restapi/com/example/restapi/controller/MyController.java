package com.example.restapi.com.example.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.com.example.restapi.entity.Course;
import com.example.restapi.com.example.restapi.service.CourseService;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		return "this is home page";
	}
	
	@Autowired 
	private CourseService courseService;
	
	// get the courses
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();	
	}
	
	@GetMapping("/courses/{courseID}")
	public Course getCourse1(@PathVariable String courseID) {
		
		return this.courseService.getCourse1(Long.parseLong(courseID));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	@DeleteMapping("/courses/{courseID}")
	public List<Course> deleteCourse(@PathVariable String courseID) {
		return this.courseService.deleteCourse(Long.parseLong(courseID));
	}
}
