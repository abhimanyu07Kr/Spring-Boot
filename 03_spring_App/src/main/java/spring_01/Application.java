package spring_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext
		context=SpringApplication.run(Application.class, args);
		UserService us=context.getBean(UserService.class);
		us.start("abhi", "Abhi@gmail.com", 47883689);
	}
}
