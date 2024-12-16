package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring17Mvc21Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring17Mvc21Application.class, args);
		EmpService empService = context.getBean(EmpService.class);
		
	}

}
