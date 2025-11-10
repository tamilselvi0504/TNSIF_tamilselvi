package module.user;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfiguration implements WebMvcConfigurer { 

//Cross-Origin Response Sharing
	    @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        // Allow all origins or specify the frontend URL (e.g., http://localhost:4200)
	        registry.addMapping("/**")
	                .allowedOrigins("http://localhost:4200")  // Allow the frontend URL
	                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
	                .allowedHeaders("*");
	    }
	}



