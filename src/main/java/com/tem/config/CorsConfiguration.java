package com.tem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer
{
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedMethods("GET", "POST","OPTIONS");
//    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() 
    {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");//"http://localhost:8080","http://localhost:3000");
            }
        };
    }
//    spring.datasource.url=jdbc:postgresql://postgres.cez7fi3rxuwi.us-east-2.rds.amazonaws.com:5432/postgres
//    	spring.datasource.username=postgres
//    	spring.datasource.password=root1234  

}
