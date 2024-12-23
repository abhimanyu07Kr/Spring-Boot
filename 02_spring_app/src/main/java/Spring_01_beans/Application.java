package Spring_01_beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		 paymentProcess ip=context.getBean(paymentProcess.class);
		 ip.processPayment(200.20);
	}

}
