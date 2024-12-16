package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring11JpaCompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring11JpaCompositePrimaryKeyApplication.class, args);
		
		BookService bean = context.getBean(BookService.class);
		bean.save();
		bean.find();
	}

}
