package com.zyf.notebook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/*
@MapperScan(basePackages = {"com.zyf.notebook.mapper"})
*/
public class NotebookApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder createSpringApplicationBuilder() {
        return super.createSpringApplicationBuilder();
    }

    public static void main(String[] args) {
        SpringApplication.run(NotebookApplication.class, args);
    }

}
