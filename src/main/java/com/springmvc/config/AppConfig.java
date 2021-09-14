package com.springmvc.config;

import com.springmvc.repository.CourseRepository;
import com.springmvc.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springmvc")
public class AppConfig {

//	@Bean("courseRepository")
//	public CourseRepository getCourseRepository(){
//		return new CourseRepository();
//	}
//
//	@Bean("courseService")
//	public CourseService getCourseService(){
//		return new CourseService(getCourseRepository());
//	}

}
