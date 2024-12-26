package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.abhi.Service.PersonService;

@SpringBootApplication
public class Spring40AssociationOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring40AssociationOneToOneApplication.class, args);
		PersonService bean = context.getBean(PersonService.class);
		bean.saveEntity();
	}

}
