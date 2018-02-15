package com.finance;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Supriya
 *
 */

@SpringBootApplication  
public class ApplicationInitializer extends SpringBootServletInitializer{  
    public static void main(String[] args) {  
        SpringApplication.run(ApplicationInitializer.class, args);  
    }  
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ApplicationInitializer.class);
	}
}
