package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.abhi.service.EmpService;

@SpringBootApplication
public class Spring15Jpa2table2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring15Jpa2table2Application.class, args);
		EmpService emp = context.getBean(EmpService.class);
		
		emp.save();
		
	}

}
