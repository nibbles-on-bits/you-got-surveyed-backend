package com.nibblesonbits.yougotsurveyed;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    private final long MAX_AGE = 3600;
 
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("http://216.194.120.70:18080/survey/**")
        //registry.addMapping("http://localhost:8080/survey/**")
        //registry.addMapping("http://localhost:8080/survey")
        //registry.addMapping("http://6fb1059f.ngrok.io/survey/**")
                //.allowedOrigins("http://localhost:3000")
                .allowedOrigins("http://216.194.120.70:13000")
                .allowedMethods("HEAD", "OPTIONS", "GET", "POST", "PUT", "PATCH", "DELETE")
                .allowedHeaders("*")
                //.allowedHeaders("Content-Type", "X-Requested-With", "accept", "Origin", "Access-Control-Request-Method",
                //        "Access-Control-Request-Headers")
                .exposedHeaders("Access-Control-Allow-Origin", "Access-Control-Allow-Credentials")
                .maxAge(MAX_AGE);
    }
}