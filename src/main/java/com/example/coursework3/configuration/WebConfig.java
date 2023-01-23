package com.example.coursework3.configuration;

import com.example.coursework3.components.SizeConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new SizeConverter());
    }

}
