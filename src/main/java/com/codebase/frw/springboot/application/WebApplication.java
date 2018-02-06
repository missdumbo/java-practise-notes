package com.codebase.frw.springboot.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@Configuration
@ComponentScan
@SpringBootApplication
@ServletComponentScan
//@EnableAutoConfiguration(exclude={RabbitAutoConfiguration.class, DataSourceAutoConfiguration.class})
@EnableAutoConfiguration(exclude={RabbitAutoConfiguration.class, DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class WebApplication extends SpringBootServletInitializer {
    private static Class<WebApplication> applicationClass = WebApplication.class;

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(WebApplication.class);
        springApplication.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}
