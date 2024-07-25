package dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Config.xml");
	         PaymentService paymentService=(PaymentService) applicationContext.getBean("PaymentService");
	paymentService.processPayment();
	

	}

}
