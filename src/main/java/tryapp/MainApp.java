package tryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import tryapp.filter.TestFilter;

import java.util.Arrays;

@SpringBootApplication
public class MainApp {
	public static void main(String[] args) {
        SpringApplication.run(MainApp.class, args);	
        }

    @Bean
    FilterRegistrationBean myFilterRegistration2 () {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new TestFilter("MyFilter-2"));
        frb.setUrlPatterns(Arrays.asList("/user/*"));
        return frb;
    }

    @Bean
    FilterRegistrationBean myFilterRegistration1 () {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new TestFilter("MyFilter-1"));
        frb.setUrlPatterns(Arrays.asList("/users"));
        return frb;
    }


}
