package Spring_01_beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class paymentProcess {
	@Autowired
	@Qualifier("ccp")
	private IPayment payment;
	
//	@Qualifier("ccp")
//	public paymentProcess(IPayment payment) {
//		this.payment=payment;
//	}	
//	@Autowired
//	@Qualifier("ccp")
//	public void setPayment(IPayment payment) {
//		this.payment = payment;
//		System.out.println("setter injection permform.....");
//	}



	public void processPayment(double amt)
	{
		boolean b1=payment.pay(amt);
		if (b1) {
			System.out.println("payment sucessful");
		}else
			System.out.println("payment deline...");
	}

}
