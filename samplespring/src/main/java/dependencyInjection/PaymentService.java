package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService 
{
	@Autowired
private PaymentGateway paymentGateway;
private double defaultpaymentAmount;
public PaymentService(PaymentGateway paymentGateway, double defaultpaymentAmount) {
	super();
	this.paymentGateway = paymentGateway;
	this.defaultpaymentAmount = defaultpaymentAmount;
}

public void processPayment()

{
	paymentGateway.processPayment(defaultpaymentAmount);
}
}
