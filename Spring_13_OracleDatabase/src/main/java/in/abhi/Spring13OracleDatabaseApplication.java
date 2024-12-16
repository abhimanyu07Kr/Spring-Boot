package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring13OracleDatabaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring13OracleDatabaseApplication.class, args);
		StudentRepo repo = context.getBean(StudentRepo.class);
		Student s1 = new Student();
		s1.setStuage(21);
		s1.setStuName("abhimanyu");
		repo.save(s1);
	}

}
