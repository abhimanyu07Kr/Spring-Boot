package in.abhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring10JpaCustomPkGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Spring10JpaCustomPkGeneratorApplication.class, args);
		
		StudentRepo bean = context.getBean(StudentRepo.class);
		Student s1 = new Student();
		s1.setStuName("abhimanyu");
		s1.setStuAge(21);
		s1.setStuDept("java");
//		s1.setStuId(101);
		
		bean.save(s1);
	}

}
