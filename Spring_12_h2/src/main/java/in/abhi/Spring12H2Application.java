package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring12H2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring12H2Application.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		Student s = new Student();
		s.setStuId(102);
		s.setStuName("abhi");
		
		repo.save(s);
	}

}
