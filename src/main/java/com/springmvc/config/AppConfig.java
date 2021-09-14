package com.springmvc.config;

import com.springmvc.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("courseService")
	public CourseService getCourseService(){
		return new CourseService();
	}
}
