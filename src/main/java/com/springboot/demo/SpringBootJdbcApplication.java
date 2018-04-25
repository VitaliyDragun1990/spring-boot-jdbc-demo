package com.springboot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringBootJdbcApplication extends SpringBootServletInitializer {

	private JdbcTemplate template;

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @GetMapping("/stocks")
    public List<Map<String, Object>> stocks() {
	    return template.queryForList("SELECT * FROM stock");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootJdbcApplication.class);
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
}
