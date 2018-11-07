package com.springlearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.springlearn.convertor.AppTypeConvertor;

@Configuration
public class MyWebConfig extends WebMvcConfigurerAdapter{

	public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new AppTypeConvertor());
    }
}
