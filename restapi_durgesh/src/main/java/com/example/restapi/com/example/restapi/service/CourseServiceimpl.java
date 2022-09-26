package com.example.restapi.com.example.restapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.restapi.com.example.restapi.entity.Course;

import net.bytebuddy.asm.Advice.This;

@Service
public class CourseServiceimpl implements CourseService{

	List<Course> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Course(1666, "physicdL", "Working on physics"));
		list.add(new Course(1777, "chemistry", "working on chem"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}
	
	@Override
	public Course getCourse1(long courseID) {
		
		Course c = null;
		for(Course course : list) {
			if(course.getId() == courseID) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		list.forEach(e -> {
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		} );
		
		return course;
	}

	@Override
	public List<Course> deleteCourse(long courseID) {
		
		list = this.list.stream().filter(e -> e.getId() != courseID).collect(Collectors.toList());
		return list;
	}

}
