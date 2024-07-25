package componentscanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

        System.out.println(context.containsBean("collegeBean"));

        College college = (College) context.getBean("collegeBean");
        college.test();
    }
}
