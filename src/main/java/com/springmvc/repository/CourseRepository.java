package com.springmvc.repository;

import com.springmvc.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository implements CrudRepository<Course>{
	@Override
	public List<Course> findAll() {
		List<Course> courses = new ArrayList<>();
		Course springBoot = new Course(1,
				"Getting started with SpringBoot 2",
				"learning Spring",
				"https://www.google.com");
		courses.add(springBoot);
		return courses;
	}
}
