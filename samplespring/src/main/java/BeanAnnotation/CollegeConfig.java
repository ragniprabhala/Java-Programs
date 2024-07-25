package BeanAnnotation;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig 
{
	@Bean
	public College collegeBean()
    {
 
        // Returns the College class object
        return new College();
    }

}
