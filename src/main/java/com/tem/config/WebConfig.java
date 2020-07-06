//package com.tem.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.resource.EncodedResourceResolver;
//import org.springframework.web.servlet.view.InternalResourceView;
//import org.springframework.web.servlet.view.UrlBasedViewResolver;
//
///**
//*  Author Abdulla Shariff -> abdullashariff21@gmail.com
//*/
//
//@Configuration
//@EnableWebMvc
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**")
//        .addResourceLocations("classpath:/static/build/")
//        .addResourceLocations("classpath:/static/build/static")
//        .setCachePeriod(3600)
//        .resourceChain(true)
//        .addResolver(new EncodedResourceResolver());
//        super.addResourceHandlers(registry);
//    }
//
//    @Bean
//    public ViewResolver viewResolver() {
//        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
//        viewResolver.setViewClass(InternalResourceView.class);
//        return viewResolver;
//    }
//
//}
