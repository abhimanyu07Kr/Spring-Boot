package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.abhi.Service.AppService;

@SpringBootApplication
public class Spring41AssociationOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring41AssociationOneToManyApplication.class, args);
		AppService service = context.getBean(AppService.class);
//		service.save();
		service.delete();
	}

}
