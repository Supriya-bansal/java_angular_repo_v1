/**
 * 
 */
package configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Supriya
 *
 */
@ComponentScan("controller")
@SpringBootApplication  
public class ApplicationInitializer{  
    public static void main(String[] args) {  
        SpringApplication.run(ApplicationInitializer.class, args);  
    }  
}
