package spring_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context
		=SpringApplication.run(Application.class, args);
		car car=context.getBean(car.class);
		car.Drive();
		Bike bike=context.getBean(Bike.class);
		bike.Work();
	}

}
 