package com.nibblesonbits.yougotsurveyed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class YougotsurveyedApplication {
	public static void main(String[] args) {
		SpringApplication.run(YougotsurveyedApplication.class, args);
		/*final ApplicationContext ctx = SpringApplication.run(YougotsurveyedApplication.class, args);
		final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
    	annotationConfigApplicationContext.register(CORSConfig.class);
    	annotationConfigApplicationContext.refresh();*/
	}

}
