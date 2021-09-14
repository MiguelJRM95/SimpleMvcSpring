package com.springmvc;

import com.springmvc.config.AppConfig;
import com.springmvc.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CourseService service = applicationContext.getBean("courseService", CourseService.class);
		System.out.println(service.list());
	}
}
