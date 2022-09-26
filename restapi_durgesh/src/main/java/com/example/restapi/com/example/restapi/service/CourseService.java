package com.example.restapi.com.example.restapi.service;

import java.util.List;

import com.example.restapi.com.example.restapi.entity.Course;

public interface CourseService {

	public List<Course> getCourses();
	
	public Course getCourse1(long courseID);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public List<Course> deleteCourse(long courseID);
}
