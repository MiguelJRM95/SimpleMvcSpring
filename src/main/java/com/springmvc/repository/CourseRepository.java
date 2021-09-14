package com.springmvc.repository;

import com.springmvc.model.Course;

import java.util.List;

public class CourseRepository implements CrudRepository<Course>{
	@Override
	public List<Course> findAll() {
		return null;
	}
}
