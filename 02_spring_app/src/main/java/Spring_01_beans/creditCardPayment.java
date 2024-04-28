package Spring_01_beans;

import org.springframework.stereotype.Component;

@Component("ccp")
public class creditCardPayment implements IPayment {
//	public creditCardPayment() {
//		System.out.println("creditCardPayment::constructor");
//	}

	@Override
	public boolean pay(double amt) {
		System.out.println("CreditCardPayment....processing");
		return true;
	}

}
