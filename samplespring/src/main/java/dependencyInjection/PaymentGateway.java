package dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway 
{
	public void processPayment(double amount)
	{
		System.out.println("payment processed for "+amount);
		
	}

}
