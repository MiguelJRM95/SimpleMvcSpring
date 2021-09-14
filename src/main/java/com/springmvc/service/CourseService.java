package com.springmvc.service;

import com.springmvc.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseService implements  CrudService<Course>{

	private List<Course> courses;

	public CourseService() {
		courses = new ArrayList<>();
		Course springBoot = new Course(1,
				"Getting started with SpringBoot 2",
				"learning Spring",
				"https://www.google.com");
		courses.add(springBoot);
	}


	@Override
	public List<Course> list() {
		return courses;
	}

	@Override
	public Course create(Course course) {
		return null;
	}

	@Override
	public Optional<Course> get(int id) {
		return Optional.empty();
	}

	@Override
	public void update(Course course, int id) {

	}

	@Override
	public void delete(int id) {

	}
}
